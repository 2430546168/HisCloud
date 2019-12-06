package com.yhhis.controller.patientend;

import com.his.server.WebServices;
import com.yhhis.common.api.CommonResult;
import com.yhhis.common.entity.DisInformation;
import com.yhhis.service.DisInformationService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

@Controller
@RequestMapping("/advisory")
public class DisInformationController {
    private static final Logger LOGGER = LoggerFactory.getLogger(DisInformationController.class);
    @Resource
    WebServices webServices;
    @Autowired
    private DisInformationService disInformationService;

    /**
     * 存储病人病情描述信息
     *
     * @param disInformation
     * @throws ParseException
     */
    @RequestMapping(value = "/Describecondition", method = RequestMethod.POST)
    @ResponseBody
    public CommonResult Describecondition(@RequestBody DisInformation disInformation) throws ParseException {
        CommonResult commonResult;
        int num = disInformationService.insertInformaintion(disInformation);
        if (num != 1) {
            commonResult = CommonResult.success(num);
            LOGGER.debug("Describecondition success:{}", num);
        } else {
            commonResult = CommonResult.failed("操作失败");
            LOGGER.debug("Describecondition failed:{}", num);
        }
        return commonResult;
    }
}
