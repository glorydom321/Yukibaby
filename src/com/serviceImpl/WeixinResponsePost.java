package com.serviceImpl;

import javax.servlet.http.HttpServletRequest;

import com.service.WexinSupport;

public class WeixinResponsePost extends WexinSupport {

	public WeixinResponsePost(HttpServletRequest request) {
		super(request);
		
	}

	@Override
	protected void onText() {
		// get a message from user
				String content = super.wechatRequest.getContent().trim();
				// responseText("你好，你的输入为 " + content + ""
				// + " 功能正在开发中，敬请期待");
				responseNew(
						"yuki",
						"testpage",
						"https://mmbiz.qlogo.cn/mmbiz/TItWibQOzwKcIgfSzHCjuutGq3pggLYB11Rl2zfKFF6aLibXibyq4xqHHTnSR3acTpJ9Zj7icic8o00RYXaUdSMEEyg/0?wx_fmt=jpeg",
						"http://yukibaby.duapp.com/Yuki/main.do");
	}

	@Override
	protected void onImage() {
		// TODO Auto-generated method stub
		
	}

	@Override
	protected void onVoice() {
		// TODO Auto-generated method stub
		
	}

	@Override
	protected void onVideo() {
		// TODO Auto-generated method stub
		
	}

	@Override
	protected void onLocation() {
		// TODO Auto-generated method stub
		
	}

	@Override
	protected void onLink() {
		// TODO Auto-generated method stub
		
	}

	@Override
	protected void onUnknown() {
		// TODO Auto-generated method stub
		
	}

	@Override
	protected void click() {
		// TODO Auto-generated method stub
		
	}

	@Override
	protected void subscribe() {
		// TODO Auto-generated method stub
		
	}

	@Override
	protected void unSubscribe() {
		// TODO Auto-generated method stub
		
	}

	@Override
	protected void scan() {
		// TODO Auto-generated method stub
		
	}

	@Override
	protected void location() {
		// TODO Auto-generated method stub
		
	}

	@Override
	protected void view() {
		// TODO Auto-generated method stub
		
	}

	@Override
	protected void templateMsgCallback() {
		// TODO Auto-generated method stub
		
	}

	@Override
	protected void scanCodePush() {
		// TODO Auto-generated method stub
		
	}

	@Override
	protected void scanCodeWaitMsg() {
		// TODO Auto-generated method stub
		
	}

	@Override
	protected void picSysPhoto() {
		// TODO Auto-generated method stub
		
	}

	@Override
	protected void picPhotoOrAlbum() {
		// TODO Auto-generated method stub
		
	}

	@Override
	protected void picWeixin() {
		// TODO Auto-generated method stub
		
	}

	@Override
	protected void locationSelect() {
		// TODO Auto-generated method stub
		
	}

}
