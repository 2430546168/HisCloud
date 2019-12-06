package com.yhhis.controller.Doctorend;

import com.yhhis.common.api.CommonResult;
import com.yhhis.common.entity.DoctorEval;
import com.yhhis.service.DoctorAfterChildbirthEvalService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/DoctorAfterChildbirthEval")
public class DoctorAfterChildbirthEvalController {
    private static final Logger LOGGER = LoggerFactory.getLogger(DoctorAfterChildbirthEvalController.class);

    @Autowired
    private DoctorAfterChildbirthEvalService doctorAfterChildbirthEvalService;

    /**
     * 获取项目、评估内容、医生处理原则、评估选项
     *
     * @return
     */
    @RequestMapping(value = "/items", method = RequestMethod.POST)
    @ResponseBody
    public Map<String, List<Object>> getItems() {
        Map<String, List<Object>> map = new HashMap<>();
        List<Object> items = doctorAfterChildbirthEvalService.getItems();
        List<Object> eval = doctorAfterChildbirthEvalService.getEvaluates();
        List<Object> handlers = doctorAfterChildbirthEvalService.getHandlers();
        List<Object> assessContexts = doctorAfterChildbirthEvalService.getAssessContexts();
        map.put("items", items);
        map.put("eval", eval);
        map.put("handlers", handlers);
        map.put("assessContexts", assessContexts);
        return map;
    }


//    /**
//     * 获取评估内容
//     *
//     * @param request
//     * @param itemCode
//     * @return
//     */
//    @RequestMapping(value = "/evaluates", method = RequestMethod.POST)
//    @ResponseBody
//    public List<Object> getEvaluates(HttpServletRequest request, String itemCode) {
//        List<Object> eval = doctorAfterChildbirthEvalService.getEvaluates(itemCode);
//        return eval;
//    }
//
//    /**
//     * 获取医生处理原则
//     *
//     * @param request
//     * @param itemCode
//     * @param evalCode
//     * @return
//     */
//    @RequestMapping(value = "/handlers", method = RequestMethod.POST)
//    @ResponseBody
//    public List<Handlers> getHandlers(HttpServletRequest request, String itemCode, String evalCode) {
//        List<Handlers> handlers = doctorAfterChildbirthEvalService.getHandlers(itemCode, evalCode);
//        return handlers;
//
//    }
//
//    /**
//     * 获取评估选项
//     *
//     * @param request
//     * @param itemCode
//     * @param evalCode
//     * @param handlerCode
//     * @return
//     */
//    @RequestMapping(value = "/assessContexts", method = RequestMethod.POST)
//    @ResponseBody
//    public List<AssessContext> getAssessContext(HttpServletRequest request,
//                                                String itemCode, String evalCode, String handlerCode) {
//        List<AssessContext> assessContexts = doctorAfterChildbirthEvalService.getAssessContexts(itemCode, evalCode, handlerCode);
//        return assessContexts;
//    }

    /**
     * TODO
     * 添加医生对患者产后的评估详情
     *
     * @return
     */
//    @RequestMapping(value = "/addDoctorEval", method = RequestMethod.POST)
//    @ResponseBody
//    public CommonResult addDoctorEval(@RequestBody DoctorEval doctorEval) {
//        boolean b = doctorAfterChildbirthEvalService.addDoctorEval(doctorEval);
//        CommonResult commonResult;
//        if (b == true) {
//            commonResult = CommonResult.success(b);
//            LOGGER.debug("addDoctorEval success:{}", b);
//        } else {
//            commonResult = CommonResult.failed("操作失败");
//            LOGGER.debug("addDoctorEval failed:{}", b);
//        }
//        return commonResult;
//    }
    @RequestMapping(value = "/addDoctorEval", method = RequestMethod.POST)
    @ResponseBody
    public CommonResult addDoctorEval(@RequestParam(value = "itemName", required = false) String itemName, @RequestParam(value = "evalContext", required = false) String evalContext, @RequestParam(value = "handlerContext", required = false) String handlerContext, @RequestParam(value = "leavHosBefPg", required = false) String leavHosBefPg, @RequestParam(value = "chailAftSeven", required = false) String chailAftSeven, @RequestParam(value = "chailAftFourteen", required = false) String chailAftFourteen, @RequestParam(value = "chailAftTwentyEight", required = false) String chailAftTwentyEight, @RequestParam(value = "doctorCode", required = false) String doctorCode, @RequestParam(value = "cardno", required = false) String cardno) {
        DoctorEval doctorEval = new DoctorEval();
        doctorEval.setEvalContext(evalContext);
        doctorEval.setCardno(cardno);
        doctorEval.setChailAftFourteen(chailAftFourteen);
        doctorEval.setChailAftTwentyEight(chailAftTwentyEight);
        doctorEval.setChailAftSeven(chailAftSeven);
        doctorEval.setHandlerContext(handlerContext);
        doctorEval.setDoctorCode(doctorCode);
        doctorEval.setItemName(itemName);
        doctorEval.setLeavHosBefPg(leavHosBefPg);
        boolean b = doctorAfterChildbirthEvalService.addDoctorEval(doctorEval);
        CommonResult commonResult;
        if (b == true) {
            commonResult = CommonResult.success(b);
            LOGGER.debug("addDoctorEval success:{}", b);
        } else {
            commonResult = CommonResult.failed("操作失败");
            LOGGER.debug("addDoctorEval failed:{}", b);
        }
        return commonResult;
    }

    /**
     * 获取所有的医生评估
     *
     * @return
     */
    @RequestMapping(value = "/doctorEvalAll", method = RequestMethod.POST)
    @ResponseBody
    public List<DoctorEval> getDoctorEvalAll() {
        List<DoctorEval> doctorEvalAll = doctorAfterChildbirthEvalService.getDoctorEvalAll();
        return doctorEvalAll;
    }

    /**
     * 通过患者卡号和创建时间获取医生评估详情
     *
     * @param cardno 患者卡号
     * @return
     */
    @RequestMapping(value = "/doctorEvalByCardnoAndCreateTime", method = RequestMethod.POST)
    @ResponseBody
    public List<DoctorEval> getDoctorEvalByCardnoAndCreateTime(@RequestParam("cardno") String cardno) {
        List<DoctorEval> doctorEvalByCardnoAndCreateTime = doctorAfterChildbirthEvalService.getDoctorEvalByCardnoAndCreateTime(cardno);
        return doctorEvalByCardnoAndCreateTime;
    }
}


