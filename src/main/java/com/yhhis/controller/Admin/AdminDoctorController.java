package com.yhhis.controller.Admin;


import com.his.server.AdminLevel;
import com.his.server.DoctorInfoPO;
import com.his.server.WebServices;
import com.yhhis.common.api.CommonResult;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.util.List;

//
@Configuration
@Controller
@RequestMapping(value = "admin/doctor", method = RequestMethod.POST,produces = "application/json;charset=utf-8")
@ResponseBody
public class AdminDoctorController {
    private static final Logger LOGGER = LoggerFactory.getLogger(AdminClinicController.class);
    @Resource
    WebServices webServices;

    @RequestMapping(value = "/getDoctorInfoList")
    public CommonResult getDoctorInfoList(HttpServletRequest result,
                                          @RequestParam(value = "deptCode", required = false) String deptCode) {
        System.out.println(deptCode);
        if (deptCode != null && !deptCode.equals("")) {
            deptCode = deptCode + "%";
            List<DoctorInfoPO> doctorList = webServices.queryDoctorInfoByDeptCode(deptCode);
            System.out.println(doctorList);
            if (doctorList != null) {
                return CommonResult.success(doctorList);
            }
            return CommonResult.failed();
        }
        List<DoctorInfoPO> doctorList = webServices.queryDoctorInfoList();
        System.out.println(doctorList);
        if (doctorList != null) {
            return CommonResult.success(doctorList);
        }
        return CommonResult.failed();
    }

    @RequestMapping(value = "/loginByIdNo")
    public CommonResult loginByIdNo(HttpServletRequest result,
                                    @RequestParam(value = "idNo", required = true) String idNo) {
        System.out.println(idNo);
//        if(idNo != null && ! idNo.equals("")){
//            DoctorInfoPO doctorInfoPO = webServices.queryDoctorInfoByCardNo(idNo);
//            if (doctorInfoPO != null){
//                return CommonResult.success(doctorInfoPO);
//            }
//            return CommonResult.failed("用户不存在");
//        }
//        曲博和院长
        if (idNo != null && !idNo.equals("")) {
            DoctorInfoPO doctorInfoPO = webServices.queryDoctorInfoByCardNo(idNo);
            if (doctorInfoPO != null) {
                return CommonResult.success(doctorInfoPO);
            }
            return CommonResult.failed("用户不存在");
        }
        return CommonResult.failed("身份证号为空");
    }

    @RequestMapping(value = "/editDoctorInfoByUserName")
    public CommonResult editDoctorInfoByUserName(HttpServletRequest result,
                                                 @RequestParam(value = "userName", required = true) String userName,
                                                 @RequestParam(value = "deptCode", required = true) String deptCode,
                                                 @RequestParam(value = "expertJob", required = true) String expertJob,
                                                 @RequestParam(value = "adminLevel", required = true) String adminLevel,
                                                 @RequestParam(value = "deptVisible", required = true) String deptVisible,
                                                 @RequestParam(value = "doctorRole", required = true) String doctorRole) {

        if (userName != null && !userName.equals("")) {
            boolean editInfo = webServices.editDoctorInfoByUserName(userName, deptCode, expertJob, adminLevel, doctorRole, deptVisible);
            if (editInfo) {
                return CommonResult.success("修改成功！");
            }
            return CommonResult.failed("修改失败！");
        }
        return CommonResult.failed("未传入医生信息！");
    }

    @RequestMapping(value = "/getAdminListByAdminLevel")
    public CommonResult getAdminListByAdminLevel(HttpServletRequest result,
                                                 @RequestParam(value = "adminLevel", required = true) String adminLevel) {
        System.out.println(adminLevel);
        if (adminLevel != null && !adminLevel.equals("")) {
            if (Integer.parseInt(adminLevel) < 4 && Integer.parseInt(adminLevel) >= 0) {
                List<DoctorInfoPO> adminList = webServices.getAdminListByAdminLevel(adminLevel);
                if (adminList != null) {
                    return CommonResult.success(adminList);
                }
                return CommonResult.failed("用户不存在！");
            }
            return CommonResult.failed("权限参数错误！");
        }
        return CommonResult.failed("权限参数为空！");
    }

    @RequestMapping(value = "/getAdminList")
    public CommonResult getAdminList(HttpServletRequest result) {
        List<DoctorInfoPO> adminList = webServices.getAdminList();
        if (adminList != null) {
            return CommonResult.success(adminList);
        }
        return CommonResult.failed("用户不存在！");
    }

    @RequestMapping(value = "/editAdminLevelByUserName")
    public CommonResult editAdminLevelByUserName(HttpServletRequest result,
                                                 @RequestParam(value = "userName",required = true) String userName,
                                                 @RequestParam(value = "adminLevel",required = true) String adminLevel) {
        System.out.println(adminLevel);
        if(adminLevel != null && ! adminLevel.equals("") && userName != null && ! userName.equals("")){
            if (Integer.parseInt(adminLevel) < 5 && Integer.parseInt(adminLevel) >= 0) {
                boolean editInfo = webServices.editAdminLevelByUserName(userName,adminLevel);
                if (editInfo){
                    return CommonResult.success("修改成功！");
                }
                return CommonResult.failed("修改失败！");
            }
            return CommonResult.failed("权限参数错误！");
        }
        return CommonResult.failed("参数错误！");
    }
    @RequestMapping(value = "/editPatientReportByUserName")
    public CommonResult editPatientReportByUserName(HttpServletRequest result,
                                                    @RequestParam(value = "userName",required = true) String userName,
                                                    @RequestParam(value = "patientReport",required = true) String patientReport) {
        if(userName != null && ! userName.equals("") && patientReport != null && ! patientReport.equals("")){
            boolean editInfo = webServices.editPatientReportByUserName(userName,patientReport);
            if (editInfo){
                return CommonResult.success("修改成功！");
            }
        }
        return CommonResult.failed("参数错误！");
    }
    @RequestMapping(value = "/editPatientReportByDeptCode")
    public CommonResult editPatientReportByDeptCode(HttpServletRequest result,
                                                    @RequestParam(value = "deptCode",required = true) String deptCode,
                                                    @RequestParam(value = "patientReport",required = true) String patientReport) {
        if(deptCode != null && ! deptCode.equals("") && patientReport != null && ! patientReport.equals("")){
            deptCode = deptCode + "%";
            boolean editInfo = webServices.editPatientReportByDeptCode(deptCode,patientReport);
            if (editInfo){
                return CommonResult.success("修改成功！");
            }
        }
        return CommonResult.failed("参数错误！");
    }
    @RequestMapping(value = "/getPatientReportByDeptCode")
    public CommonResult getPatientReportByDeptCode(HttpServletRequest result,
                                                   @RequestParam(value = "deptCode",required = true) String deptCode) {
        if(deptCode != null && ! deptCode.equals("")){
            deptCode = deptCode + "%";
            Integer hasZero = webServices.getPatientReportByDeptCode(deptCode);
            if (hasZero == 0){
                return CommonResult.success(1);
            }else {
                return CommonResult.success(0);
            }
        }
        return CommonResult.failed("参数错误！");
    }
    @RequestMapping(value = "/editPatientReportAll")
    public CommonResult editPatientReportAll(HttpServletRequest result,
                                             @RequestParam(value = "patientReport",required = true) String patientReport) {
        if(patientReport != null && ! patientReport.equals("")){
            boolean editInfo = webServices.editPatientReportAll(patientReport);
            if (editInfo){
                return CommonResult.success("修改成功！");
            }
        }
        return CommonResult.failed("参数错误！");
    }
    @RequestMapping(value = "/getAdminLevel")
    public CommonResult getAdminLevel(HttpServletRequest result,
                                      @RequestParam(value = "adminLevel", required = true) String adminLevel) {

        List<AdminLevel> adminLevelList = webServices.getAdminLevel(adminLevel);
        if (adminLevelList != null) {
            return CommonResult.success(adminLevelList);
        }
        return CommonResult.failed("获取失败");
    }
}
