package com.yhhis.controller.Consult;

import com.yhhis.common.api.CommonResult;
import com.yhhis.common.entity.StaffDict;
import com.yhhis.service.StaffDictService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("advisory")
public class DoctorController {
    private static final Logger LOGGER = LoggerFactory.getLogger(DoctorController.class);

    @Autowired
    StaffDictService staffDictService;

    /**
     * 咨询医生
     * 查询首页
     *
     * @param deptCode 科室编码
     * @return
     */
    @RequestMapping("/getAllDoctors")
    public CommonResult getAllDoctors(@RequestParam("deptCode") String deptCode) {
        CommonResult commonResult;
        List<StaffDict> allDoctors = staffDictService.getAllDoctors(deptCode);
        if (allDoctors != null && !allDoctors.equals("")) {
            commonResult = CommonResult.success(allDoctors);
            LOGGER.info("getAllDoctors success:{}", commonResult);
        } else {
            commonResult = CommonResult.failed("");
            LOGGER.info("getAllDoctors failed:{}", commonResult);
        }
        return commonResult;
    }

    /**
     * 更新医生在线状态
     *
     * @param userName
     * @param onlineStatus
     * @return
     */
    @RequestMapping("/Offline")
    public CommonResult Offline(@RequestParam("userName") String userName, @RequestParam("onlineStatus") String onlineStatus) {
        CommonResult commonResult;
        int i = staffDictService.updateOnlineStatus(userName, onlineStatus);
        if (i != 0) {
            commonResult = CommonResult.success(i);
            LOGGER.info("Offline success:{}", commonResult);
        } else {
            commonResult = CommonResult.failed("");
            LOGGER.info("Offline failed:{}", commonResult);
        }
        return commonResult;
    }


}
