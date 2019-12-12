package com.yhhis.controller.Doctorend;

import com.alibaba.fastjson.JSONArray;
import com.his.server.Assay;
import com.his.server.WebServices;
import com.yhhis.controller.wxpay.WxTemplate;
import com.yhhis.service.impl.RedisServiceImpl;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

@Controller
@RequestMapping("/chemicalexam")
public class ChemicalexamController {
    private static final Logger LOGGER = LoggerFactory.getLogger(ChemicalexamController.class);
    @Resource
    WebServices webServices;
    @Autowired
    private RedisServiceImpl redisService;

    /**
     * 未交费 查询患者化验的记录
     *
     * @param cardno      患者卡号
     * @param reqdeptcode
     * @param doctorcode
     * @return
     */
    @RequestMapping(value = "/getBeforeOneAssayNoPay", method = RequestMethod.POST)
    @ResponseBody
    public String getBeforeOneAssayNoPay(@RequestParam("cardno") String cardno, @RequestParam("reqdeptcode") String reqdeptcode, @RequestParam("doctorcode") String doctorcode) {
//        response.setCharacterEncoding("UTF-8");
//        response.setContentType("text/html;charset=UTF-8");
//        PrintWriter writer = null;
//        String result = "";
//        try {
//            writer = response.getWriter();
//            String cardno = request.getParameter("cardno");
//            String reqdeptcode = request.getParameter("reqdeptcode");
//            String doctorcode = request.getParameter("doctorcode");
        String result = webServices.getBeforeOneAssayNoPay(cardno, reqdeptcode, doctorcode);
//        } catch (Exception e) {
//            logger.info("url:getBeforeOneAssayNoPay。message:未交费 查询患者化验的记录异常。===请到日志中查询异常信息。===");
//            logger.error(e.getMessage(), e);
//        } finally {
//            writer.print(result);
//            writer.flush();
//            writer.close();
//        }
        return result;
    }

    /**
     * 删除化验
     *
     * @return
     */
    @RequestMapping(value = "delAssayItem", method = RequestMethod.POST)
    @ResponseBody
    public String delAssayItem(@RequestBody Assay assay) {
//        response.setCharacterEncoding("UTF-8");
//        response.setContentType("text/html;charset=UTF-8");
//        PrintWriter writer = null;
//        String result = "";
//        try {
//            writer = response.getWriter();
//            String serial_no = request.getParameter("serialno");// 流水号
//            String cardno = request.getParameter("cardno");// 患者卡号 01906034
//            String reqdept = request.getParameter("reqdept");// 申请科室
//            String reqphysician = request.getParameter("docname");// 申请医生姓名
//            String doctoruser = request.getParameter("doccode");// 医生编码
//            String visitno = request.getParameter("visitno");// 就诊序号
//            String visitdate = request.getParameter("visitdate");// 就诊日期
//            String clinicno = request.getParameter("clinicno");// 门诊号
        String result = webServices.delAssayItem(assay);
//        } catch (Exception e) {
//            logger.info("url:delAssayItem。message:删除化验异常。===请到日志中查询异常信息。===");
//            logger.error(e.getMessage(), e);
//        } finally {
//            writer.print(result);
//            writer.flush();
//            writer.close();
//        }
        return result;
    }

    /**
     * 化验主记录
     *
     * @param cardno     患者卡号
     * @param requestime
     * @return
     */
    @RequestMapping(value = "getAssayResultTakeNotes", method = RequestMethod.POST)
    @ResponseBody
    public String getAssayResultTakeNotes(@RequestParam("cardno") String cardno, @RequestParam("requestime") String requestime, @RequestParam("size") int size) {
//        response.setCharacterEncoding("UTF-8");
//        response.setContentType("text/html;charset=UTF-8");
//        PrintWriter writer = null;
//        String result = "";
//        try {
//            writer = response.getWriter();
//            String cardno = request.getParameter("cardno");
//            String requestime = request.getParameter("requestime");
        String result = webServices.getAssayResultTakeNotes(cardno, requestime, size);
//        } catch (Exception e) {
//            logger.info("url:getAssayResultTakeNotes。message:化验主记录异常。===请到日志中查询异常信息。===");
//            logger.error(e.getMessage(), e);
//        } finally {
//            writer.print(result);
//            writer.flush();
//            writer.close();
//        }
        return result;
    }

    /**
     * 化验项目明细
     *
     * @param testno
     * @return
     */
    @RequestMapping(value = "getAssayResult", method = RequestMethod.POST)
    @ResponseBody
    public String getAssayResult(@RequestParam("testno") String testno) {
//        response.setCharacterEncoding("UTF-8");
//        response.setContentType("text/html;charset=UTF-8");
//        PrintWriter writer = null;
//        String result = "";
//        try {
//            writer = response.getWriter();
//            String testno = request.getParameter("testno");
        String result = webServices.getAssayResult(testno);
//        } catch (Exception e) {
//            logger.info("url:getAssayResult。message:化验项目明细异常。===请到日志中查询异常信息。===");
//            logger.error(e.getMessage(), e);
//        } finally {
//            writer.print(result);
//            writer.flush();
//            writer.close();
//        }
        return result;
    }

    /**
     * 化验 查询项目分类
     */

    @RequestMapping(value = "/getassayclass", method = RequestMethod.POST)
    public String getAssayClass() {
//        response.setCharacterEncoding("UTF-8");
//        response.setContentType("text/html;charset=UTF-8");
//        PrintWriter writer = null;
//        String result = "";
//        try {
//            writer = response.getWriter();
        String result = redisService.get("assayClass");
//        } catch (Exception e) {
//            logger.info("url:getassayclass。message:化验 查询项目分类异常。===请到日志中查询异常信息。===");
//            logger.error(e.getMessage(), e);
//        } finally {
//            writer.print(result);
//            writer.flush();
//            writer.close();
//        }
        return result;
    }

    /**
     * 化验 查询项目二级分类
     *
     * @param expand3 化验科室编码
     * @param expand2 化验项目类别
     * @return
     */
    @RequestMapping(value = "/getassaysecondclass", method = RequestMethod.POST)
    @ResponseBody
    public String getAssaySecondClass(@RequestParam("expand3") String expand3, @RequestParam("expand2") String expand2) {
//        response.setCharacterEncoding("UTF-8");
//        response.setContentType("text/html;charset=UTF-8");
//        PrintWriter writer = null;
//        String result = "";
//        try {
//            writer = response.getWriter();
//            String expand3 = request.getParameter("expand3");// 化验科室编码
//            String expand2 = request.getParameter("expand2"); // 化验项目类别
        String result = webServices.getAssaySecondClass(expand3, expand2);
//        } catch (Exception e) {
//            logger.info("url:getassaysecondclass。message:化验 查询项目二级分类异常。===请到日志中查询异常信息。===");
//            logger.error(e.getMessage(), e);
//        } finally {
//            writer.print(result);
//            writer.flush();
//            writer.close();
//        }
        return result;
    }

    /**
     * 化验 通过科室编码查询科室名称
     *
     * @param dept_code 化验科室编码
     * @return
     */
    @RequestMapping(value = "/getdeptNamebydeptcode", method = RequestMethod.POST)
    @ResponseBody
    public String getDeptNameByDeptcode(@RequestParam("dept_code") String dept_code) {
//        response.setCharacterEncoding("UTF-8");
//        response.setContentType("text/html;charset=UTF-8");
//        PrintWriter writer = null;
//        String result = "";
//        try {
//            writer = response.getWriter();
//            String deptCode = request.getParameter("dept_code");// 化验科室编码
        String result = webServices.getDeptNameByDeptcode(dept_code);
//        } catch (Exception e) {
//            logger.info("url:getdeptNamebydeptcode。message:化验 通过科室编码查询科室名称异常。===请到日志中查询异常信息。===");
//            logger.error(e.getMessage(), e);
//        } finally {
//            writer.print(result);
//            writer.flush();
//            writer.close();
//        }
        return result;
    }

    /**
     * TODO
     * 添加化验单
     *
     * @param position  地址
     * @param username  患者姓名
     * @param items     化验类别名称
     * @param openid    微信openid
     * @param visitdate 就诊日期
     * @param assaydata
     * @return
     */
    @RequestMapping(value = "/insertPatientAssay", method = RequestMethod.POST)
    @ResponseBody
    public String insertPatientAssay(@RequestParam("position") String position, @RequestParam("username") String username, @RequestParam("items") String items, @RequestParam("openid") String openid, @RequestParam("visitdate") String visitdate, @RequestParam("assaydata") String assaydata) {
        String remarkText = "请您到" + position + "去就诊。";
        String firstText = "您的检验已经开具！";
        List<Assay> list = (List<Assay>) JSONArray.parseArray(assaydata, new Assay().getClass());
        String result = webServices.insertPatientAssay("自费", list);
        WxTemplate.sendChemicalexamTemplate(username, visitdate, items, result, openid, remarkText, firstText);
//        response.setCharacterEncoding("UTF-8");
//        response.setContentType("text/html;charset=UTF-8");
//        Map<String, Object> map = new HashMap<String, Object>();
//        PrintWriter writer = null;
//        String resultSerialon = "0";
//        try {
//            writer = response.getWriter();
//            String position = request.getParameter("position");// 地址6666666666
//            /*
//             * / 模板通知信息 开始
//             */
//            String remarkText = "请您到" + position + "去就诊。";
//            String firstText = "您的检验已经开具！";
//            // 新加参数
//            String username = request.getParameter("username");// 患者姓名
//            String items = request.getParameter("items");// 化验类别名称
//            String openid = request.getParameter("openid");//
//            String visitdate = request.getParameter("visitdate");//
//            ///////////// 模板通知信息 结束///////////////
//            String assay = request.getParameter("assaydata");
//            List<Assay> list = (List<Assay>) JSONArray.parseArray(assay, new Assay().getClass());
//            resultSerialon = webServices.insertPatientAssay("自费", list);
//            // 成功发送模板
//            if (!resultSerialon.equals("0")) {
//                map.put(ReturnCode.data, "");
//                map.put(ReturnCode.message, "添加化验单成功。");
//                map.put(ReturnCode.status, "1");
//                if (!openid.equals("0")) {
//                    WxTemplate.sendChemicalexamTemplate(username, visitdate, items, resultSerialon, openid, remarkText,
//                            firstText);
//                }
//            } else {
//                map.put(ReturnCode.data, "");
//                map.put(ReturnCode.message, "添加化验单失败！");
//                map.put(ReturnCode.status, "0");
//            }
//        } catch (Exception e) {
//            logger.info("url:insertPatientAssay。message:添加化验单异常。===请到日志中查询异常信息。===");
//            logger.error(e.getMessage(), e);
//            map.put(ReturnCode.data, "");
//            map.put(ReturnCode.message, "添加化验单异常！");
//            map.put(ReturnCode.status, "0");
//        } finally {
//            writer.print(JSON.toJSONString(map));
//            writer.flush();
//            writer.close();
//        }
        return result;
    }

}
