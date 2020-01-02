package com.yhhis.controller.Consult;

import com.yhhis.common.entity.ResultObject;
import com.yhhis.dao.CertificateDao;
import com.yhhis.service.CustomerCommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.io.IOException;

@Controller
public class ImgController {

    @Autowired
    private CustomerCommentService customerCommentService;

    @Autowired
    private CertificateDao certificateDao;

    /**
     * 测试多文件上传
     */
    @RequestMapping(value = "/test", method = RequestMethod.POST)
    public ResultObject test(@RequestParam("files") MultipartFile[] files, HttpServletRequest request, @RequestParam("doctorNo") String doctorNo) {
        String pic_path = request.getSession().getServletContext().getRealPath("images");
        System.out.println("files:" + files);
        ResultObject ro = null;
        try {
            ro = customerCommentService.test(files, pic_path, doctorNo);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return ro;
    }


}
