package com.yhhis.controller.Doctor;

import com.his.server.WebServices;
import com.yhhis.common.entity.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

/**
 * 医生患者 历史信息
 *
 * @author fengxian
 */
@Controller
@RequestMapping("HistoricPatients")
public class HistoricPatientsController {
    protected Logger logger = Logger.getLogger(this.getClass());
    @Resource
    WebServices webServices;

    @RequestMapping(value = "/getPatientRegisHistoryInfo", method = RequestMethod.POST)
    @ResponseBody
    public String getPatientRegisHistoryInfo(@RequestParam("doctorno") String doctorno, @RequestParam("visitdate") String visitdate) {
        String result = webServices.getPatientRegisHistoryInfo(doctorno, visitdate);
        return result;
//			response.setCharacterEncoding("UTF-8");
//			response.setContentType("text/html;charset=UTF-8");
//		String doctorno=request.getParameter("doctorno");
//		String visitdate=request.getParameter("visitdate");
//		Map<String, Object> map = new HashMap<String, Object>();
//        PrintWriter writer = null;
//        String result="";
//        try {
//       	 writer = response.getWriter();
//       	result=webServices.getPatientRegisHistoryInfo(doctorno,visitdate);
//       	if(result.equals("")) {
//       			map.put(ReturnCode.data, "");
//                map.put(ReturnCode.message, "暂无患者列表。");
//                map.put(ReturnCode.status, "0");
//       	}
//  			} catch (Exception e) {
//  				map.put(ReturnCode.data, "");
//               map.put(ReturnCode.message, "获取患者列表异常。");
//               map.put(ReturnCode.status, "-1");
//               logger.info("url:Work。getRegisterInfo:未就诊患者列表异常。===请到日志中查询异常信息。===");
//               logger.error(e.getMessage(),e);
//  			}finally {
//  				writer.print(result);
//	            writer.flush();
//	            writer.close();
//  			}
    }
}
