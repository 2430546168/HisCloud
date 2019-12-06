package com.yhhis.controller.patientend;


import com.yhhis.common.entity.Chat;
import com.yhhis.common.entity.Message;
import com.yhhis.common.entity.WXPayOrders;
import com.yhhis.common.util.Util;
import com.yhhis.controller.webscoket.WebsocketServer;
import net.sf.json.JSONArray;
import net.sf.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;
import org.springframework.web.multipart.commons.CommonsMultipartResolver;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import java.util.Map;

@Controller
public class MsgController {

    @Autowired
    private CommonsMultipartResolver multipartResolver;

//    /**
//     *  聊天图片上传
////     * @param msgid     文件路径名
////     * @param msgfrom
////     * @param fromid
////     * @param toid
//     * @param response
//     * @param request
//     * @throws IllegalStateException
//     * @throws IOException
//     */
//    @RequestMapping(value = "/picture/upload", method = RequestMethod.POST)
//    public void upload(HttpServletRequest request, HttpServletResponse response) throws Exception {
//        //设置字符编码
//        request.setCharacterEncoding("UTF-8");
//        //将请求转成文件上传请求对象
//        MultipartHttpServletRequest multipartRequest = (MultipartHttpServletRequest) request;
//        //上传文件对象
//        MultipartFile multipartFile;
//        //验证表单格式
//        if (!multipartResolver.isMultipart(multipartRequest)) {
//            response.getWriter().write("<script>parent.uploadComplete({error : 1 ,result : '表单数据格式错误!'});</script>");
//            return;
//        }
//
//    }
//	@RequestMapping(value = "/imgupload",method = RequestMethod.POST)
//	public void imgUpload(String msgid,int msgfrom,String fromid,String toid,HttpServletResponse response,
//			HttpServletRequest request) throws IllegalStateException, IOException{
//		response.setCharacterEncoding("UTF-8");
//		response.setContentType("text/html;charset=UTF-8");
//		PrintWriter writer = response.getWriter();
//		MultipartHttpServletRequest multipartRequest = (MultipartHttpServletRequest) request;
//		List<MultipartFile> files = multipartRequest.getFiles("files[]");
//		String[] imgdata = request.getParameterValues("imgdata[]");
////		System.out.println("msgfrom:" + msgfrom);
//		String sourceUrl = "";
//		// 获取文件 存储位置
//		String realPath = request.getSession().getServletContext()
//				.getRealPath("");
////		System.out.println(realPath);
//		realPath = realPath.substring(0, realPath.lastIndexOf("\\"))
//				+ "\\uploadFile\\msg\\" + msgid + "\\image";
//		String relPath = "../../uploadFile/msg/" + msgid + "/image";
//		File pathFile = new File(realPath);
//
//		if (!pathFile.exists()) {
//			// 文件夹不存 创建文件
//			pathFile.mkdirs();
//		}
//		JSONArray results = new JSONArray();
//		// 将文件copy上传到服务器
//		int i = 0;
//		for (MultipartFile file : files){
//			file.transferTo(new File(realPath + "/" + file.getOriginalFilename()));
//			sourceUrl = relPath + "/" + file.getOriginalFilename().replace("%", "%25");
//			Message message = new Message();
//			String msgDate = Util.getTime("yyyy-MM-dd HH:mm:ss");
//			String sendMsg = "{'msgid':'" + msgid + "','from':'" + fromid + "','msg':'" + imgdata[i] +
//					"','url':'" + sourceUrl + "','datatype':'image','date':'" + msgDate + "','msgfrom':" + msgfrom + "}";
//			results.add("{'id':'" + i + "','url':'" + sourceUrl + "'}");
//			String requestUrl = request.getRequestURL().toString();
//			String requestUri = request.getRequestURI();
//			String domain = requestUrl.replace(requestUri,"");
//			String chatUrl = "";
//			try {
//				WebsocketServer service = WebsocketServer.webSocketMap.get(toid);
////				 Template tem=new Template();
////			     tem.setTopColor("#00DD00");
////			     List<TemplateParam> paras=new ArrayList<TemplateParam>();
////				if(service != null){
////					service.session.getBasicRemote().sendText(sendMsg);
////					message.setMsgStatus(1);
////				}else{
////					message.setMsgStatus(0);
////					if(msgfrom == 1){
////						Doctor doctor = doctormanager.getDoctorByCode(fromid);
////		        		chatUrl = domain + "/getchat.do?msgid=" + msgid;
////		        		String msgids = WxConfig.CONREPLY_TEMPLATE_ID;
////		        		tem.setToUser(toid);
////		        		tem.setTemplateId(msgids);
////		        		//Doctor doctor = doctormanager.getDoctorByCode(userId);
////		        		paras.add(new TemplateParam("first","","#FF3333"));
////		        		paras.add(new TemplateParam("keyword1",doctor.getDocname(),"#0044BB"));
////		        		paras.add(new TemplateParam("keyword2",msgDate,"#0044BB"));
////		        		paras.add(new TemplateParam("keyword5","图片消息","#0044BB"));
////		        		paras.add(new TemplateParam("Remark","这是remark","#0044CB"));
////
////		        		tem.setTemplateParamList(paras);
////		        		tem.setUrl(chatUrl);
////		        		wxmanager.sendTemplateMsg(tem);
////		        	}else if(msgfrom == 0){
////		        		chatUrl = domain + "/chat_doctor.jsp?msgid=" + msgid;
////		        		Doctor doctor = doctormanager.getDoctorByCode(toid);
////		        		WxUserInfo userinfo=wxmanager.getUserInfo("", fromid);
////		        		if(!Util.isEmpty(doctor.getOpenid())){
////		        			String msgids = WxConfig.CONNOTICE_TEMPLATE_ID;
////		        			tem.setTemplateId(msgids);
////		        			tem.setToUser(doctor.getOpenid());
////
////		            		paras.add(new TemplateParam("first","","#FF3333"));
////		            		paras.add(new TemplateParam("keyword1",userinfo.getNickname(),"#0044BB"));
////		            		paras.add(new TemplateParam("keyword2",msgDate,"#0044BB"));
////		            		paras.add(new TemplateParam("keyword3","图片消息","#0044BB"));
////		            		paras.add(new TemplateParam("Remark","这是remark","#0044CB"));
////		            		tem.setTemplateParamList(paras);
////		            		tem.setUrl(chatUrl);
////		        			wxmanager.sendTemplateMsg(tem);
////		        			//wxmanager.sendTextCoustomMsg(doctor.getOpenid(), "您有一条来自患者咨询的新消息，请及时<a href='" + chatUrl + "'>查看</a>");
////		        		}
////		        	}
////				}
//			} catch (Exception e) {
////				Util.logException("发送图片websocket异常", e);
////				if(msgfrom == 1){
////	        		chatUrl = domain + "/getchat.do?msgid=" + msgid;
////	        		//wxmanager.sendTextCoustomMsg(toid, "您有一条来自医生的新回复，请及时<a href='" + chatUrl + "'>查看</a>");
////	        	}else if(msgfrom == 0){
////	        		chatUrl = domain + "/chat_doctor.jsp?msgid=" + msgid;
////	        		Doctor doctor = doctormanager.getDoctorByCode(toid);
////	        		if(!Util.isEmpty(doctor.getOpenid())){
////	        			//wxmanager.sendTextCoustomMsg(doctor.getOpenid(), "您有一条来自患者咨询的新消息，请及时<a href='" + chatUrl + "'>查看</a>");
////	        		}
////	        	}
////				WebsocketServer.webSocketMap.remove(toid);
//			}
//			message.setMsgId(msgid);
//			message.setFromId(fromid);
//			message.setToId(toid);
//			message.setMsg(imgdata[i]);
//			message.setMsgDate(msgDate);
//			message.setMsgType("image");
//			message.setSourceUrl(sourceUrl);
//			i++;
//			try {
////	        	msgmanager.addMsg(message,msgfrom);
//			} catch (Exception e) {
//				Util.log("保存消息出错:" + message.toString());
//				Util.logException("保存消息出错", e);
//			}
//		}
//
//		writer.print(results);
//		writer.flush();
//		writer.close();
//	}

//	//聊天语音上传
//	@RequestMapping("voiceupload")
//	public void voiceUpload(int msgfrom,String msgid,String fromid,String toid,String mediaid,HttpServletResponse response,
//			HttpServletRequest request) throws IOException{
//		response.setCharacterEncoding("UTF-8");
//		response.setContentType("text/html;charset=UTF-8");
//		PrintWriter writer = response.getWriter();
//		String sourceUrl = "";
//		String filename = "";
////		System.out.println("msgfrom:" + msgfrom);
//		// 获取文件 存储位置
//		String realPath = request.getSession().getServletContext()
//				.getRealPath("");
//
//		realPath = realPath.substring(0, realPath.lastIndexOf("\\"))
//				+ "\\uploadFile\\msg\\" + msgid + "\\voice";
//		String relPath = "../../uploadFile/msg/" + msgid + "/voice";
//
//		String requestUrl = request.getRequestURL().toString();
//		String requestUri = request.getRequestURI();
//		String domain = requestUrl.replace(requestUri,"");
//		String chatUrl = "";
//
//		filename = wxmanager.getVoiceMsg(mediaid, msgid, realPath);
////		System.out.println(filename);
//		if(!filename.equals("")){
//			sourceUrl = relPath + "/" + filename;
//			Message message = new Message();
//			String msgDate = Util.getTime("yyyy-MM-dd HH:mm:ss");
//			String sendMsg = "{'msgid':'" + msgid + "','from':'" + fromid + "','msg':'','url':'" + sourceUrl
//					+ "','datatype':'voice','date':'" + msgDate + "','msgfrom':" + msgfrom + "}";
//			try {
//				WebsocketServer service = WebsocketServer.webSocketMap.get(toid);
//				 Template tem=new Template();
//			     tem.setTopColor("#00DD00");
//			     List<TemplateParam> paras=new ArrayList<TemplateParam>();
//				if(service != null){
//					service.session.getBasicRemote().sendText(sendMsg);
//					message.setMsgStatus(1);
//				}else{
//					message.setMsgStatus(0);
//					if(msgfrom == 1){
//						Doctor doctor = doctormanager.getDoctorByCode(fromid);
//		        		chatUrl = domain + "/getchat.do?msgid=" + msgid;
//		        		String msgids = WxConfig.CONREPLY_TEMPLATE_ID;
//		        		tem.setToUser(toid);
//		        		tem.setTemplateId(msgids);
//		        		//Doctor doctor = doctormanager.getDoctorByCode(userId);
//		        		paras.add(new TemplateParam("first","","#FF3333"));
//		        		paras.add(new TemplateParam("keyword1",doctor.getDocname(),"#0044BB"));
//		        		paras.add(new TemplateParam("keyword2",msgDate,"#0044BB"));
//		        		paras.add(new TemplateParam("keyword5","语音消息","#0044BB"));
//		        		paras.add(new TemplateParam("Remark","这是remark","#0044CB"));
//
//		        		tem.setTemplateParamList(paras);
//		        		tem.setUrl(chatUrl);
//		        		wxmanager.sendTemplateMsg(tem);
//		        		//wxmanager.sendTextCoustomMsg(toid, "您有一条来自医生的新回复，请及时<a href='" + chatUrl + "'>查看</a>");
//		        	}else if(msgfrom == 0){
//		        		chatUrl = domain + "/chat_doctor.jsp?msgid=" + msgid;
//		        		Doctor doctor = doctormanager.getDoctorByCode(toid);
//		        		WxUserInfo userinfo=wxmanager.getUserInfo("", fromid);
//		        		if(!Util.isEmpty(doctor.getOpenid())){
//		        			String msgids = WxConfig.CONNOTICE_TEMPLATE_ID;
//		        			tem.setTemplateId(msgids);
//		        			tem.setToUser(doctor.getOpenid());
//
//		            		paras.add(new TemplateParam("first","","#FF3333"));
//		            		paras.add(new TemplateParam("keyword1",userinfo.getNickname(),"#0044BB"));
//		            		paras.add(new TemplateParam("keyword2",msgDate,"#0044BB"));
//		            		paras.add(new TemplateParam("keyword3","语音消息","#0044BB"));
//		            		paras.add(new TemplateParam("Remark","这是remark","#0044CB"));
//		            		tem.setTemplateParamList(paras);
//		            		tem.setUrl(chatUrl);
//		        			wxmanager.sendTemplateMsg(tem);
//		        		if(!Util.isEmpty(doctor.getOpenid())){
//		        			//wxmanager.sendTextCoustomMsg(doctor.getOpenid(), "您有一条来自患者咨询的新消息，请及时<a href='" + chatUrl + "'>查看</a>");
//		        		}
//		        	}
//		        	}
//				}
//			} catch (Exception e) {
//				if(msgfrom == 1){
//	        		chatUrl = domain + "/getchat.do?msgid=" + msgid;
//	        		//wxmanager.sendTextCoustomMsg(toid, "您有一条来自医生的新回复，请及时<a href='" + chatUrl + "'>查看</a>");
//	        	}else if(msgfrom == 0){
//	        		chatUrl = domain + "/chat_doctor.jsp?msgid=" + msgid;
//	        		Doctor doctor = doctormanager.getDoctorByCode(toid);
//	        		if(!Util.isEmpty(doctor.getOpenid())){
//	        			//wxmanager.sendTextCoustomMsg(doctor.getOpenid(), "您有一条来自患者咨询的新消息，请及时<a href='" + chatUrl + "'>查看</a>");
//	        		}
//	        	}
//				Util.logException("发送语音websocket异常", e);
//			}
//			message.setMsgId(msgid);
//			message.setFromId(fromid);
//			message.setToId(toid);
//			message.setMsg("");
//			message.setMsgDate(msgDate);
//			message.setMsgType("voice");
//			message.setSourceUrl(sourceUrl);
//			try {
//	        	msgmanager.addMsg(message,msgfrom);
//			} catch (Exception e) {
//				Util.log("保存消息出错:" + message.toString());
//				Util.logException("保存消息出错", e);
//			}
//		}
//		writer.print(sourceUrl);
//		writer.flush();
//		writer.close();
//	}
//
//	//新建会话
//	@RequestMapping("newchat")
//	public void newChat(HttpServletResponse response,
//			HttpServletRequest request) throws ServletException, IOException{
//		response.setCharacterEncoding("UTF-8");
//		response.setContentType("text/html;charset=UTF-8");
//		PrintWriter writer = response.getWriter();
//		JSONObject res = new JSONObject();
//		String doctor = request.getParameter("doctor");
//		String user  = request.getParameter("user");
//		float fee = Float.parseFloat(request.getParameter("fee"));
//		String tradeNo = request.getParameter("tradeno");
//		boolean tradeNoUse = false;
//
////		System.out.println("firstshare:" + firstshare + ",secondshare:" + secondshare);
//		Doctor doc = doctormanager.getDoctorByCode(doctor);
//		if(fee > 0){
//			/**
//			 * 如果传过来的费用>0,先验证跟设置的医生咨询费用是否一致，
//			 * 再验证支付订单是否有效,只有两次验证都通过才能创建咨询会话。
//			 */
//			WXPayOrders order = wxpaymanager.getOrder(tradeNo);
//			if(order.getStatus() == 0){
//				order = wxpaymanager.queryOrder(tradeNo);
//			}
//			switch (order.getStatus()) {
//			case 1:
//				tradeNoUse = consultmanager.checkOrder(order);
//				if(doc == null){
//					res.accumulate("code", "0");
//					res.accumulate("msg", "未找到医生");
//				}else if(doc.getInfee() * 100 != order.getTotalfee()){
//					res.accumulate("code", 0);
//					res.accumulate("msg", "支付金额和医生咨询费用不一致");
//					if(tradeNoUse){
//						wxpaymanager.reFund(tradeNo);
//					}
//				}else{
//					WxUserInfo wxUser = wxmanager.getUserInfo("", (Util.isEmpty(user) ? order.getOpenid() : user));
//					if(wxUser == null){
//						res.accumulate("code", 0);
//						res.accumulate("msg", "未找到用户信息，请尝试刷新或重新打开页面再试");
//						if(tradeNoUse){
//							wxpaymanager.reFund(tradeNo);
//						}
//					}else{
//						Chat chat = msgmanager.newChat(doctor,user,fee,tradeNo,firstshare,secondshare,thirdshare);
//						if(chat == null){
//							res.accumulate("code", "0");
//							res.accumulate("msg", "创建会话失败");
//						}else{
//							res.accumulate("code", "1");
//							res.accumulate("msg", "成功");
//							res.accumulate("chat", JSONObject.fromObject(chat));
//						}
//					}
//				}
//				break;
//			case 2:
//				res.accumulate("code", 0);
//				res.accumulate("msg", "订单已退款");
//				break;
//			default:
//				res.accumulate("code", 0);
//				res.accumulate("msg", "订单无效");
//				break;
//			}
//		}else{
//			/**如果传过来的费用=0,验证设置的医生咨询费用为零才能创建会话
//			 * 必要的验证：医生编码是否存在，user是否存在
//			 */
//			if(!Util.isEmpty(doctor) && !Util.isEmpty(user)){
//				if(doc == null){
//					res.accumulate("code", "0");
//					res.accumulate("msg", "未找到医生");
//				}else if(doc.getInfee()>0){
//					res.accumulate("code", "0");
//					res.accumulate("msg", "该医生不是免费咨询");
//				}else{
//					WxUserInfo wxUser = wxmanager.getUserInfo("", user);
//					if(wxUser == null){
//						res.accumulate("code", "0");
//						res.accumulate("msg", "未找到用户信息");
//					}else{
//						Chat chat = msgmanager.getActiveChat(doctor,user);
//						if(chat != null){
//							res.accumulate("code", "1");
//							res.accumulate("msg", "已存在会话");
//							res.accumulate("chat", JSONObject.fromObject(chat));
//						}else{
//							chat = msgmanager.newChat(doctor,user,fee,"",firstshare,secondshare,thirdshare);
//							if(chat == null){
//								res.accumulate("code", "0");
//								res.accumulate("msg", "创建会话失败");
//							}else{
//								res.accumulate("code", "1");
//								res.accumulate("msg", "成功");
//								res.accumulate("chat", JSONObject.fromObject(chat));
//							}
//						}
//					}
//				}
//			}else{
//				res.accumulate("code", "0");
//				res.accumulate("msg", "参数不能为空");
//			}
//		}
////		System.out.println(res);
//		writer.print(res);
//		writer.flush();
//		writer.close();
//	}
//
//	//获取医生所有会话
//	@RequestMapping("getchats")
//	public void getChats(HttpServletResponse response,
//			HttpServletRequest request) throws IOException{
//		response.setCharacterEncoding("UTF-8");
//		response.setContentType("text/html;charset=UTF-8");
//		PrintWriter writer = response.getWriter();
//		JSONObject res = new JSONObject();
//		String doctor = request.getParameter("doctor");
//
//		if(Util.isEmpty(doctor)){
//			res.accumulate("code", "0");
//			res.accumulate("msg", "医生不能为空");
//		}else{
//			List<Map<String,String>> map = msgmanager.getChatMap(doctor);
//			if(map != null && map.size()>0){
//				res.accumulate("code", "1");
//				res.accumulate("msg", "成功");
//				res.accumulate("chats", JSONArray.fromObject(map));
//
//				List<Map<String,Object>> counts = msgmanager.getMsgCount(doctor);
//				if(counts != null && counts.size()>0){
//					int msgs = 0;
//					for(Map<String,Object> count : counts){
//						msgs += Integer.parseInt(count.get("count").toString());
//					}
//					res.accumulate("count", msgs);
//					res.accumulate("details", JSONArray.fromObject(counts));
//				}else{
//					res.accumulate("count", 0);
//				}
//			}else{
//				res.accumulate("code", "1");
//				res.accumulate("msg", "成功");
//				res.accumulate("chats", "");
//				res.accumulate("count", 0);
//			}
//		}
////		System.out.println(res);
//		writer.print(res);
//		writer.flush();
//		writer.close();
//	}
//
//	//获取聊天记录
//	@RequestMapping("getmsgs")
//	public void getMsgs(HttpServletResponse response,
//			HttpServletRequest request) throws IOException{
//
//		response.setCharacterEncoding("UTF-8");
//		response.setContentType("text/html;charset=UTF-8");
//		PrintWriter writer = response.getWriter();
//		JSONObject res = new JSONObject();
//		String msgid = request.getParameter("msgid");
//		String userid = request.getParameter("user");
//
//		if(Util.isEmpty(msgid)){
//			res.accumulate("code", "0");
//			res.accumulate("msg", "msgid不能为空");
//		}else{
//			List<Message> msgs = msgmanager.getMsgs(msgid);
//			if(msgs != null && msgs.size()>0){
//				res.accumulate("code", "1");
//				res.accumulate("msg", "成功");
//				res.accumulate("msgs", JSONArray.fromObject(msgs));
//				msgmanager.markRead(msgid,userid);
//			}else{
//				res.accumulate("code", "1");
//				res.accumulate("msg", "成功");
//				res.accumulate("msgs", "");
//			}
//			Map<String, Object> chat = msgmanager.getChatMapByID(msgid);
//			res.accumulate("chat", chat);
//		}
////		System.out.println(res);
//		writer.print(res);
//		writer.flush();
//		writer.close();
//	}
//	//获取未读消息
//	@RequestMapping("getmsgcount")
//	public void getMsgCount(HttpServletResponse response,
//			HttpServletRequest request) throws IOException{
//		response.setCharacterEncoding("UTF-8");
//		response.setContentType("text/html;charset=UTF-8");
//		PrintWriter writer = response.getWriter();
//		String userid = request.getParameter("user");
//
//		JSONObject res = new JSONObject();
//
//		List<Map<String,Object>> counts = msgmanager.getMsgCount(userid);
//
//		if(counts != null && counts.size()>0){
//			int msgs = 0;
//			for(Map<String,Object> count : counts){
//				msgs += Integer.parseInt(count.get("count").toString());
//			}
//			res.accumulate("count", msgs);
//			res.accumulate("details", JSONArray.fromObject(counts));
//		}else{
//			res.accumulate("count", 0);
//		}
//		writer.print(res);
//		writer.flush();
//		writer.close();
//	}
//
//	//获取一个会话，用来处理公众号通知的跳转
//	@RequestMapping("getchat")
//	public void getChat(HttpServletResponse response,
//			HttpServletRequest request) throws ServletException, IOException{
//		String msgid = request.getParameter("msgid");
//		String openid = "";
//		WxUserInfo info = (WxUserInfo) request.getAttribute("info");
//		if(info == null){
//			openid=(String) request.getSession().getAttribute("openid");
//			if(openid == null){
//				String requestUrl = request.getRequestURL().toString();
//				String requestUri = request.getRequestURI();
//
//				String domain = requestUrl.replace(requestUri,"");
//				String url = wxmanager.getAuthUrl(WxConfig.SNSAPI_USER, domain + "/wxauthuser.do", "getchat.do?msgid=" + msgid);
//				response.sendRedirect(url);
//			}else{
//				info = wxmanager.getUserInfo("", openid);
//				Map<String, Object> chat = msgmanager.getChatMapByID(msgid);
//				if(chat.get("userid").equals(info.getOpenid())){
//					request.setAttribute("info", info);
//					request.setAttribute("chat", chat);
//					request.getRequestDispatcher("/chat.jsp").forward(request, response);
//				}else{
////					System.out.println("非法请求");
//					response.setCharacterEncoding("UTF-8");
//					response.setContentType("text/html;charset=UTF-8");
//					PrintWriter writer = response.getWriter();
//					writer.print("非法的请求");
//					writer.flush();
//					writer.close();
//				}
//			}
//		}else{
//			Map<String, Object> chat = msgmanager.getChatMapByID(msgid);
//			if(chat.get("userid").equals(info.getOpenid())){
//				request.setAttribute("info", info);
//				request.setAttribute("chat", chat);
//				request.getRequestDispatcher("/chat.jsp").forward(request, response);
//			}else{
////				System.out.println("非法请求");
//				response.setCharacterEncoding("UTF-8");
//				response.setContentType("text/html;charset=UTF-8");
//				PrintWriter writer = response.getWriter();
//				writer.print("非法的请求");
//				writer.flush();
//				writer.close();
//			}
//		}
//	}
//
//	//根据msgid获取回话
//	@RequestMapping("getachat")
//	public void getChatById(HttpServletResponse response,
//			HttpServletRequest request) throws IOException{
//		response.setCharacterEncoding("UTF-8");
//		response.setContentType("text/html;charset=UTF-8");
//		PrintWriter writer = response.getWriter();
//		JSONObject res = new JSONObject();
//		String msgid = request.getParameter("msgid");
//
//		if(Util.isEmpty(msgid)){
//			res.accumulate("code", "0");
//			res.accumulate("msg", "msgid不能为空");
//		}else{
//			Map<String, Object> map = msgmanager.getChatMapByID(msgid);
//			if(map != null && map.size()>0){
//				String doc = "";
//				res.accumulate("code", "1");
//				res.accumulate("msg", "成功");
//				res.accumulate("chat", JSONObject.fromObject(map));
//				doc = (String)map.get("doccode");
//				if(!Util.isEmpty(doc)){
//					Doctor doctor = doctormanager.getDoctorByCode(doc);
//					res.accumulate("openid",doctor.getOpenid());
//				}
//
//			}else{
//				res.accumulate("code", "1");
//				res.accumulate("msg", "成功");
//				res.accumulate("chat", "");
//			}
//		}
////		System.out.println(res);
//		writer.print(res);
//		writer.flush();
//		writer.close();
//	}
//
//	//查询正在咨询的会话
//	@RequestMapping("getactivechat")
//	public void getActiveChat(HttpServletResponse response,
//			HttpServletRequest request) throws IOException{
//		response.setCharacterEncoding("UTF-8");
//		response.setContentType("text/html;charset=UTF-8");
//		PrintWriter writer = response.getWriter();
//		JSONObject res = new JSONObject();
//
//		String doctor = request.getParameter("doctor");
//		String user  = request.getParameter("user");
//
//		Chat chat = msgmanager.getActiveChat(doctor,user);
//		if(chat != null){
//			res.accumulate("code", "1");
//			res.accumulate("chat", JSONObject.fromObject(chat));
//		}else{
//			res.accumulate("code", "0");
//		}
////		System.out.println(res);
//		writer.print(res);
//		writer.flush();
//		writer.close();
//	}
//
//	@RequestMapping("getdepchat")
//	public void getChatsByDep(HttpServletResponse response,
//			HttpServletRequest request) throws IOException{
//		response.setCharacterEncoding("UTF-8");
//		response.setContentType("text/html;charset=UTF-8");
//		PrintWriter writer = response.getWriter();
//		JSONObject res = new JSONObject();
//
//		String depcode = request.getParameter("depcode");
////		System.out.println(depcode);
////		String userid = request.getParameter("userid");
//		if(Util.isEmpty(depcode)){
//			res.accumulate("code", "0");
//			res.accumulate("msg", "科室不能为空");
//		}else{
//			List<Map<String,String>> map = msgmanager.getChatMapByDep(depcode);
//			if(map != null && map.size()>0){
//				res.accumulate("code", "1");
//				res.accumulate("msg", "成功");
//				res.accumulate("chats", JSONArray.fromObject(map));
//			}else{
//				res.accumulate("code", "1");
//				res.accumulate("msg", "成功");
//				res.accumulate("chats", "");
//			}
//		}
////		System.out.println(res);
//		writer.print(res);
//		writer.flush();
//		writer.close();
//	}
}
