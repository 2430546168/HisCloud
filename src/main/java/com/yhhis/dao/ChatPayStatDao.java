package com.yhhis.dao;

import com.yhhis.common.entity.ChatPayStat;
import org.apache.ibatis.annotations.Param;

import java.sql.Timestamp;
import java.util.List;
import java.util.Map;

public interface ChatPayStatDao {

    /**
     * 添加聊天付费统计
     *
     * @param payStat
     * @return
     */
    public int addChatPayStat(ChatPayStat payStat);


    /**
     * 获取改聊天订单的id
     *
     * @param cardno
     * @param docCode
     * @param payTime
     * @return
     */
    public Map<String, Object> getChatPayStatId(@Param("cardno") String cardno,
                                                @Param("docCode") String docCode, @Param("payTime") Timestamp payTime);

    /**
     * 患者修改聊天列表的状态
     *
     * @param id
     * @param cardno
     * @param doccode
     * @return
     */
    public int putChatPayStatPatStatus(@Param("id") int id, @Param("cardno") String cardno, @Param("doccode") String doccode);

    /**
     * 医生修改聊天列表的状态
     *
     * @param id
     * @param cardno
     * @param doccode
     * @return
     */
    public int putChatPayStatDocStatus(@Param("id") int id, @Param("cardno") String cardno, @Param("doccode") String doccode);

    /**
     * 聊天结束
     *
     * @param id
     * @param cardno
     * @param doccode
     * @return
     */
    public int chatEnd(@Param("id") int id, @Param("cardno") String cardno, @Param("doccode") String doccode,
                       @Param("endTime") Timestamp endTime);

    /**
     * 获取患者聊天列表
     *
     * @param cardno
     * @return
     */
    public List<ChatPayStat> getPatChatPayStatList(@Param("cardno") String cardno);

    /**
     * 医生获取聊天列表
     *
     * @param docCode
     * @return
     */
    public List<ChatPayStat> getDocChatPayStatList(@Param("docCode") String docCode);
}
