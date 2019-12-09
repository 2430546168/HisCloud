package com.yhhis.controller.Patient;

import com.alibaba.fastjson.JSON;
import com.his.server.WebServices;
import com.yhhis.common.entity.Logger;
import com.yhhis.common.util.NoTools;
import com.yhhis.common.util.ReturnCode;
import com.yhhis.service.impl.RedisServiceImpl;
import org.json.JSONObject;
import org.json.XML;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.tempurl.NWebservice;
import org.tempurl.NWebserviceSoap;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.List;

/**
 * 病人处方主记录
 *
 * @author 小贵
 */
@Controller
@RequestMapping("prescription")
public class OrderMasterController {
    protected Logger logger = Logger.getLogger(this.getClass());
    @Resource
    WebServices webServices;
    @Autowired
    RedisServiceImpl redisServiceImpl;

    /**
     * 未付费处方提示
     *
     * @param request
     * @param response
     * @throws IOException
     * @
     */
    @RequestMapping(value = "/getItemsSum", method = RequestMethod.POST)
    @ResponseBody
    public void getItemsSum(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setCharacterEncoding("UTF-8");
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter writer = response.getWriter();
        String cardno = request.getParameter("cardno");// 患者卡号
        String doctorcode = request.getParameter("doctorcode");// 医生编码
        int result = webServices.getItemsSum(cardno, doctorcode);
        writer.print(result);
        writer.flush();
        writer.close();
    }

    /**
     * 获取医院科室地址
     *
     * @param request
     * @param response
     * @throws IOException
     * @
     */
    @RequestMapping(value = "/getdeptdict", method = RequestMethod.POST)
    @ResponseBody
    public void getdeptdict(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setCharacterEncoding("UTF-8");
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter writer = response.getWriter();
        String deptname = request.getParameter("dept_name");
        String result = webServices.getDeptDict(deptname);
        writer.print(result);
        writer.flush();
        writer.close();
    }

    /**
     * 未缴费 自助缴费 查询处方记录
     *
     * @param request
     * @param response
     * @throws IOException
     * @
     */
    @RequestMapping(value = "/GetVisitRecList", method = RequestMethod.POST)
    @ResponseBody
    public void GetVisitRecList(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setCharacterEncoding("UTF-8");
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter writer = response.getWriter();
        String patientId = request.getParameter("patientId");
        NWebserviceSoap bing = new NWebservice().getNWebserviceSoap();
        String str = bing
                .getvisitreclist("<Request><PatientID>" + patientId + "</PatientID><UserID></UserID></Request>");
        // 将XML转化json对象
        JSONObject xmlJSONObj = XML.toJSONObject(str);
        String result = xmlJSONObj.toString(4);
        writer.print(result);
        writer.flush();
        writer.close();
    }

    /**
     * 已缴费 查询药品处方项目明细
     *
     * @throws IOException
     * @
     */
    @RequestMapping(value = "/GetRecipeList")
    @ResponseBody
    public String GetRecipeList(@RequestParam("type") String type, @RequestParam("cardno") String cardno, @RequestParam("visitdate") String visitdate, @RequestParam("doccode") String doccode, @RequestParam("size") int size) {
        String result = webServices.getRecipeList(doccode, cardno, visitdate, type, size);
        return result;
    }

    /**
     * 化验检查明细详情
     *
     * @throws IOException
     * @
     */
    @RequestMapping(value = "/getCheckOrChemical")
    @ResponseBody
    public String getCheckOrChemical(@RequestParam("cardno") String cardno, @RequestParam("billdate") String billdate, @RequestParam("itemtype") String itemtype, @RequestParam("type") String type, @RequestParam("doccode") String doccode, @RequestParam("size") int size) {
//		response.setCharacterEncoding("UTF-8");
//		response.setContentType("text/html;charset=UTF-8");
//		PrintWriter writer = response.getWriter();
//		String cardno = request.getParameter("cardno");// 患者卡号
//		String vistdate = request.getParameter("billdate");// 账单日期
//		String itemtype = request.getParameter("itemtype");// D为检查 C 为化验
//		String type = request.getParameter("type");
//		String doccode = request.getParameter("doccode");// 医生编号
        String result = webServices.getCheckOrChemical(doccode, cardno, billdate, itemtype, type, size);
        return result;
//		writer.print(result);
//		writer.flush();
//		writer.close();
    }

    /**
     * 治疗明细详情
     *
     * @throws IOException
     */
    @RequestMapping(value = "/getTreatChargeInfo")
    @ResponseBody
    public String getTreatChargeInfo(@RequestParam("cardno") String cardno, @RequestParam("billdate") String billdate, @RequestParam("type") String type, @RequestParam("doccode") String doccode, @RequestParam("size") int size) throws IOException {
//		response.setCharacterEncoding("UTF-8");
//		response.setContentType("text/html;charset=UTF-8");
//		PrintWriter writer = response.getWriter();
//		String cardno = request.getParameter("cardno");// 患者卡号
//		String vistdate = request.getParameter("billdate");// 账单日期
//		String type = request.getParameter("type");
//		String doccode = request.getParameter("doccode");// 医生编号
        String result = webServices.getTreatChargeInfo(doccode, cardno, billdate, type, size);
//		writer.print(result);
//		writer.flush();
//		writer.close();
        return result;
    }

    /**
     * 去支付 生成redis 缓存 （患者未支付的项目）
     *
     * @param request
     * @param response
     */
    @RequestMapping(value = "/PrescriptionNum", method = RequestMethod.POST)
    @ResponseBody
    public void PrescriptionNum(HttpServletRequest request, HttpServletResponse response) {
        response.setCharacterEncoding("UTF-8");
        response.setContentType("text/html;charset=UTF-8");
        HashMap<String, Object> map = new HashMap<String, Object>();
        PrintWriter writer = null;
        String tradeno = NoTools.getInstance().getWXTradeNo();// 生成订单号
        String fee = request.getParameter("fee");
        try {
            writer = response.getWriter();
            redisServiceImpl.setTime(tradeno, fee, 10L);
            String redis = redisServiceImpl.get(tradeno);
            if (redis != null && !redis.equals("")) {
                map.put(ReturnCode.data, tradeno);// 返回订单号
                map.put(ReturnCode.message, "添加处方订单成功");
                map.put(ReturnCode.status, "1");
            } else {
                map.put(ReturnCode.data, "");
                map.put(ReturnCode.message, "添加处方订单失败");
                map.put(ReturnCode.status, "0");
            }
        } catch (Exception e) {
            map.put(ReturnCode.data, "");
            map.put(ReturnCode.message, "添加处方订单异常");
            map.put(ReturnCode.status, "-1");
            logger.info("url:PrescriptionNum。message:去支付 生成本地订单 （患者未支付的项目）异常。===请到日志中查询异常信息。===");
            logger.error(e.getMessage(), e);
        } finally {
            writer.print(JSON.toJSONString(map));
            writer.flush();
            writer.close();
        }
    }

    /**
     * 执行缴费
     *
     * @param request
     * @param response
     * @
     */
    @RequestMapping(value = "/PayBillTrade", method = RequestMethod.POST)
    @ResponseBody
    public void PayBillTrade(HttpServletRequest request, HttpServletResponse response) {
        response.setCharacterEncoding("UTF-8");
        response.setContentType("text/html;charset=UTF-8");
        String tradeno = request.getParameter("tradeno");// 订单号
        String fee = request.getParameter("fee");// 费用
        PrintWriter writer = null;
        String result = "";
        try {
            // 支付成功后 redis 存储订单号和支付价格
            redisServiceImpl.set(tradeno, fee);
            writer = response.getWriter();
            String prescription = request.getParameter("prescriptions");
            List<HashMap> jsonStrToArray = JSON.parseArray(prescription, HashMap.class);
            String cardNo = request.getParameter("cardNo");
            String str = "";
            NWebserviceSoap bing = new NWebservice().getNWebserviceSoap();
            if (jsonStrToArray != null && jsonStrToArray.size() > 0) {
                for (int i = 0; i < jsonStrToArray.size(); i++) {
                    str = bing.paybilltrade1("<Request>" + "<PatientID>" + cardNo + "</PatientID>" + "<RecipeID>"
                            + jsonStrToArray.get(i).get("RecipeID") + "</RecipeID>" + "<RecipeAmount>"
                            + jsonStrToArray.get(i).get("TotalFee") + "</RecipeAmount>" + "<PayMode>1</PayMode>"
                            + "<TerTranSerNo></TerTranSerNo>" + "<UserID></UserID>" + "<BankCardNo></BankCardNo>"
                            + "<BankTranAmt></BankTranAmt>" + "<BankTranSerNo></BankTranSerNo>" + "<BankPNo></BankPNo>"
                            + "<BankTranDate></BankTranDate>" + "<BankTranTime></BankTranTime>" + "<POSID></POSID>"
                            + "<POSSerNo></POSSerNo>" + "<ReceiptNo></ReceiptNo>" + "<AuthorizeNo></AuthorizeNo>"
                            + "</Request>");
                }
                JSONObject xmlJSONObj = XML.toJSONObject(str);
                result = xmlJSONObj.toString(4);
            }
        } catch (Exception e) {
            logger.info("url:PayBillTrade。message:执行缴费 异常。===请到日志中查询异常信息。===");
            logger.error(e.getMessage(), e);
        } finally {
            writer.print(result);
            writer.flush();
            writer.close();
        }
    }
}
