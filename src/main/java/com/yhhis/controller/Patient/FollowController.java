package com.yhhis.controller.Patient;

import com.alibaba.fastjson.JSON;
import com.yhhis.common.entity.FollowEntity;
import com.yhhis.common.entity.Logger;
import com.yhhis.common.util.ReturnCode;
import com.yhhis.service.FollowService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 获取 用户关注事件
 *
 * @author zzh
 */
@Controller
@RequestMapping("follow")
public class FollowController {
    protected Logger logger = Logger.getLogger(this.getClass());

    @Autowired
    private FollowService followService;//关注接口

    //患者关注医生是添加
    //如果取消关注就直接删除
    @RequestMapping(value = "/insert", method = RequestMethod.POST)
    @ResponseBody
    public void insert(HttpServletRequest request, HttpServletResponse response, FollowEntity entity) {
        response.setCharacterEncoding("UTF-8");
        response.setContentType("text/html;charset=UTF-8");
        Map<String, Object> map = new HashMap<String, Object>();
        PrintWriter writer = null;
        try {


            writer = response.getWriter();
            int insert = followService.insert(entity);
            if (insert > 0) {
                map.put(ReturnCode.data, insert);
                map.put(ReturnCode.message, "关注成功");
                map.put(ReturnCode.status, "1");
            } else {
                map.put(ReturnCode.data, "");
                map.put(ReturnCode.message, "关注失败");
                map.put(ReturnCode.status, "0");
            }
        } catch (Exception e) {
            map.put(ReturnCode.data, "");
            map.put(ReturnCode.message, "关注异常");
            map.put(ReturnCode.status, "-1");
            System.out.println("关注添加异常");
            logger.info("url:insert。message:患者关注医生异常。===请到日志中查询异常信息。===");
            logger.error(e.getMessage(), e);
        } finally {
            writer.print(JSON.toJSONString(map));
            writer.flush();
            writer.close();
        }
    }

    /**
     * 进入评价页面是 获取当前患者是否也关注当前的医生
     * 如果有信息 前端显示已关注
     * 根据openid 和医生编号查询 doccode
     *
     * @param request
     * @param response
     * @param entity
     */
    @RequestMapping(value = "/attention", method = RequestMethod.POST)
    @ResponseBody
    public void find(HttpServletRequest request, HttpServletResponse response, FollowEntity entity) {
        response.setCharacterEncoding("UTF-8");
        response.setContentType("text/html;charset=UTF-8");
        Map<String, Object> map = new HashMap<String, Object>();
        PrintWriter writer = null;
        try {
            writer = response.getWriter();
            List<Map<String, Object>> find = followService.find(entity);

            if (find.size() > 0 && find != null) {
                map.put(ReturnCode.data, find);
                map.put(ReturnCode.message, "已关注");
                map.put(ReturnCode.status, "1");
            } else {
                map.put(ReturnCode.data, "");
                map.put(ReturnCode.message, "无关注");
                map.put(ReturnCode.status, "0");
            }
        } catch (Exception e) {
            map.put(ReturnCode.data, "");
            map.put(ReturnCode.message, "异常");
            map.put(ReturnCode.status, "-1");
            System.out.println("关注添加异常");
            logger.info("url:attention。message:根据openid 和医生编号查询 doccode异常。===请到日志中查询异常信息。===");
            logger.error(e.getMessage(), e);
        } finally {
            writer.print(JSON.toJSONString(map));
            writer.flush();
            writer.close();
        }
    }


    /**
     * 获取用户关注的医生
     * 参数 卡号
     */
    @RequestMapping(value = "/findDoctors", method = RequestMethod.POST)
    @ResponseBody
    public void findDoctors(HttpServletRequest request, HttpServletResponse response) {
        response.setCharacterEncoding("UTF-8");
        response.setContentType("text/html;charset=UTF-8");
        Map<String, Object> map = new HashMap<String, Object>();
        PrintWriter writer = null;
        String cardno = request.getParameter("cardno");
        try {
            writer = response.getWriter();
            List<Map<String, Object>> find = followService.findDoctors(cardno);
            if (find.size() > 0 && find != null) {
                //说明有关注的医生
                map.put(ReturnCode.data, find);
                map.put(ReturnCode.message, "成功");
                map.put(ReturnCode.status, "1");
            } else {
                map.put(ReturnCode.data, "");
                map.put(ReturnCode.message, "无关注信息");
                map.put(ReturnCode.status, "0");
            }
        } catch (Exception e) {
            map.put(ReturnCode.data, "");
            map.put(ReturnCode.message, "异常");
            map.put(ReturnCode.status, "-1");
            System.out.println("获取用户关注的医生");
            logger.info("url:findDoctors。message:获取用户关注的医生异常。===请到日志中查询异常信息。===");
            logger.error(e.getMessage(), e);
        } finally {
            writer.print(JSON.toJSONString(map));
            writer.flush();
            writer.close();
        }

    }

    /**
     * 用户取消关注
     * 参数 openid ,doccode 医生编号
     */
    @RequestMapping(value = "/deleInfo", method = RequestMethod.POST)
    @ResponseBody
    public void deleInfo(HttpServletRequest request, HttpServletResponse response, FollowEntity entity) {
        response.setCharacterEncoding("UTF-8");
        response.setContentType("text/html;charset=UTF-8");
        Map<String, Object> map = new HashMap<String, Object>();
        PrintWriter writer = null;
        try {
            writer = response.getWriter();
            int delete = followService.deleInfo(entity);

            if (delete > 0) {
                map.put(ReturnCode.data, delete);
                map.put(ReturnCode.message, "取消关注成功");
                map.put(ReturnCode.status, "1");
            } else {
                map.put(ReturnCode.data, "");
                map.put(ReturnCode.message, "取消关注失败");
                map.put(ReturnCode.status, "0");
            }
        } catch (Exception e) {
            map.put(ReturnCode.data, "");
            map.put(ReturnCode.message, "取消关注异常");
            map.put(ReturnCode.status, "-1");
            System.out.println("取消关注异常");
            logger.info("url:deleInfo。message:用户取消关注异常。===请到日志中查询异常信息。===");
            logger.error(e.getMessage(), e);
        } finally {
            writer.print(JSON.toJSONString(map));
            writer.flush();
            writer.close();
        }
    }
}
