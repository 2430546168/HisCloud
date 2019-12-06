package com.yhhis.controller.TripartiteInterface;

import com.yhhis.common.util.UidDistinguish;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import sun.misc.BASE64Encoder;


import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.InputStream;

/**
 * 身份证识别
 *
 * @author fengxian
 */
@Controller
@RequestMapping("UidDistinguish")
public class UidDistinguishController {
    @RequestMapping(value = "/uploadImg", method = RequestMethod.POST)
    @ResponseBody
    public String uploadImg(@RequestParam("file") MultipartFile file, HttpServletRequest request,
                            HttpServletResponse response) throws Exception {
        StringBuffer ImgBase64 = new StringBuffer();
        if (file == null) {
            response.sendError(HttpServletResponse.SC_BAD_REQUEST);
            return "";
        }
        InputStream fileInput = file.getInputStream();
        byte[] buffer = new byte[fileInput.available()];
        try {
            fileInput.read(buffer);
        } catch (Exception e) {
            throw new Exception("fileInput read to byte error!");
        } finally {
            fileInput.close();
        }
        BASE64Encoder base64Encoder = new BASE64Encoder();
        String Bese64Str = base64Encoder.encode(buffer);
        ImgBase64.append(Bese64Str);
        String image64 = ImgBase64.toString();
        UidDistinguish uid = new UidDistinguish();
        String userInfo = uid.userInfo(image64);
        return userInfo;
    }

}
