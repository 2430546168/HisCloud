package com.yhhis.controller.Doctor;

import com.his.server.WebServices;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

@Controller
@RequestMapping("details")
public class DetailsController {
    @Resource
    WebServices webServices;

    /**
     * 获取住院报告单
     *
     * @param cardno 患者卡号
     * @return
     */
    @RequestMapping(value = "/beInHospital", method = RequestMethod.POST)
    @ResponseBody
    public String beInHospital(@RequestParam("cardno") String cardno) {
//      response.setCharacterEncoding("UTF-8");
//      response.setContentType("text/html;charset=UTF-8");
//	  String cardno=request.getParameter("cardno");
//      PrintWriter writer = null;
//      String result="";
//      try {
//    	  writer= response.getWriter();
        String result = webServices.beInHospital(cardno);
//	} catch (Exception e) {
//		logger.info("url:getBeforeOneCheckNoPay。message:未交费 查询患者检查的记录异常。===请到日志中查询异常信息。===");
//		logger.error(e.getMessage(),e);
//	}finally {
//		 writer.print(result);
//	     writer.flush();
//	     writer.close();
//	  }
//    }
        return result;
    }
}
