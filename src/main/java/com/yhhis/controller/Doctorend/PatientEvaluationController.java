package com.yhhis.controller.Doctorend;

import com.yhhis.common.api.CommonResult;
import com.yhhis.service.PatientEvaluationService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.websocket.server.PathParam;
import java.util.List;
import java.util.Map;

/**
 * 患者对医生的评价 本地表
 *
 * @author fengxian
 */
@Controller
@RequestMapping("PatientEvaluation")
public class PatientEvaluationController {
    private static final Logger LOGGER = LoggerFactory.getLogger(PatientEvaluationController.class);
    @Resource
    private PatientEvaluationService patientEvaluationService;

    /**
     * 医生端的评论中心信息
     *
     * @param doccode
     * @param size
     * @return
     */
    @RequestMapping(value = "/EvaluationCenter", method = RequestMethod.POST)
    @ResponseBody
    public CommonResult EvaluationCenter(@RequestParam("doccode") String doccode, @RequestParam("size") Integer size) {
        CommonResult commonResult = null;
        try {

            List<Map<String, Object>> evaluationCenter = patientEvaluationService.getEvaluationCenter(doccode, size);
            if (evaluationCenter != null && evaluationCenter.size() > 0) {
                commonResult = CommonResult.success(evaluationCenter, "获取评论信息成功。");
                LOGGER.debug("EvaluationCenter success:{}", evaluationCenter);
            } else {
                commonResult = CommonResult.failed("暂无评论信息!");
                LOGGER.debug("EvaluationCenter failed:{}", evaluationCenter);
            }
        } catch (Exception e) {
            LOGGER.debug("EvaluationCenter info:{}", e);
        }
        return commonResult;
//		response.setCharacterEncoding("UTF-8");
//		response.setContentType("text/html;charset=UTF-8");
//		Map<String,Object> map=new HashMap<String,Object>();
//		PrintWriter writer =null;
//		try {
//			writer= response.getWriter();
//			String doccode = request.getParameter("doccode");//医生编号
//			Integer size=Integer.parseInt(request.getParameter("size"));
//			List<Map<String,Object>> info=patientEvaluationService.getEvaluationCenter(doccode,size);
//			if(info!=null&&info.size()>0) {
//				map.put(ReturnCode.data,info);
//				map.put(ReturnCode.message, "获取评论信息成功。");
//				map.put(ReturnCode.status, "1");
//			}else {
//				map.put(ReturnCode.data,"");
//				map.put(ReturnCode.message, "暂无评论信息!");
//				map.put(ReturnCode.status, "0");
//			}
//		} catch (Exception e) {
//			map.put(ReturnCode.data,"");
//			map.put(ReturnCode.message, "获取评论信息异常。");
//			map.put(ReturnCode.status, "-1");
//			logger.info("url:EvaluationCenter。message:医生端的评论中心信息异常。===请到日志中查询异常信息。===");
//			logger.error(e.getMessage(),e);
//		}finally {
//			writer.print(JSON.toJSONString(map));
//			writer.flush();
//			writer.close();
//		}
    }

}
