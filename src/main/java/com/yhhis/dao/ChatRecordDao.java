package com.yhhis.dao;

import com.yhhis.common.entity.ChatRecord;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ChatRecordDao {

    /**
     * 添加聊天记录列表
     *
     * @param chatRecord
     * @return
     */
    public int addChatRecord(ChatRecord chatRecord);


    /**
     * 患者修改消息状态
     *
     * @param patStatus
     * @param id
     * @param sender
     * @param receiver
     * @return
     */
    public int putChatRecordPatStatus(@Param("patStatus") int patStatus, @Param("id") int id,
                                      @Param("sender") String sender, @Param("receiver") String receiver);

    /**
     * 医生修改消息状态
     *
     * @param docStatus
     * @param id
     * @param sender
     * @param receiver
     * @return
     */
    public int putChatRecordDocStatus(@Param("docStatus") int docStatus, @Param("id") int id,
                                      @Param("sender") String sender, @Param("receiver") String receiver);


    public List<ChatRecord> getChatRecord(int cpsId);

}
