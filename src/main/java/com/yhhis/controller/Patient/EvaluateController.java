package com.yhhis.controller.Patient;

import com.alibaba.fastjson.JSON;
import com.his.server.WebServices;
import com.yhhis.common.entity.Evaluate;
import com.yhhis.common.entity.Logger;
import com.yhhis.common.util.ReturnCode;
import com.yhhis.service.EvaluateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 患者对就诊医生的评价   未测试...
 *
 * @author zzh
 */
@Controller
@RequestMapping("evaluate")
public class EvaluateController {
    protected Logger logger = Logger.getLogger(this.getClass());
    @Resource
    WebServices webServices;
    @Autowired
    private EvaluateService evaluateService;//评价接口

    /**
     * 添加患者对医生的评价信息
     *
     * @param request
     * @param response
     * @param entity
     */
    @RequestMapping(value = "insert", method = RequestMethod.POST)
    @ResponseBody
    public void insert(HttpServletRequest request, HttpServletResponse response, com.his.server.Evaluate entity) {
        response.setCharacterEncoding("UTF-8");
        response.setContentType("text/html;charset=UTF-8");
        Map<String, Object> map = new HashMap<String, Object>();
        PrintWriter writer = null;
        try {
            writer = response.getWriter();
            Evaluate ev = new Evaluate();
            ev.setAmorpm(entity.getAmorpm());
            ev.setBirthdate(entity.getBirthdate());
            ev.setCardname(entity.getCardname());
            ev.setClinicno(entity.getClinicno());
            ev.setContent(entity.getContent());
            ev.setDeletion(1);
            ev.setDoccode(entity.getDoccode());
            ev.setDocname(entity.getDocname());
            ev.setHosdeptname(entity.getHosdeptname());
            ev.setHosdocname(entity.getHosdocname());
            ev.setIdno(entity.getIdno());
            ev.setName(entity.getName());
            ev.setOpenid(entity.getOpenid());
            ;
            ev.setPatientid(entity.getPatientid());

            ev.setRegcode(entity.getRegcode());
            ev.setRegdate(entity.getRegdate());
            ev.setRegisterfee(entity.getRegisterfee());
            ev.setSex(entity.getSex());
            ev.setTdpj(entity.getTdpj());
            ev.setTestno(entity.getTestno());
            ev.setVisitno(entity.getVisitno());
            ev.setZdpj(entity.getZdpj());
            ev.setAge(entity.getAge());
            //1需要修改 添加参数 修改表结构 任务
            int insert = evaluateService.insert(ev);
            //2:修改当前挂号订为已评价
            int update = webServices.updateEvaluateRegister(entity);
            if (insert > 0 && update > 0) {
                map.put(ReturnCode.data, insert);
                map.put(ReturnCode.message, "评价成功");
                map.put(ReturnCode.status, "1");
            } else {
                map.put(ReturnCode.data, "");
                map.put(ReturnCode.message, "评价失败");
                map.put(ReturnCode.status, "0");
            }
        } catch (Exception e) {
            map.put(ReturnCode.data, "");
            map.put(ReturnCode.message, "评价异常");
            map.put(ReturnCode.status, "-1");
            System.out.println("评价添加异常");
            logger.info("url:insert。message:添加患者对医生的评价信息异常。===请到日志中查询异常信息。===");
            logger.error(e.getMessage(), e);
        } finally {
            writer.print(JSON.toJSONString(map));
            writer.flush();
            writer.close();
        }
    }


    /**
     * 根据卡号cardno 获取所有对医生的评价信息
     */
    @RequestMapping(value = "/findEvalate", method = RequestMethod.POST)
    @ResponseBody
    public void findEvalate(HttpServletRequest request, HttpServletResponse response) {
        response.setCharacterEncoding("UTF-8");
        response.setContentType("text/html;charset=UTF-8");
        Map<String, Object> map = new HashMap<String, Object>();
        String cardno = request.getParameter("cardno");//改为 cardno
        Integer size = Integer.parseInt(request.getParameter("size"));
        PrintWriter writer = null;
        try {
            writer = response.getWriter();
            List<Map<String, Object>> find = evaluateService.findEvalate(cardno, size);
            if (find.size() > 0 && find != null) {
                map.put(ReturnCode.data, find);
                map.put(ReturnCode.message, "获取评信息价成功");
                map.put(ReturnCode.status, "1");
            } else {
                map.put(ReturnCode.data, "");
                map.put(ReturnCode.message, "暂无评价信息");
                map.put(ReturnCode.status, "0");
            }
        } catch (Exception e) {
            map.put(ReturnCode.data, "");
            map.put(ReturnCode.message, "获取评价信息异常");
            map.put(ReturnCode.status, "-1");
            System.out.println("获取评价信息异常");
            logger.info("url:findEvalate。message:根据卡号cardno 获取所有对医生的评价信息异常。===请到日志中查询异常信息。===");
            logger.error(e.getMessage(), e);
        } finally {
            writer.print(JSON.toJSONString(map));
            writer.flush();
            writer.close();
        }
    }

    /**
     * 删除评价列表 （修改deletion字段为0）
     *
     * @param request
     * @param response
     */
    @RequestMapping(value = "deleteEvalate", method = RequestMethod.POST)
    @ResponseBody
    public void deleteEvalate(HttpServletRequest request, HttpServletResponse response) {
        response.setCharacterEncoding("UTF-8");
        response.setContentType("text/html;charset=UTF-8");
        Map<String, Object> map = new HashMap<String, Object>();
        String pjdate = request.getParameter("pjdate");//评级时间
        String patientid = request.getParameter("patientid");//患者卡号
        String doccode = request.getParameter("doccode");//医生编号
        String clinicno = request.getParameter("clinicno");//门诊号
        PrintWriter writer = null;
        try {
            writer = response.getWriter();
            //软删除
            int deleteEvalate = evaluateService.deleteEvalate(pjdate, patientid, doccode, clinicno);
            if (deleteEvalate > 0) {
                map.put(ReturnCode.data, deleteEvalate);
                map.put(ReturnCode.message, "删除评价成功");
                map.put(ReturnCode.status, "1");
            } else {
                map.put(ReturnCode.data, "");
                map.put(ReturnCode.message, "删除评价失败");
                map.put(ReturnCode.status, "0");
            }
        } catch (Exception e) {
            map.put(ReturnCode.data, "");
            map.put(ReturnCode.message, "删除评价异常");
            map.put(ReturnCode.status, "-1");
            logger.info("url:deleteEvalate。message:删除评价列表异常。===请到日志中查询异常信息。===");
            logger.error(e.getMessage(), e);
            System.out.println("删除评价列表失败");
        } finally {
            writer.print(JSON.toJSONString(map));
            writer.flush();
            writer.close();
        }
    }
}
