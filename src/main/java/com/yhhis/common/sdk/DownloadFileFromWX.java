package com.yhhis.common.sdk;

import it.sauronsoftware.jave.*;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.UUID;

public class DownloadFileFromWX {

    /**
     * 获取录音保存本地服务器
     *
     * @param accessToken
     * @param mediaId
     * @param audioPath   保存路径
     * @return
     * @throws Exception
     */
    public static String saveAudioToDisk(String accessToken, String mediaId, String audioPath) throws Exception {
        InputStream inputStream = getInputStream(accessToken, mediaId);
        byte[] data = new byte[10240];
        int len = 0;
        FileOutputStream fileOutputStream = null;
        UUID audioName = UUID.randomUUID();
        //filePath:服务器文件路径
        //fileName：文件名，一般直接用UUID随机生成就行
        String uploadFile = audioPath + audioName + ".amr";
        String mpsUploadFile = audioPath + audioName + ".mp3";
        try {
            fileOutputStream = new FileOutputStream(uploadFile);
            while ((len = inputStream.read(data)) != -1) {
                fileOutputStream.write(data, 0, len);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (fileOutputStream != null) {
                try {
                    fileOutputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
        File source = new File(uploadFile);
        changeToMp3(source, mpsUploadFile);
        mpsUploadFile = audioName + ".mp3";
        return mpsUploadFile;
//        return uploadFile;
    }

    /**
     * jave包实现将amr格式转为mp3格式
     *
     * @param source
     * @param targetPath
     * @return
     */
    public static boolean changeToMp3(File source, String targetPath) {
        //File source = new File("C:/Users/Administrator/Downloads/厨房里的爆炸案.mpg");
        boolean flag = false;
        File target = new File(targetPath);
        AudioAttributes audio = new AudioAttributes();// 音频属性
        audio.setCodec("libmp3lame");// libmp3lame 音频编码
        audio.setBitRate(new Integer(128000));// 音频比特率
        audio.setChannels(new Integer(1));// 声道
        audio.setSamplingRate(new Integer(44100));// 采样率
        EncodingAttributes attrs = new EncodingAttributes();// 视频属性
        attrs.setFormat("mp3");// 转码格式
        attrs.setAudioAttributes(audio);// 音频属性
        Encoder encoder = new Encoder();// 创建解码器
        long beginTime = System.currentTimeMillis();
        try {
            // 获取时长
            MultimediaInfo m = encoder.getInfo(source);
            System.out.println(m.getDuration() / 1000 + "秒");
            System.out.println("获取时长花费时间是：" + ((System.currentTimeMillis() - beginTime)) / 1000 + "秒");
            beginTime = System.currentTimeMillis();
            encoder.encode(source, target, attrs);
            System.out.println("音频转码花费时间是：" + ((System.currentTimeMillis() - beginTime) / 1000) + "秒");
            flag = true;
        } catch (IllegalArgumentException e) {
            flag = false;
            e.printStackTrace();
        } catch (InputFormatException e) {
            flag = false;
            e.printStackTrace();
        } catch (EncoderException e) {
            flag = false;
            e.printStackTrace();
        }
        return flag;
    }


//    /**
//     * 语音文件转成MP3格式
//     *
//     * @param sourcePath 要转换的目标文件路径
//     * @param targetPath 转换后的MP3文件路径
//     */
//    public static void changeToMp3(String sourcePath, String targetPath) {
//        File source = new File(sourcePath);
//        File target = new File(targetPath);
//        AudioAttributes audio = new AudioAttributes();
//        Encoder encoder = new Encoder();
//
//        audio.setCodec("libmp3lame");
//        EncodingAttributes attrs = new EncodingAttributes();
//        attrs.setFormat("mp3");
//        attrs.setAudioAttributes(audio);
//
//        try {
//            encoder.encode(source, target, attrs);
//        } catch (IllegalArgumentException e) {
//            e.printStackTrace();
//        } catch (InputFormatException e) {
//            e.printStackTrace();
//        } catch (EncoderException e) {
//
//        }
//        new FileUtil().deleteFile(sourcePath);
//    }


    /**
     * 获取图片保存本地服务器
     *
     * @param mediaId 文件的id
     * @throws Exception
     */
    public static String saveImageToDisk(String accessToken, String mediaId, String picPath)
            throws Exception {
        UUID imageName = UUID.randomUUID();
        String fileName = imageName.toString();
        InputStream inputStream = getInputStream(accessToken, mediaId);
        byte[] data = new byte[10240];
        int len = 0;
        FileOutputStream fileOutputStream = null;
        try {
            fileName = fileName + ".jpg";
            fileOutputStream = new FileOutputStream(picPath + fileName);
            while ((len = inputStream.read(data)) != -1) {
                fileOutputStream.write(data, 0, len);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (fileOutputStream != null) {
                try {
                    fileOutputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
        return fileName;
    }

    /**
     * 获取临时素材
     */
    public static InputStream getInputStream(String accessToken, String media_id) throws Exception {
        InputStream is = null;
        String url = "http://file.api.weixin.qq.com/cgi-bin/media/get?access_token=" + accessToken + "&media_id=" + media_id;
        URL urlGet = new URL(url);
        HttpURLConnection http = (HttpURLConnection) urlGet
                .openConnection();
        http.setRequestMethod("GET"); // 必须是get方式请求
        http.setRequestProperty("Content-Type",
                "application/x-www-form-urlencoded");
        http.setDoOutput(true);
        http.setDoInput(true);
        System.setProperty("sun.net.client.defaultConnectTimeout", "30000");// 连接超时30秒
        System.setProperty("sun.net.client.defaultReadTimeout", "30000"); // 读取超时30秒
        http.connect();
        // 获取文件转化为byte流
        is = http.getInputStream();
        return is;
    }
}


