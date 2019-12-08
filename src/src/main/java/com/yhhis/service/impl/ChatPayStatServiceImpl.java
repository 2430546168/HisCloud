package com.yhhis.service.impl;

import com.yhhis.common.entity.ChatPayStat;
import com.yhhis.dao.ChatPayStatDao;
import com.yhhis.service.ChatPayStatService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.Timestamp;
import java.util.List;
import java.util.Map;

@Service
public class ChatPayStatServiceImpl implements ChatPayStatService {


    @Autowired()
    private ChatPayStatDao chatPayStatDao;

    /**
     * 添加聊天订单
     *
     * @param payStat
     * @return
     */
    @Override
    public Map<String, Object> addChatPayStat(ChatPayStat payStat) {
        try {
            int stat = chatPayStatDao.addChatPayStat(payStat);
            if (stat > 0) {
                //获取聊天订单的id
                Map<String, Object> chatPayStatId = chatPayStatDao.getChatPayStatId(payStat.getCardno(),
                        payStat.getDocCode(), payStat.getPayTime());
                if (chatPayStatId != null && chatPayStatId.size() > 0) {
                    return chatPayStatId;
                }
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return null;
    }

    /**
     * 修改患者消息列表状态
     *
     * @param id
     * @param cardno
     * @param doccode
     * @return
     */
    @Override
    public boolean putChatPayStatPatStatus(int id, String cardno, String doccode) {
        try {
            int chat = chatPayStatDao.putChatPayStatPatStatus(id, cardno, doccode);
            if (chat > 0) {
                return true;
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return false;
    }

    /**
     * 修改医生消息列表状态
     *
     * @param id
     * @param cardno
     * @param doccode
     * @return
     */
    @Override
    public boolean putChatPayStatDocStatus(int id, String cardno, String doccode) {
        try {
            int chat = chatPayStatDao.putChatPayStatDocStatus(id, cardno, doccode);
            if (chat > 0) {
                return true;
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return false;
    }

    /**
     * 聊天结束
     *
     * @param id
     * @param cardno
     * @param doccode
     * @return
     */
    @Override
    public boolean chatEnd(int id, String cardno, String doccode, Timestamp endTime) {
        try {
            int chat = chatPayStatDao.chatEnd(id, cardno, doccode, endTime);
            if (chat > 0) {
                return true;
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return false;
    }

    @Override
    public List<ChatPayStat> getPatChatPayStatList(String cardno) {
        return chatPayStatDao.getPatChatPayStatList(cardno);

    }

    @Override
    public List<ChatPayStat> getDocChatPayStatList(String docCode) {
        return chatPayStatDao.getDocChatPayStatList(docCode);
    }


}
