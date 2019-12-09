package com.yhhis.controller.Doctor;

import com.yhhis.common.api.CommonResult;
import com.yhhis.common.entity.ChatPayStat;
import com.yhhis.common.entity.ChatRecord;
import com.yhhis.service.ChatPayStatService;
import com.yhhis.service.ChatRecordService;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.sql.Timestamp;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("chat")
public class ChatController {

    private static final org.slf4j.Logger LOGGER = LoggerFactory.getLogger(ChatController.class);

    @Autowired
    private ChatRecordService chatRecordService;

    @Autowired
    private ChatPayStatService chatPayStatService;

    /**
     * 添加聊天订单
     *
     * @return
     */
    @RequestMapping("/addchatpaystat")
    @ResponseBody
    public CommonResult addChatPayStat(@RequestBody ChatPayStat payStat) {
        CommonResult commonResult;
//        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
//        String time = df.format(new Date());
//        Timestamp ts = Timestamp.valueOf(time);
//        ChatPayStat payStat = new ChatPayStat("123456", "666666", 45.66, 1, ts, 1, 1);
        Map<String, Object> stringObjectMap = chatPayStatService.addChatPayStat(payStat);
        if (stringObjectMap != null) {
            commonResult = CommonResult.success(payStat);
            LOGGER.debug("addChatPayStat success:{}", payStat);
        } else {
            commonResult = CommonResult.failed("操作失败");
            LOGGER.debug("addChatPayStat failed:{}", payStat);
        }
        return commonResult;
    }

    /**
     * 添加消息记录
     *
     * @return
     */
    @RequestMapping("/addchatrecord")
    @ResponseBody
    public CommonResult addChatRecord(@RequestBody ChatRecord chatRecord) {
        CommonResult commonResult;
        boolean flag = chatRecordService.addChatRecord(chatRecord);
        if (flag) {
            commonResult = CommonResult.success(chatRecord);
            LOGGER.debug("addChatRecord success:{}", chatRecord);
        } else {
            commonResult = CommonResult.failed("操作失败");
            LOGGER.debug("addChatRecord failed:{}", chatRecord);
        }
        return commonResult;
    }

    /**
     * 患者修改订单状态 0删除  1显示
     *
     * @param id
     * @param cardno
     * @param doccode
     * @return
     */
    @RequestMapping("/putchatpaystatpatstatus")
    @ResponseBody
    public CommonResult putChatPayStatPatStatus(@RequestParam("id") Integer id, @RequestParam("cardno") String cardno, @RequestParam("doccode") String doccode) {
        CommonResult commonResult;
        boolean flag = chatPayStatService.putChatPayStatPatStatus(id, cardno, doccode);
        if (flag) {
            commonResult = CommonResult.success(flag);
            LOGGER.debug("putchatpaystatpatstatus success:{}", flag);
            return commonResult;
        } else {
            commonResult = CommonResult.failed("操作失败");
            LOGGER.debug("putchatpaystatpatstatus failed:{}", flag);
            return commonResult;
        }
    }

    /**
     * 医生修改订单状态 0删除  1显示
     *
     * @param id
     * @param cardno
     * @param doccode
     * @return
     */
    @RequestMapping("/putchatpaystatdocstatus")
    @ResponseBody
    public CommonResult putChatPayStatDocStatus(@RequestParam("id") Integer id, @RequestParam("cardno") String cardno, @RequestParam("doccode") String doccode) {
        CommonResult commonResult;
        boolean flag = chatPayStatService.putChatPayStatDocStatus(id, cardno, doccode);
        if (flag) {
            commonResult = CommonResult.success(flag);
            LOGGER.debug("putchatpaystatdocstatus success:{}", flag);
            return commonResult;
        } else {
            commonResult = CommonResult.failed("操作失败");
            LOGGER.debug("putchatpaystatdocstatus failed:{}", flag);
            return commonResult;
        }
    }

    /**
     * 聊天结束
     *
     * @param id
     * @param cardno
     * @param doccode
     * @param endTime
     * @return
     */
    @RequestMapping("/chatend")
    @ResponseBody
    public CommonResult chatEnd(@RequestParam("id") Integer id, @RequestParam("cardno") String cardno, @RequestParam("doccode") String doccode, @RequestParam("endTime") String endTime) {
        CommonResult commonResult;
        Timestamp endtime = Timestamp.valueOf(endTime);
        boolean flag = chatPayStatService.chatEnd(id, cardno, doccode, endtime);
        if (flag) {
            commonResult = CommonResult.success(flag);
            LOGGER.debug("chatend success:{}", flag);
            return commonResult;
        } else {
            commonResult = CommonResult.failed("操作失败");
            LOGGER.debug("chatend failed:{}", flag);
            return commonResult;
        }
    }

    /**
     * 患者修改聊天记录显示状态  0删除   1显示   2撤回
     *
     * @param patStatus
     * @param id
     * @param sender
     * @param receiver
     * @return
     */
    @RequestMapping("/putchatrecordpatstatus")
    @ResponseBody
    public CommonResult putChatRecordPatStatus(@RequestParam("patStatus") int patStatus, @RequestParam("id") int id, @RequestParam("sender") String sender, @RequestParam("receiver") String receiver) {
        CommonResult commonResult;
        boolean flag = chatRecordService.putChatRecordPatStatus(patStatus, id, sender, receiver);
        if (flag) {
            commonResult = CommonResult.success(flag);
            LOGGER.debug("putchatrecordpatstatus success:{}", flag);
            return commonResult;
        } else {
            commonResult = CommonResult.failed("操作失败");
            LOGGER.debug("putchatrecordpatstatus failed:{}", flag);
            return commonResult;
        }
    }


    /**
     * 医生修改聊天记录显示状态  0删除   1显示   2撤回
     *
     * @param docStatus
     * @param id
     * @param sender
     * @param receiver
     * @return
     */
    @RequestMapping("/putchatrecorddocstatus")
    @ResponseBody
    public CommonResult putChatRecordDocStatus(@RequestParam("docStatus") int docStatus, @RequestParam("id") int id, @RequestParam("sender") String sender, @RequestParam("receiver") String receiver) {
        CommonResult commonResult;
        boolean flag = chatRecordService.putChatRecordDocStatus(docStatus, id, sender, receiver);
        if (flag) {
            commonResult = CommonResult.success(flag);
            LOGGER.debug("putchatrecorddocstatus success:{}", flag);
            return commonResult;
        } else {
            commonResult = CommonResult.failed("操作失败");
            LOGGER.debug("putchatrecorddocstatus failed:{}", flag);
            return commonResult;
        }
    }

    /**
     * 获取患者消息列表
     *
     * @param cardno
     * @return
     */
    @RequestMapping("/getpatchatpaystatlist")
    @ResponseBody
    public CommonResult getPatChatPayStatList(@RequestParam("cardno") String cardno) {
        CommonResult commonResult;
        List<ChatPayStat> patChatPayStatList = chatPayStatService.getPatChatPayStatList(cardno);
        if (patChatPayStatList != null) {
            commonResult = CommonResult.success(patChatPayStatList);
            LOGGER.debug("getpatchatpaystatlist success:{}", patChatPayStatList);
            return commonResult;
        } else {
            commonResult = CommonResult.failed("操作失败");
            LOGGER.debug("getpatchatpaystatlist failed:{}", patChatPayStatList);
            return commonResult;
        }
    }


    /**
     * 获取医生消息列表
     *
     * @param docCode
     * @return
     */
    @RequestMapping("/getdocchatpaystatlist")
    @ResponseBody
    public CommonResult getDocChatPayStatList(@RequestParam("docCode") String docCode) {
        CommonResult commonResult;
        List<ChatPayStat> docChatPayStatList = chatPayStatService.getDocChatPayStatList(docCode);
        if (docChatPayStatList != null) {
            commonResult = CommonResult.success(docChatPayStatList);
            LOGGER.debug("getdocchatpaystatlist success:{}", docChatPayStatList);
            return commonResult;
        } else {
            commonResult = CommonResult.failed("操作失败");
            LOGGER.debug("getdocchatpaystatlist failed:{}", docChatPayStatList);
            return commonResult;
        }
    }


    /**
     * 获取聊天记录
     *
     * @param cpsid
     * @return
     */
    @RequestMapping("/getchatrecord")
    @ResponseBody
    public CommonResult getChatRecord(@RequestParam("cpsid") int cpsid) {
        CommonResult commonResult;
        List<ChatRecord> chatRecord = chatRecordService.getChatRecord(cpsid);
        if (chatRecord != null) {
            commonResult = CommonResult.success(chatRecord);
            LOGGER.debug("getchatrecord success:{}", chatRecord);
            return commonResult;
        } else {
            commonResult = CommonResult.failed("操作失败");
            LOGGER.debug("getchatrecord failed:{}", chatRecord);
            return commonResult;
        }
    }
}