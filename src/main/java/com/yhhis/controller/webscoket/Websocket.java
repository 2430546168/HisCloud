package com.yhhis.controller.webscoket;

import com.yhhis.common.entity.Logger;
import net.sf.json.JSONObject;
import org.springframework.stereotype.Controller;
import org.springframework.web.socket.server.standard.SpringConfigurator;
import redis.clients.jedis.Jedis;

import javax.websocket.*;
import javax.websocket.server.PathParam;
import javax.websocket.server.ServerEndpoint;
import java.io.IOException;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

@ServerEndpoint(value = "/websocket/{cardno}", configurator = SpringConfigurator.class)
@Controller
public class Websocket {
    private static int onlineCount = 0;
    private static Map<String, Websocket> clients = new ConcurrentHashMap<String, Websocket>();
    protected Logger logger = Logger.getLogger(this.getClass());
    private Session session;
    private String cardno;
    private Jedis jedis;

    public static synchronized int getOnlineCount() {
        return onlineCount;
    }

    public static synchronized void addOnlineCount() {
        Websocket.onlineCount++;
    }

    public static synchronized void subOnlineCount() {
        Websocket.onlineCount--;
    }

    public static synchronized Map<String, Websocket> getClients() {
        return clients;
    }

    @OnOpen
    public void onOpen(@PathParam("cardno") String cardno, Session session) throws IOException {
        this.session = session;
        this.cardno = cardno;
        clients.put(cardno, this);
    }

    @OnClose
    public void onClose() {
        try {
            clients.remove(cardno);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @OnMessage
    public void onMessage(String message) throws IOException {
        JSONObject jsonTo = JSONObject.fromObject(message);
        sendMessageTo(jsonTo.get("massege").toString(), jsonTo.get("cardno").toString());
    }

    @OnError
    public void onError(Session session, Throwable error) throws IOException {
        session.close();
    }

    public void sendMessageTo(String message, String To) throws IOException {
        if (message.equals("ping")) {
            for (Websocket item : clients.values()) {
                if (item.cardno.equals(To)) {
                    item.session.getBasicRemote().sendText("");
                }
            }
        } else {
            jedis = new Jedis("192.168.1.195", 9527);
            jedis.auth("Djh250");
            String i = jedis.get(To);
            if (i == null) {
                jedis.set(To, "1");
            } else {
                jedis.set(To, (Integer.parseInt(i) + 1) + "");
            }
            for (Websocket item : clients.values()) {
                if (item.cardno.equals(To) && message.equals("123")) {
                    item.session.getBasicRemote().sendText(jedis.get(To));
                }
            }
        }
    }
}
