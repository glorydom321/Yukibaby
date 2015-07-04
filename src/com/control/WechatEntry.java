package com.control;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;
import org.sword.wechat4j.WechatSupport;
import org.sword.wechat4j.message.CustomerMsg;
import org.sword.wechat4j.user.UserManager;

public class WechatEntry extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private static Logger logger = Logger.getLogger(WechatEntry.class);

	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
//		String signature = request.getParameter("signature");
//		// 时间戳
//		String timestamp = request.getParameter("timestamp");
//		// 随机数
//		String nonce = request.getParameter("nonce");
//		// 随机字符串
//		String echostr = request.getParameter("echostr");
		PrintWriter out = response.getWriter();
//		// 通过检验signature对请求进行校验，若校验成功则原样返回echostr，表示接入成功，否则接入失败
////		if (SignUtil.checkSignature(signature, timestamp, nonce)) {
////		}
//		out.print(echostr);
//		out.close();
//		out = null;
		WechatSupport support = new MyWeChatUtil(request);
		out.print(support.execute());
	}

	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		
		WechatSupport support = new MyWeChatUtil(request);
		logger.info("what request i got? " + request);
		response.setCharacterEncoding("UTF-8");
		response.setHeader("content-type", "text/html;charset=UTF-8");
		PrintWriter out = response.getWriter();
		out.print(support.execute());
		
	}

}
