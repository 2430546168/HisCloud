package com.yhhis.service;

import com.yhhis.common.entity.ChatRecord;

import java.util.List;

public interface ChatRecordService {

    public boolean addChatRecord(ChatRecord chatRecord);


    /**
     * 患者修改消息状态
     *
     * @param patStatus
     * @param id
     * @param sender
     * @param receiver
     * @return
     */
    public boolean putChatRecordPatStatus(int patStatus, int id, String sender, String receiver);

    /**
     * 医生修改消息状态
     *
     * @param docStatus
     * @param id
     * @param sender
     * @param receiver
     * @return
     */
    public boolean putChatRecordDocStatus(int docStatus, int id, String sender, String receiver);


    public List<ChatRecord> getChatRecord(int cpsid);
}
