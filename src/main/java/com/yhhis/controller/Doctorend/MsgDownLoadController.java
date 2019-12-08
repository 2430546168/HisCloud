package com.yhhis.controller.Doctorend;

import com.yhhis.common.api.CommonResult;
import com.yhhis.common.sdk.DownloadFileFromWX;
import com.yhhis.common.util.WxUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;

@Controller
@RequestMapping("down")
public class MsgDownLoadController {
    private static final Logger LOGGER = LoggerFactory.getLogger(MsgDownLoadController.class);


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
     * @param mediaId 微信传的媒体id
     * @throws Exception TODO
     */
    @RequestMapping(value = "/downPic", method = RequestMethod.POST)
    @ResponseBody
    public CommonResult DownLoadPic(@RequestParam("mediaId") String mediaId, HttpServletRequest request) throws Exception {
        CommonResult commonResult;
        String accessToken = WxUtils.getAccessToken();
        String contexPath = request.getSession().getServletContext().getRealPath("/");
        contexPath = contexPath + "imgs/";
        String s = DownloadFileFromWX.saveImageToDisk(accessToken, mediaId, contexPath);
        s = "/imgs/" + s;
        System.out.println(s);
        commonResult = CommonResult.success(s);
        return commonResult;
    }
}
