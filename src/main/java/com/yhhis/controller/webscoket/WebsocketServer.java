package com.yhhis.controller.webscoket;

import net.sf.json.JSONObject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;

import javax.websocket.*;
import javax.websocket.server.PathParam;
import javax.websocket.server.ServerEndpoint;
import java.io.IOException;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @Description: 简单websocket demo *
 */
@ServerEndpoint(value = "/websocketTest/{userId}")//@ServerEndpoint把当前类变成websocket服务类
@Controller
public class WebsocketServer {
    //静态变量，用来记录当前在线连接数。应该把它设计成线程安全的。
    private static int onlineCount = 0;
    //    //concurrent包的线程安全Set，用来存放每个客户端对应的MyWebSocket对象。若要实现服务端与单一客户端通信的话，可以使用Map来存放，其中Key可以为用户标识
//    private static CopyOnWriteArraySet<WebsocketServer> webSocketSet = new CopyOnWriteArraySet<WebsocketServer>();
    //实现服务端与单一客户端通信的话，可以使用Map来存放，其中Key为用户标识
    private static Map<String, WebsocketServer> connections = new ConcurrentHashMap<>();
    private Logger logger = LoggerFactory.getLogger(WebsocketServer.class);
    //与某个客户端的连接会话，需要通过它来给客户端发送数据
    private Session session;

    private String socketId;

    public static synchronized int getOnlineCount() {
        return onlineCount;
    }

    public static synchronized void addOnlineCount() {
        WebsocketServer.onlineCount++;
    }

    public static synchronized void subOnlineCount() {
        WebsocketServer.onlineCount--;
    }

    // 连接时执行
    @OnOpen
    public void onOpen(@PathParam("userId") String userId, Session session) throws IOException {
//        this.session = session;
//        webSocketSet.add(this);     //加入set中
//        addOnlineCount();           //在线数加1
//        System.out.println("有新连接加入！当前在线人数为" + getOnlineCount());
        this.session = session;
//        String[] arr = userId.split(",");
//        this.role = arr[0];             //用户标识
        this.socketId = userId;         //会话标识
        connections.put(userId, this);     //添加到map中
        addOnlineCount();               // 在线数加
        System.out.println("有新连接加入！新用户：" + userId + ",当前在线人数为" + getOnlineCount());
    }

    // 关闭时执行
    @OnClose
    public void onClose(@PathParam("userId") String userId) {
//        webSocketSet.remove(this);  //从set中删除
//        subOnlineCount();           //在线数减1
//        System.out.println("有一连接关闭！当前在线人数为" + getOnlineCount());
        connections.remove(userId);  // 从map中移除
        subOnlineCount();          // 在线数减
        System.out.println("有一连接关闭！当前在线人数为" + getOnlineCount());
    }

//    /******
//     *  给某个用户发送消息
//     * @Param userName 发消息的name
//     * **/
//    private void sendMessageToUser(String userName, String receiveName, String message) {
//        Set<String> users = onlines.keySet();
//        for (String user : users) {
//            if (user.equals(receiveName)) {
//                try {
//                    if (onlines.get(user).isOpen()) {
//                        System.out.println("user---" + user);
//                        ((Session) onlines.get(user)).getBasicRemote().sendText(message);
////                        redisService.set(userName+"_"+receiveName,message);
//                    }
//                } catch (IOException e) {
//                    e.printStackTrace();
//                }
//                break;
//            }
//        }
//    }

    /**
     * 收到客户端消息后调用的方法
     *
     * @param message 客户端发送消息
     * @param session 可选的参数
     * @param userId
     * @throws IOException
     */
    @OnMessage(maxMessageSize = 10240000)
    public void onMessage(String message, Session session, @PathParam("userId") String userId) throws IOException {
        System.out.println("来自" + userId + "的消息:" + message);
        JSONObject json = JSONObject.fromObject(message);
//        String string = null;  //需要发送的信息
        String to = null;      //发送对象的用户标识
//        if (json.has("content")) {
//            string = (String) json.get("content");
//        }
        if (json.has("to")) {
            to = (String) json.get("to");
        }
        sendMessage(userId, to, socketId, message);
//        //群发消息
//        for (WebsocketServer item : webSocketSet) {
//            try {
//                item.sendMessage(message);
//            } catch (IOException e) {
//                e.printStackTrace();
//                continue;
//            }
//        }
//        JSONObject msgJson = JSONObject.fromObject(message);
//        String msg = msgJson.getString("content");
//        logger.debug("收到用户{}的消息{}", userId, msgJson);
//        RemoteEndpoint.Basic basicRemote = session.getBasicRemote();
//        basicRemote.sendText(msg); //回复用户
//        WebsocketServer toClient;
////        if (msgJson.getString("datatype").equals("host")) {
////            this.host = msgJson.getString("host");
////            return;
////        }
//        System.out.println("host:" + this.host);
//        int msgfrom = 0;       //0 用户 1 医生
//        String sendMsg = "";
//        String msgid = "", sendTo = "", msg = "", dataType = "";
//        String msgDate = Util.getTime("yyyy-MM-dd HH:mm:ss");
//        String chatUrl = "";
//        System.out.println("来自" + userId + "的消息:" + message.toString());
//        sendTo = msgJson.getString("role");
//        msg = msgJson.getString("content");
//        dataType = msgJson.getString("ctxtype");
//        msgid = msgJson.getString("role");
//        msgfrom = msgJson.getInt("ctxtype");
//
//        toClient = webSocketMap.get(sendTo);
//        Message wrmsg = new Message();
//
//        sendMsg = "{'msgid':'" + msgid + "','from':'" + userId + "','msg':'" + msg + "','datatype':'" + dataType + "','date':'" + msgDate + "'}";


//        if (message.contains("&")) {
//            String[] params = message.split("&");
//            if (params[1].equals("all")) {
//                System.out.println("广播");
//                sendMessageToAll(userId + "发送广播消息:" + params[0]);
//            } else {
//                System.out.println("toUser");
////                redisService.set(userId+"_"+params[0],params[1]);
//                sendMessageToUser(userId, params[1], params[0]);
//            }
//        } else
//            session.getBasicRemote().sendText(userId + "发送消息： " + message);
//        System.out.println(onlines.toString());
    }

    /**
     * 这个方法与上面几个方法不一样。没有用注解，是根据自己需要添加的方法。
     *
     * @throws IOException
     */
    public void sendMessage(String from, String to, String socketId, String message) {
        try {
            //to指定用户
            WebsocketServer con = connections.get(to);
            if (con != null) {
//                || con.socketId.equals(socketId)
                if (socketId != con.socketId) {
                    con.session.getBasicRemote().sendText(message);
                }
            }
            //from具体用户
            WebsocketServer confrom = connections.get(from);
            if (confrom != null) {
                if (socketId == confrom.socketId || confrom.socketId.equals(socketId)) {
                    confrom.session.getBasicRemote().sendText(message);
                }
            }
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
//        JSONObject msgJson = JSONObject.fromObject(message);
            ////        String msg = msgJson.getString("content");
            ////        this.session.getBasicRemote().sendText(message);
            //        //this.session.getAsyncRemote().sendText(message);
        }
    }

    // 连接错误时执行
    @OnError
    public void onError(Session session, Throwable error) {
        System.out.println("连接发送错误");
        error.printStackTrace();
    }
}