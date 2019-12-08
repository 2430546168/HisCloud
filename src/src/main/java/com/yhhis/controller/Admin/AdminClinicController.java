package com.yhhis.controller.Admin;

import com.his.server.ClinicInfo;
import com.his.server.ClinicTotal;
import com.his.server.WebServices;
import com.yhhis.common.api.CommonResult;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping(value = "admin/clinic", method = RequestMethod.POST,produces = "application/json; charset=utf-8")
@ResponseBody
public class AdminClinicController {
    private static final Logger LOGGER = LoggerFactory.getLogger(AdminClinicController.class);
    @Resource
    WebServices webServices;
    @RequestMapping(value = "/getDoctorClinicTotalByDay")
    public CommonResult getDoctorClinicTotalByDay(HttpServletRequest request,
                                                  @RequestParam(value = "doctor",required = true) String doctor,
                                                  @RequestParam(value = "day",required = true) String day) {
        ClinicTotal total = webServices.getDoctorClinicTotalByDay(doctor,day);
        if(total != null){
            return CommonResult.success(total);
        }
        return CommonResult.failed();
    }
    @RequestMapping(value = "/getDoctorClinicTotalByMonth")
    public CommonResult getDoctorClinicTotalByMonth(HttpServletRequest request,
                                                    @RequestParam(value = "doctor",required = true) String doctor,
                                                    @RequestParam(value = "month",required = true) String month) {
        ClinicTotal total = webServices.getDoctorClinicTotalByMonth(doctor,month);
        if(total != null){
            return CommonResult.success(total);
        }
        return CommonResult.failed();
    }
    @RequestMapping(value = "/getDoctorClinicTotalByYear")
    public CommonResult getDoctorClinicTotalByYear(HttpServletRequest request,
                                                   @RequestParam(value = "doctor",required = true) String doctor,
                                                   @RequestParam(value = "year",required = true) String year) {
        ClinicTotal total = webServices.getDoctorClinicTotalByYear(doctor,year);
        if(total != null){
            return CommonResult.success(total);
        }
        return CommonResult.failed();
    }
    @RequestMapping(value = "/getDoctorClinicTotalByDate")
    public CommonResult getDoctorClinicTotalByDate(HttpServletRequest request,
                                                   @RequestParam(value = "doctor",required = true) String doctor,
                                                   @RequestParam(value = "day",required = true) String day) {
        Map<String,Object> total = new HashMap<>();
        String month = day.substring(0,day.lastIndexOf("-"));
        String year = day.substring(0,day.indexOf("-"));
        ClinicTotal totalDay = webServices.getDoctorClinicTotalByDay(doctor,day);
        ClinicTotal totalMonth = webServices.getDoctorClinicTotalByMonth(doctor,month);
        ClinicTotal totalYear = webServices.getDoctorClinicTotalByYear(doctor,year);
        total.put("totalDay",totalDay);
        total.put("totalMonth",totalMonth);
        total.put("totalYear",totalYear);
        if(total != null){
            return CommonResult.success(total);
        }
        return CommonResult.failed();
    }
    @RequestMapping(value = "/getDeptClinicTotalByDay")
    public CommonResult getDeptClinicTotalByDay(HttpServletRequest request,
                                                @RequestParam(value = "deptCode",required = true) String deptCode,
                                                @RequestParam(value = "day",required = true) String day) {
        deptCode = deptCode + "%";
        ClinicTotal total = webServices.getDeptClinicTotalByDay(deptCode,day);
        if(total != null){
            return CommonResult.success(total);
        }
        return CommonResult.failed();
    }


    @RequestMapping(value = "/getDeptClinicTotalByMonth")
    public CommonResult getDeptClinicTotalByMonth(HttpServletRequest request,
                                                  @RequestParam(value = "deptCode",required = true) String deptCode,
                                                  @RequestParam(value = "month",required = true) String month) {
        deptCode = deptCode + "%";
        ClinicTotal total = webServices.getDeptClinicTotalByMonth(deptCode,month);
        if(total != null){
            return CommonResult.success(total);
        }
        return CommonResult.failed();
    }
    @RequestMapping(value = "/getDeptClinicTotalByYear")
    public CommonResult getDeptClinicTotalByYear(HttpServletRequest request,
                                                 @RequestParam(value = "deptCode",required = true) String deptCode,
                                                 @RequestParam(value = "year",required = true) String year) {
        deptCode = deptCode + "%";
        ClinicTotal total = webServices.getDeptClinicTotalByYear(deptCode,year);
        if(total != null){
            return CommonResult.success(total);
        }
        return CommonResult.failed();
    }
    @RequestMapping(value = "/getDeptClinicTotalByDate")
    public CommonResult getDeptClinicTotalByDate(HttpServletRequest request,
                                                 @RequestParam(value = "deptCode",required = true) String deptCode,
                                                 @RequestParam(value = "day",required = true) String day) {
        deptCode = deptCode + "%";
        Map<String,Object> total = new HashMap<>();
        String month = day.substring(0,day.lastIndexOf("-"));
        String year = day.substring(0,day.indexOf("-"));
        ClinicTotal totalDay = webServices.getDeptClinicTotalByDay(deptCode,day);
        ClinicTotal totalMonth = webServices.getDeptClinicTotalByMonth(deptCode,month);
        ClinicTotal totalYear = webServices.getDeptClinicTotalByYear(deptCode,year);
        total.put("totalDay",totalDay);
        total.put("totalMonth",totalMonth);
        total.put("totalYear",totalYear);
        if(total != null){
            return CommonResult.success(total);
        }
        return CommonResult.failed();
    }
    @RequestMapping(value = "/getAllClinicTotalByDay")
    public CommonResult getAllClinicTotalByDay(HttpServletRequest request,
                                               @RequestParam(value = "day",required = true) String day) {
        ClinicTotal total = webServices.getAllClinicTotalByDay(day);
        if(total != null){
            return CommonResult.success(total);
        }
        return CommonResult.failed();
    }
    @RequestMapping(value = "/getAllClinicTotalByMonth")
    public CommonResult getAllClinicTotalByMonth(HttpServletRequest request,
                                                 @RequestParam(value = "month",required = true) String month) {
        ClinicTotal total = webServices.getAllClinicTotalByMonth(month);
        if(total != null){
            return CommonResult.success(total);
        }
        return CommonResult.failed();
    }
    @RequestMapping(value = "/getAllClinicTotalByYear")
    public CommonResult getAllClinicTotalByYear(HttpServletRequest request,
                                                @RequestParam(value = "year",required = true) String year) {
        ClinicTotal total = webServices.getAllClinicTotalByYear(year);
        if(total != null){
            return CommonResult.success(total);
        }
        return CommonResult.failed();
    }
    @RequestMapping(value = "/getAllClinicTotalByDate")
    public CommonResult getAllClinicTotalByDate(HttpServletRequest request,
                                                @RequestParam(value = "day",required = true) String day) {
        Map<String,Object> total = new HashMap<>();
        String month = day.substring(0,day.lastIndexOf("-"));
        String year = day.substring(0,day.indexOf("-"));
        ClinicTotal totalDay = webServices.getAllClinicTotalByDay(day);
        ClinicTotal totalMonth = webServices.getAllClinicTotalByMonth(month);
        ClinicTotal totalYear = webServices.getAllClinicTotalByYear(year);
        total.put("totalDay",totalDay);
        total.put("totalMonth",totalMonth);
        total.put("totalYear",totalYear);
        if(total != null){
            return CommonResult.success(total);
        }
        return CommonResult.failed();
    }
    @RequestMapping(value = "/getDoctorClinicInfoByDate")
    public CommonResult getDoctorClinicInfoByDate(HttpServletRequest request,
                                                  @RequestParam(value = "doctor",required = true) String doctor,
                                                  @RequestParam(value = "day",required = true) String day) {
        Map<String,Object> result = new HashMap<>();
        ClinicTotal clinicTotalDay = webServices.getDoctorClinicTotalByDay(doctor,day);
        List<ClinicInfo> clinicInfoListDay = webServices.getDoctorClinicInfoByDay(doctor,day);
        Map<String,Object> resultDay = new HashMap<>();
        resultDay.put("clinicTotalDay",clinicTotalDay);
        resultDay.put("clinicInfoListDay",clinicInfoListDay);
        if(clinicTotalDay != null && clinicInfoListDay != null){
            result.put("resultDay",resultDay);
        }
        ClinicTotal clinicTotalMonth = webServices.getDoctorClinicTotalByMonth(doctor,day.substring(0,day.lastIndexOf("-")));
        List<ClinicInfo> clinicInfoListMonth = webServices.getDoctorClinicInfoByMonth(doctor,day.substring(0,day.lastIndexOf("-")));
        Map<String,Object> resultMonth = new HashMap<>();
        resultDay.put("clinicTotalMonth",clinicTotalMonth);
        resultDay.put("clinicInfoListMonth",clinicInfoListMonth);
        if(clinicTotalMonth != null && clinicInfoListMonth != null){
            result.put("resultMonth",resultMonth);
        }
        ClinicTotal clinicTotalYear = webServices.getDoctorClinicTotalByYear(doctor,day.substring(0,day.indexOf("-")));
        List<ClinicInfo> clinicInfoListYear = webServices.getDoctorClinicInfoByYear(doctor,day.substring(0,day.indexOf("-")));
        Map<String,Object> resultYear = new HashMap<>();
        resultDay.put("clinicTotalYear",clinicTotalYear);
        resultDay.put("clinicInfoListYear",clinicInfoListYear);
        if(clinicTotalYear != null && clinicInfoListYear != null){
            result.put("resultYear",resultYear);
        }
        return CommonResult.failed();
    }

    @RequestMapping(value = "/getDoctorClinicInfoByDay")
    public CommonResult getDoctorClinicInfoByDay(HttpServletRequest request,
                                                 @RequestParam(value = "doctor",required = true) String doctor,
                                                 @RequestParam(value = "day",required = true) String day) {
        ClinicTotal clinicTotal = webServices.getDoctorClinicTotalByDay(doctor,day);
        List<ClinicInfo> clinicInfoList = webServices.getDoctorClinicInfoByDay(doctor,day);
        Map<String,Object> result = new HashMap<>();
        result.put("clinicTotal",clinicTotal);
        result.put("clinicInfoList",clinicInfoList);
        if(clinicTotal != null && clinicInfoList!= null){
            return CommonResult.success(result);
        }
        return CommonResult.failed();
    }
    @RequestMapping(value = "/getDoctorClinicInfoByMonth")
    public CommonResult getDoctorClinicInfoByMonth(HttpServletRequest request,
                                                   @RequestParam(value = "doctor",required = true) String doctor,
                                                   @RequestParam(value = "month",required = true) String month,
                                                   @RequestParam(value = "size",required = true) Integer size){
        ClinicTotal clinicTotal = webServices.getDoctorClinicTotalByMonth(doctor,month);
        if(size != null){
            List<ClinicInfo> clinicInfoList = webServices.getDoctorClinicInfoByMonthWithSize(doctor,month,size);
            Map<String,Object> result = new HashMap<>();
            result.put("clinicTotal",clinicTotal);
            result.put("clinicInfoList",clinicInfoList);
            if(clinicTotal != null && clinicInfoList!= null){
                return CommonResult.success(result);
            }
            return CommonResult.failed();
        }else {
            List<ClinicInfo> clinicInfoList = webServices.getDoctorClinicInfoByMonth(doctor,month);
            Map<String,Object> result = new HashMap<>();
            result.put("clinicTotal",clinicTotal);
            result.put("clinicInfoList",clinicInfoList);
            if(clinicTotal != null && clinicInfoList!= null){
                return CommonResult.success(result);
            }
            return CommonResult.failed();
        }
    }
    @RequestMapping(value = "/getDoctorClinicInfoByYear")
    public CommonResult getDoctorClinicInfoByYear(HttpServletRequest request,
                                                  @RequestParam(value = "doctor",required = true) String doctor,
                                                  @RequestParam(value = "year",required = true) String year) {
        ClinicTotal clinicTotal = webServices.getDoctorClinicTotalByYear(doctor,year);
        List<ClinicInfo> clinicInfoList = webServices.getDoctorClinicInfoByYear(doctor,year);
        Map<String,Object> result = new HashMap<>();
        result.put("clinicTotal",clinicTotal);
        result.put("clinicInfoList",clinicInfoList);
        if(clinicTotal != null && clinicInfoList!= null){
            return CommonResult.success(result);
        }
        return CommonResult.failed();
    }
    @RequestMapping(value = "/getDeptClinicInfoByDate")
    public CommonResult getDeptClinicInfoByDate(HttpServletRequest request,
                                                @RequestParam(value = "DeptCode",required = true) String DeptCode,
                                                @RequestParam(value = "day",required = true) String day) {
        Map<String,Object> result = new HashMap<>();
        ClinicTotal clinicTotalDay = webServices.getDeptClinicTotalByDay(DeptCode,day);
        List<ClinicInfo> clinicInfoListDay = webServices.getDeptClinicInfoByDay(DeptCode,day);
        Map<String,Object> resultDay = new HashMap<>();
        resultDay.put("clinicTotalDay",clinicTotalDay);
        resultDay.put("clinicInfoListDay",clinicInfoListDay);
        if(clinicTotalDay != null && clinicInfoListDay != null){
            result.put("resultDay",resultDay);
        }
        ClinicTotal clinicTotalMonth = webServices.getDeptClinicTotalByMonth(DeptCode,day.substring(0,day.lastIndexOf("-")));
        List<ClinicInfo> clinicInfoListMonth = webServices.getDeptClinicInfoByMonth(DeptCode,day.substring(0,day.lastIndexOf("-")));
        Map<String,Object> resultMonth = new HashMap<>();
        resultDay.put("clinicTotalMonth",clinicTotalMonth);
        resultDay.put("clinicInfoListMonth",clinicInfoListMonth);
        if(clinicTotalMonth != null && clinicInfoListMonth != null){
            result.put("resultMonth",resultMonth);
        }
        ClinicTotal clinicTotalYear = webServices.getDeptClinicTotalByYear(DeptCode,day.substring(0,day.indexOf("-")));
        List<ClinicInfo> clinicInfoListYear = webServices.getDeptClinicInfoByYear(DeptCode,day.substring(0,day.indexOf("-")));
        Map<String,Object> resultYear = new HashMap<>();
        resultDay.put("clinicTotalYear",clinicTotalYear);
        resultDay.put("clinicInfoListYear",clinicInfoListYear);
        if(clinicTotalYear != null && clinicInfoListYear != null){
            result.put("resultYear",resultYear);
        }
        return CommonResult.failed();
    }
    @RequestMapping(value = "/getDeptClinicInfoByDay")
    public CommonResult getDeptClinicInfoByDay(HttpServletRequest request,
                                               @RequestParam(value = "deptCode",required = true) String deptCode,
                                               @RequestParam(value = "day",required = true) String day) {
        deptCode = deptCode + "%";
        ClinicTotal clinicTotal = webServices.getDeptClinicTotalByDay(deptCode,day);
        List<ClinicInfo> clinicInfoList = webServices.getDeptClinicInfoByDay(deptCode,day);
        Map<String,Object> result = new HashMap<>();
        result.put("clinicTotal",clinicTotal);
        result.put("clinicInfoList",clinicInfoList);
        if(clinicTotal != null && clinicInfoList!= null){
            return CommonResult.success(result);
        }
        return CommonResult.failed();
    }
    @RequestMapping(value = "/getDeptClinicInfoByMonth")
    public CommonResult getDeptClinicInfoByMonth(HttpServletRequest request,
                                                 @RequestParam(value = "deptCode",required = true) String deptCode,
                                                 @RequestParam(value = "month",required = true) String month,
                                                 @RequestParam(value = "size",required = false) Integer size) {
        deptCode = deptCode + "%";
        ClinicTotal clinicTotal = webServices.getDeptClinicTotalByMonth(deptCode,month);
        if(size != null){
            List<ClinicInfo> clinicInfoList = webServices.getDeptClinicInfoByMonthWithSize(deptCode,month,size);
            Map<String,Object> result = new HashMap<>();
            result.put("clinicTotal",clinicTotal);
            result.put("clinicInfoList",clinicInfoList);
            if(clinicTotal != null && clinicInfoList!= null){
                return CommonResult.success(result);
            }
            return CommonResult.failed();
        }else {
            List<ClinicInfo> clinicInfoList = webServices.getDeptClinicInfoByMonth(deptCode,month);
            Map<String,Object> result = new HashMap<>();
            result.put("clinicTotal",clinicTotal);
            result.put("clinicInfoList",clinicInfoList);
            if(clinicTotal != null && clinicInfoList!= null){
                return CommonResult.success(result);
            }
            return CommonResult.failed();
        }


    }
    @RequestMapping(value = "/getDeptClinicInfoByYear")
    public CommonResult getDeptClinicInfoByYear(HttpServletRequest request,
                                                @RequestParam(value = "deptCode",required = true) String deptCode,
                                                @RequestParam(value = "year",required = true) String year) {
        deptCode = deptCode + "%";
        ClinicTotal clinicTotal = webServices.getDeptClinicTotalByYear(deptCode,year);
        List<ClinicInfo> clinicInfoList = webServices.getDeptClinicInfoByYear(deptCode,year);
        Map<String,Object> result = new HashMap<>();
        result.put("clinicTotal",clinicTotal);
        result.put("clinicInfoList",clinicInfoList);
        if(clinicTotal != null && clinicInfoList!= null){
            return CommonResult.success(result);
        }
        return CommonResult.failed();
    }
    @RequestMapping(value = "/getAllClinicInfoByDate")
    public CommonResult getAllClinicInfoByDate(HttpServletRequest request,
                                               @RequestParam(value = "day",required = true) String day) {
        Map<String,Object> result = new HashMap<>();
        ClinicTotal clinicTotalDay = webServices.getAllClinicTotalByDay(day);
        List<ClinicInfo> clinicInfoListDay = webServices.getAllClinicInfoByDay(day);
        Map<String,Object> resultDay = new HashMap<>();
        resultDay.put("clinicTotalDay",clinicTotalDay);
        resultDay.put("clinicInfoListDay",clinicInfoListDay);
        if(clinicTotalDay != null && clinicInfoListDay != null){
            result.put("resultDay",resultDay);
        }
        ClinicTotal clinicTotalMonth = webServices.getAllClinicTotalByMonth(day.substring(0,day.lastIndexOf("-")));
        List<ClinicInfo> clinicInfoListMonth = webServices.getAllClinicInfoByMonth(day.substring(0,day.lastIndexOf("-")));
        Map<String,Object> resultMonth = new HashMap<>();
        resultDay.put("clinicTotalMonth",clinicTotalMonth);
        resultDay.put("clinicInfoListMonth",clinicInfoListMonth);
        if(clinicTotalMonth != null && clinicInfoListMonth != null){
            result.put("resultMonth",resultMonth);
        }
        ClinicTotal clinicTotalYear = webServices.getAllClinicTotalByYear(day.substring(0,day.indexOf("-")));
        List<ClinicInfo> clinicInfoListYear = webServices.getAllClinicInfoByYear(day.substring(0,day.indexOf("-")));
        Map<String,Object> resultYear = new HashMap<>();
        resultDay.put("clinicTotalYear",clinicTotalYear);
        resultDay.put("clinicInfoListYear",clinicInfoListYear);
        if(clinicTotalYear != null && clinicInfoListYear != null){
            result.put("resultYear",resultYear);
        }
        return CommonResult.failed();
    }
    @RequestMapping(value = "/getAllClinicInfoByDay")
    public CommonResult getAllClinicInfoByDay(HttpServletRequest request,
                                              @RequestParam(value = "day",required = true) String day) {
        ClinicTotal clinicTotal = webServices.getAllClinicTotalByDay(day);
        List<ClinicInfo> clinicInfoList = webServices.getAllClinicInfoByDay(day);
        Map<String,Object> result = new HashMap<>();
        result.put("clinicTotal",clinicTotal);
        result.put("clinicInfoList",clinicInfoList);
        if(clinicTotal != null && clinicInfoList!= null){
            return CommonResult.success(result);
        }
        return CommonResult.failed();
    }
    @RequestMapping(value = "/getAllClinicInfoByMonth")
    public CommonResult getAllClinicInfoByMonth(HttpServletRequest request,
                                                @RequestParam(value = "month",required = true) String month,
                                                @RequestParam(value = "size",required = false) Integer size) {
        ClinicTotal clinicTotal = webServices.getAllClinicTotalByMonth(month);
        if(size != null){
            List<ClinicInfo> clinicInfoList = webServices.getAllClinicInfoByMonthWithSize(month,size);
            Map<String,Object> result = new HashMap<>();
            result.put("clinicTotal",clinicTotal);
            result.put("clinicInfoList",clinicInfoList);
            if(clinicTotal != null && clinicInfoList!= null){
                return CommonResult.success(result);
            }
            return CommonResult.failed();
        }else {
            List<ClinicInfo> clinicInfoList = webServices.getAllClinicInfoByMonth(month);
            Map<String,Object> result = new HashMap<>();
            result.put("clinicTotal",clinicTotal);
            result.put("clinicInfoList",clinicInfoList);
            if(clinicTotal != null && clinicInfoList!= null){
                return CommonResult.success(result);
            }
            return CommonResult.failed();
        }
    }
    @RequestMapping(value = "/getAllClinicInfoByYear")
    public CommonResult getAllClinicInfoByYear(HttpServletRequest request,
                                               @RequestParam(value = "year",required = true) String year) {
        ClinicTotal clinicTotal = webServices.getAllClinicTotalByYear(year);
        List<ClinicInfo> clinicInfoList = webServices.getAllClinicInfoByYear(year);
        Map<String,Object> result = new HashMap<>();
        result.put("clinicTotal",clinicTotal);
        result.put("clinicInfoList",clinicInfoList);
        if(clinicTotal != null && clinicInfoList!= null){
            return CommonResult.success(result);
        }
        return CommonResult.failed();
    }
}