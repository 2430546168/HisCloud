package com.yhhis.controller.Doctorend;

import com.yhhis.common.api.CommonResult;
import com.yhhis.service.DoctorFollowService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;
import java.util.Map;

/**
 * 被患者关注的医生
 * 医生下的粉丝
 *
 * @author fengxian
 */
@Controller
@RequestMapping("DoctorFollow")
public class DoctorFollowController {
    private static final Logger LOGGER = LoggerFactory.getLogger(CheckController.class);

    @Autowired
    DoctorFollowService doctorFollowService;

    /**
     * 医生的粉丝
     *
     * @param doccode
     * @param size
     * @return
     */
    @RequestMapping(value = "/DoctorsFans", method = RequestMethod.POST)
    @ResponseBody
    public CommonResult DoctorsFans(@RequestParam("doccode") String doccode, @RequestParam("size") Integer size) {
        CommonResult commonResult;
        List<Map<String, Object>> info = doctorFollowService.getDoctorsFans(doccode, size);
        if (info != null) {
            commonResult = CommonResult.success(info);
            LOGGER.debug("DoctorsFans success:{}", info);
        } else {
            commonResult = CommonResult.failed("操作失败");
            LOGGER.debug("DoctorsFans failed:{}", info);
        }
        return commonResult;
//        Map<String, Object> map = new HashMap<String, Object>();
//        PrintWriter writer = null;
//        try {
//            writer = response.getWriter();
//            List<Map<String, Object>> info = doctorFollowService.getDoctorsFans(doccode, size);
//            if (info != null && info.size() > 0) {
//                map.put(ReturnCode.data, info);
//                map.put(ReturnCode.message, "获取评论信息成功。");
//                map.put(ReturnCode.status, "1");
//            } else {
//                map.put(ReturnCode.data, "");
//                map.put(ReturnCode.message, "暂无评论信息!");
//                map.put(ReturnCode.status, "0");
//            }
//        } catch (Exception e) {
//            map.put(ReturnCode.data, "");
//            map.put(ReturnCode.message, "获取评论信息异常。");
//            map.put(ReturnCode.status, "-1");
//            logger.info("url:EvaluationCenter。message:医生端的评论中心信息异常。===请到日志中查询异常信息。===");
//            logger.error(e.getMessage(), e);
//        } finally {
//            writer.print(JSON.toJSONString(map));
//            writer.flush();
//            writer.close();
//        }
    }
}
