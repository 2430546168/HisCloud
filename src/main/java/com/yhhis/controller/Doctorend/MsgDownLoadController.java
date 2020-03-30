package com.yhhis.controller.Doctorend;

import com.yhhis.common.api.CommonResult;
import com.yhhis.common.sdk.DownloadFileFromWX;
import com.yhhis.common.util.WxUtils;
import com.yhhis.common.entity.ResultObject;
import com.yhhis.service.CertificateService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("down")
public class MsgDownLoadController {
    private static final Logger LOGGER = LoggerFactory.getLogger(MsgDownLoadController.class);

    @Autowired
    CertificateService certificateService;

    /**
     * 下载录音文件
     *
     * @param mediaId 微信传的媒体id
     */
    @RequestMapping(value = "/downVoice", method = RequestMethod.POST)
    @ResponseBody
    public CommonResult DownLoadVoice(@RequestParam("mediaId") String mediaId, HttpServletRequest request) {
        String accessToken = WxUtils.getAccessToken();
        CommonResult commonResult = null;
        String contexPath = request.getSession().getServletContext().getRealPath("/");
        contexPath = contexPath + "imgs/";
        String s = null;
        try {
            s = DownloadFileFromWX.saveAudioToDisk(accessToken, mediaId, contexPath);
            System.out.println(s);
            s = "/imgs/" + s;
            if (s != null) {
                commonResult = CommonResult.success(s);
                LOGGER.debug("downVoice success:{}", s);
            } else {
                commonResult = CommonResult.failed(s);
                LOGGER.debug("downVoice failed:{}", s);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return commonResult;
    }


    /**
     * 下载图片文件
     * mediaId=FlEMGP_yb31-LdAHly1g8CwUaOlSZ8ODfjbP2NBTOVJdsEf96jtTNajRhnXVXlze
     *
     * @param mediaIds 微信传的媒体id数组
     * @throws Exception TODO
     */
    @RequestMapping(value = "/downPic")
    @ResponseBody
    public CommonResult DownCertificate(@RequestParam("mediaIds") List<String> mediaIds, @RequestParam("docCode") String docCode, HttpServletRequest request) throws Exception {
        CommonResult commonResult;
        String accessToken = WxUtils.getAccessToken();
        String contexPath = request.getSession().getServletContext().getRealPath("/");
        contexPath = contexPath + "images/";
        List<String> lists = new ArrayList<>();
        for (int i = 0; i < mediaIds.size(); i++) {
            String s = DownloadFileFromWX.saveImageToDisk(accessToken, mediaIds.get(i), contexPath);
            certificateService.addImage(docCode, s);
            lists.add(s);
        }
//        String s = DownloadFileFromWX.saveImageToDisk(accessToken, mediaId, contexPath);
//        s = "/imgs/" + s;
//        System.out.println(s);
        commonResult = CommonResult.success(lists);
        return commonResult;
    }

    /**
     * 查询医生资格证
     *
     * @param docCode 医生编码
     * @return
     */
    @RequestMapping(value = "/CheckCertificate")
    @ResponseBody
    public CommonResult CheckCertificate(@RequestParam("docCode") String docCode) {
        CommonResult commonResult;
        List<ResultObject> resultObjects = certificateService.getAll(docCode);
        commonResult = CommonResult.success(resultObjects);
        return commonResult;
    }

    /**
     * 删除医生资格证
     *
     * @param imgUrl 图片路径
     * @return
     */
    @RequestMapping(value = "/DelCertificate")
    @ResponseBody
    public CommonResult DelCertificate(@RequestParam("imgUrl") String imgUrl, HttpServletRequest request) {
        int i = certificateService.delete(imgUrl);
        String realPath = request.getSession().getServletContext().getRealPath("/");
        imgUrl = realPath + imgUrl;
        CommonResult commonResult;
        File file = new File(imgUrl);
        boolean delete = file.delete();
        if (delete && i == 1) {
            System.out.println(file.getName() + " is deleted!");
            commonResult = CommonResult.success("true");
            LOGGER.debug("DelCertificate success:{}");
        } else {
            System.out.println("Delete operation is failed.");
            commonResult = CommonResult.failed("false");
            LOGGER.debug("DelCertificate failed:{}");
        }
        return commonResult;
    }
}
