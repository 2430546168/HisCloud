package com.yhhis.controller.Doctorend;

import com.his.server.WebServices;
import com.yhhis.common.entity.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

/**
 * 医生下的患者
 *
 * @author fengxian
 */
@Controller
@RequestMapping("doctorPatient")
public class PatientDoctorController {
    protected Logger logger = Logger.getLogger(this.getClass());
    @Resource
    WebServices webServices;

    // 1：未就诊患者列表
    @RequestMapping(value = "/failureDoctor", method = RequestMethod.POST)
    @ResponseBody
    public String failureDoctor(@RequestParam("deptcode") String deptcode, @RequestParam("docname") String docname, HttpServletRequest request) {
        request.getSession().setAttribute("doccode", docname);
        String result = webServices.failureDoctor(deptcode, docname);
        return result;
//		response.setCharacterEncoding("UTF-8");
//		response.setContentType("text/html;charset=UTF-8");
//		String deptcode = request.getParameter("deptcode");// 科室编号
//		String docname = request.getParameter("docname");// 医生编码
//		Map<String, Object> map = new HashMap<String, Object>();
//		PrintWriter writer = null;
//		String result = "";
//		request.getSession().setAttribute("doccode", docname);
//		try {
//			writer = response.getWriter();
//			result = webServices.failureDoctor(deptcode, docname);
//			if (result.equals("0")) {
//				map.put(ReturnCode.data, "");
//				map.put(ReturnCode.message, "暂无患者列表。");
//				map.put(ReturnCode.status, "0");
//			}
//		} catch (Exception e) {
//			map.put(ReturnCode.data, "");
//			map.put(ReturnCode.message, "获取患者列表异常。");
//			map.put(ReturnCode.status, "-1");
//			logger.info("url:Work。getRegisterInfo:未就诊患者列表异常。===请到日志中查询异常信息。===");
//			logger.error(e.getMessage(), e);
//		} finally {
//			writer.print(result);
//			writer.flush();
//			writer.close();
//		}
    }

    // 2：已就诊患者列表
    @RequestMapping(value = "/seekedDoctor", method = RequestMethod.POST)
    @ResponseBody
    public String seekedDoctor(@RequestParam("deptcode") String deptcode, @RequestParam("docname") String docname) {
        String result = webServices.seekedDoctor(deptcode, docname);
        return result;
//		response.setCharacterEncoding("UTF-8");
//		response.setContentType("text/html;charset=UTF-8");
//		String deptcode = request.getParameter("deptcode");// 科室编号
//		String docname = request.getParameter("docname");// 医生编码
//		Map<String, Object> map = new HashMap<String, Object>();
//		PrintWriter writer = null;
//		String result = "";
//		try {
//			writer = response.getWriter();
//			result = webServices.seekedDoctor(deptcode, docname);
//			if (result.equals("0")) {
//				map.put(ReturnCode.data, "");
//				map.put(ReturnCode.message, "暂无已就诊患者信息。");
//				map.put(ReturnCode.status, "0");
//			}
//		} catch (Exception e) {
//			map.put(ReturnCode.data, "");
//			map.put(ReturnCode.message, "获取已就诊患者信息。");
//			map.put(ReturnCode.status, "-1");
//			logger.info("url:Work。getRegisterInfo:已就诊患者列表。===请到日志中查询异常信息。===");
//			logger.error(e.getMessage(), e);
//		} finally {
//			writer.print(result);
//			writer.flush();
//			writer.close();
//		}
    }
}
