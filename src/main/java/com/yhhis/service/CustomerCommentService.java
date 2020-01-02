package com.yhhis.service;

import com.yhhis.common.entity.ResultObject;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;

public interface CustomerCommentService {

    /**
     * test多文件上传
     */
    public ResultObject test(MultipartFile[] files, String pic_path, String doctorNo) throws IOException;
}
