package com.yhhis.service.impl;

import com.yhhis.common.entity.ResultObject;
import com.yhhis.dao.CertificateDao;
import com.yhhis.service.CustomerCommentService;
import org.apache.commons.codec.digest.DigestUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;

@Service
public class CustomerCommentServiceImpl implements CustomerCommentService {
    @Autowired
    CertificateDao certificateDao;

    /**
     * 测试文件上传
     *
     * @param files
     * @return
     */
    @Override
    public ResultObject test(MultipartFile[] files, String pic_path, String doctorNo) {
        ResultObject ro = new ResultObject();
        StringBuffer path = new StringBuffer();
        path = path.append(pic_path).append("/");
        System.out.println("文件存放路径" + path);
        //如果目录不存在，则新建
        File dir = new File(path.toString());
        if (!dir.exists()) {
            dir.mkdirs();
        }
        String tmpPath = path.toString();
        for (int i = 0; i < files.length; i++) {
            try {
                MultipartFile file = files[i];
                // 获取上传文件的MD5值
                String md5 = DigestUtils.md5Hex(file.getBytes());
                //图片命名
                String tmp = md5 + ".png";
                // 判断该文件是否在文件服务器上存在
                List<ResultObject> resultObjects = certificateDao.getAll(tmp);
                if (resultObjects == null) {
                    tmpPath = tmpPath + tmp;
                    System.out.println("文件路径:" + tmpPath);
                    //上传图片
                    byte[] bytes = file.getBytes();
                    BufferedOutputStream stream = new BufferedOutputStream(new FileOutputStream(new File(tmpPath)));
                    stream.write(bytes);
                    stream.close();
                    tmpPath = path.toString();
                    certificateDao.addImage(doctorNo, tmp);
                }
            } catch (IOException e) {
                e.printStackTrace();
                return null;
            }
        }
        return ro;
    }
}
