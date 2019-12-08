package com.yhhis.common.util;//package com.yhhis.common.util;
//
//import java.io.File;
//import java.io.InputStream;
//import java.net.HttpURLConnection;
//import java.net.URL;
//import java.util.HashMap;
//import java.util.List;
//import java.util.Map;
//
//import javax.servlet.http.HttpServletRequest;
//
//import org.dom4j.io.SAXReader;
//
//public class Voice {
//
//	/**
//	 * 解析微信发送来的请求（XML）
//	 * @param request
//	 * @return
//	 * @throws Exception
//	 */
//		public static Map<String,String> parseXml(HttpServletRequest request)throws Exception{
//			//将解析结果存储到HashMap中
//			Map<String, String> map = new HashMap<String, String>();
//			// 从request中取得输入流
//			InputStream inputStream = request.getInputStream();
//			//读取输入流
//			SAXReader reader = new SAXReader();
//			Document document = reader.read(inputStream);
//			//得到xml根元素
//			Element root = document.getRootElement();
//			//得到根元素的子节点
//			List<Element> elementList = root.elements();
//			// 遍历所有子节点
//			for (Element e : elementList){
//				if(e.isTextOnly()){
//					map.put(e.getName(), e.getText());
//				}else{//处理扫码二维码，有二层结构
//					List<Element> scanInfo = e.elements();
//					for(Element i :scanInfo){
//						map.put(i.getName(), i.getText());
//					}
//				}
//				// 释放资源
//				inputStream.close();
//				inputStream = null;
//				return map;
//		}
//
//	public void doMessage() throws Exception {
//		// 获取请求和响应
//		HttpServletRequest request = ServletActionContext.getRequest();
//		HttpServletResponse response = ServletActionContext.getResponse();
//	}
//
//	/**
//	 * 从微信下载语言，并存储硬盘
//	 * 
//	 * @Description: TODO(从微信下载语音，并存储到硬盘)
//	 * @param userid
//	 *            用户ID
//	 * @param mediaId
//	 *            从微信下载所需语音ID
//	 */
//	public static void handleVoice(Long userid, String mediaId) {
//		// accesstoken
//		String accesstoken = "accesstoken";
//		InputStream is = null;
//		String url = "http://file.api.weixin.qq.com/cgi-bin/media/get?access_token=" + accesstoken + "&media_id="
//				+ mediaId;
//		try {
//			URL urlGet = new URL(url);
//			HttpURLConnection http = (HttpURLConnection) urlGet.openConnection();
//			http.setRequestMethod("GET"); // 必须是get方式请求
//			http.setRequestProperty("Content-Type", "application/x-www-form-urlencoded");
//			http.setDoOutput(true);
//			http.setDoInput(true);
//
//			System.setProperty("sun.net.client.defaultConnectTimeout", "30000");// 连接超时30秒
//			System.setProperty("sun.net.client.defaultReadTimeout", "30000"); // 读取超时30秒
//			http.connect();
//			// 获取文件转换byte流
//			is = http.getInputStream();
//			// 存储到硬盘中，原本音频格式为amr
//			String sourcePath = FileTool.writeFile(is, "_" + userid + ".amr", "voice");
//			// arm Convert Mp3
//			changeToMp3(sourcePath + "_" + userid + ".amr", sourcePath + "_" + userid + ".mp3");
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//	}
//
//	/**
//	 * @Title: changeToMp3
//	 * @Description: TODO(把amr格式的语音转换成MP3)
//	 * @param sourcePath
//	 *            amr格式文件路径
//	 * @param targetPath
//	 *            存放mp3格式文件路径
//	 */
//	public static void changeToMp3(String sourcePath, String targetPath) {
//		File source = new File(sourcePath);
//		File target = new File(targetPath);
//		AudioAttributes audio = new AudioAttributes();
//		Encoder encoder = new Encoder();
//
//		audio.setCodec("libmp3lame");
//		EncodingAttributes attrs = new EncodingAttributes();
//		attrs.setFormat("mp3");
//		attrs.setAudioAttributes(audio);
//		try {
//			encoder.encode(source, target, attrs);
//		} catch (IllegalArgumentException e) {
//			e.printStackTrace();
//		} catch (InputFormatException e) {
//			e.printStackTrace();
//		} catch (EncoderException e) {
//			e.printStackTrace();
//		}
//	}
//}
