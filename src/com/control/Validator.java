package com.control;

import java.sql.Date;
import java.util.Calendar;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;
import org.sword.wechat4j.WechatSupport;

public class Validator implements Controller {

	private static final long serialVersionUID = 1L;
	private static Logger logger = Logger.getLogger(Validator.class);
	
	public ModelAndView handleRequest(HttpServletRequest request,
			HttpServletResponse arg1) throws Exception {
		String signature = request.getParameter("signature");
//		// 时间戳
		String timestamp = request.getParameter("timestamp");
//		// 随机数
		String nonce = request.getParameter("nonce");
//		// 随机字符串
		String echostr = request.getParameter("echostr");
//		// 通过检验signature对请求进行校验，若校验成功则原样返回echostr，表示接入成功，否则接入失败
		Calendar cal = Calendar.getInstance();
		logger.info("request time:" + cal.getTimeInMillis());
		logger.info("request -- signature:" + signature
				+ "_timestamp:" + timestamp + "_nonce:" + nonce + "_echostr:" + echostr);
		WechatSupport support = new MyWeChatUtil(request);
		ModelAndView mv = new ModelAndView();  
//添加模型数据 可以是任意的POJO对象  
		String valRes = support.execute();
	    mv.addObject("echoMsg", valRes);
//设置逻辑视图名，视图解析器会根据该名字解析到具体的视图页面  
	    logger.info("validation result: " + valRes);
	    mv.setViewName("val"); 
	    logger.info("response time:" + cal.getTimeInMillis());
	    return mv;
	}
}
