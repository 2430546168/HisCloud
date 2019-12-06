package com.yhhis.controller.Doctorend;

import com.his.server.WebServices;
import com.yhhis.common.entity.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.websocket.server.PathParam;

@Controller
@RequestMapping("doctorvisit")
public class DoctorPayAHomeVisit {
    protected Logger logger = Logger.getLogger(this.getClass());
    @Resource
    WebServices webServices;

    /**
     * :医生出诊
     *
     * @param doctorno 医生编码
     * @return
     */
    @RequestMapping(value = "/OutVisit", method = RequestMethod.POST, produces = {"application/json;charset=UTF-8"})
    @ResponseBody
    public String OutVisit(@RequestParam("doctorno") String doctorno) {
        String result = "";
        if ("0000QB".equals(doctorno) || "000ZXD".equals(doctorno)) {
            result = webServices.doctorVisitStatusManager();
        } else {
            result = webServices.getDoctorVisitStatus(doctorno);
        }
        return result;
//        response.setCharacterEncoding("UTF-8");
//        response.setContentType("text/html;charset=UTF-8");
//        String doctorno = request.getParameter("doctorno");
//        PrintWriter writer = null;
//        String result = "";
//        try {
//            writer = response.getWriter();
//            if ("0000QB".equals(doctorno)) {
//                result = webServices.doctorVisitStatusManager();
//            } else {
//                result = webServices.getDoctorVisitStatus(doctorno);
//            }
//        } catch (Exception e) {
//            logger.info("doctoryespayahomevisit。message:医生出诊异常。===请到日志中查询异常信息。===");
//            logger.error(e.getMessage(), e);
//        } finally {
//            writer.print(result);
//            writer.flush();
//            writer.close();
//        }
    }

    /**
     * 1为正在出诊 0为已取消出诊 医生未出诊
     *
     * @param cliniclabel 号源名称
     * @param code
     */
    @RequestMapping(value = "/NoVisit", method = RequestMethod.POST, produces = {"application/json;charset=UTF-8"})
    @ResponseBody
    public String NoVisit(@RequestParam("cliniclabel") String cliniclabel, @RequestParam("code") String code) {
//		response.setCharacterEncoding("UTF-8");
//		response.setContentType("text/html;charset=UTF-8");
//		String cliniclabel = request.getParameter("cliniclabel");// 号源名称
//		String code = request.getParameter("code");// 1修改为0 //0修改为1
//		PrintWriter writer = null;
//		String result = "";
//		try {
//			writer = response.getWriter();
        String result = webServices.updateDoctorVisitStatus(cliniclabel, code);
//		} catch (Exception e) {
//			logger.info("doctornopayahomevisit。message:医生未出诊异常。===请到日志中查询异常信息。===");
//			logger.error(e.getMessage(), e);
//		} finally {
//			writer.print(result);
//			writer.flush();
//			writer.close();
//		}
        return result;
    }
}
