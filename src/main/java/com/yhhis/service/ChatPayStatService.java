package com.yhhis.service;


import com.yhhis.common.entity.ChatPayStat;

import java.sql.Timestamp;
import java.util.List;
import java.util.Map;

public interface ChatPayStatService {

    public Map<String, Object> addChatPayStat(ChatPayStat payStat);


    /**
     * 患者修改聊天列表的状态
     *
     * @param id
     * @param cardno
     * @param doccode
     * @return
     */
    public boolean putChatPayStatPatStatus(int id, String cardno, String doccode);

    /**
     * 医生修改聊天列表的状态
     *
     * @param id
     * @param cardno
     * @param doccode
     * @return
     */
    public boolean putChatPayStatDocStatus(int id, String cardno, String doccode);

    /**
     * 聊天结束
     *
     * @param id
     * @param cardno
     * @param doccode
     * @param endTime
     * @return
     */
    public boolean chatEnd(int id, String cardno, String doccode, Timestamp endTime);


    /**
     * 获取患者聊天列表
     *
     * @param cardno
     * @return
     */
    public List<ChatPayStat> getPatChatPayStatList(String cardno);

    /**
     * 医生获取聊天列表
     *
     * @param docCode
     * @return
     */
    public List<ChatPayStat> getDocChatPayStatList(String docCode);


}
