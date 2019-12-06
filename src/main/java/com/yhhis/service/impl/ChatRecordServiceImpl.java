package com.yhhis.service.impl;


import com.yhhis.common.entity.ChatRecord;
import com.yhhis.dao.ChatRecordDao;
import com.yhhis.service.ChatRecordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ChatRecordServiceImpl implements ChatRecordService {

    @Autowired
    private ChatRecordDao chatRecordDao;

    @Override
    public boolean addChatRecord(ChatRecord chatRecord) {
        try {
            int rec = chatRecordDao.addChatRecord(chatRecord);
            if (rec > 0) {
                return true;
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return false;
    }

    @Override
    public boolean putChatRecordPatStatus(int patStatus, int id, String sender, String receiver) {

        try {
            int chat = chatRecordDao.putChatRecordPatStatus(patStatus, id, sender, receiver);
            if (chat > 0) {
                return true;
            }

        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return false;
    }

    @Override
    public boolean putChatRecordDocStatus(int docStatus, int id, String sender, String receiver) {
        try {
            int chat = chatRecordDao.putChatRecordDocStatus(docStatus, id, sender, receiver);
            if (chat > 0) {
                return true;
            }

        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return false;
    }

    @Override
    public List<ChatRecord> getChatRecord(int cpsid) {
        return chatRecordDao.getChatRecord(cpsid);
    }
}
