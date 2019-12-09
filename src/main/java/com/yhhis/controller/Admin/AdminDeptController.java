//package com.yhhis.controller.Admin;
//
//
//import com.his.server.DeptInfoPO;
//import com.his.server.WebServices;
//import com.yhhis.common.api.CommonResult;
//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;
//import org.springframework.stereotype.Controller;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestMethod;
//import org.springframework.web.bind.annotation.RequestParam;
//import org.springframework.web.bind.annotation.ResponseBody;
//
//import javax.annotation.Resource;
//import javax.servlet.http.HttpServletRequest;
//import java.util.List;
//
//@Controller
//@RequestMapping(value = "admin/dept", method = RequestMethod.POST,produces = "application/json; charset=utf-8")
//@ResponseBody
////@RequestMapping(value = "admin/dept")
//public class AdminDeptController {
//    private static final Logger LOGGER = LoggerFactory.getLogger(AdminDeptController.class);
//    @Resource
//    WebServices webServices;
//    @RequestMapping(value = "/getDeptInfoList")
//    public CommonResult getDeptInfoList(HttpServletRequest request) {
//        List<DeptInfoPO> deptInfo = webServices.queryDeptInfoList();
//        if(deptInfo != null){
//            return CommonResult.success(deptInfo);
//        }
//        return CommonResult.failed();
//    }
//    @RequestMapping(value = "/getDeptContentByDeptCode")
//    public CommonResult getDeptContentByDeptCode(HttpServletRequest request,
//                                                 @RequestParam(value = "deptCode",required = true) String deptCode) {
//        String deptContent = webServices.queryDeptContentByDeptCode(deptCode);
//        System.out.println(deptCode);
//        if(deptContent != null){
//            return CommonResult.success(deptContent);
//        }
//        return CommonResult.failed();
//    }
//
//}
