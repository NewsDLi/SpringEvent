package com.newsdlee.service.impl;

import java.util.Map;

import org.springframework.stereotype.Service;

import com.newsdlee.service.SpringEventService;

/**
 * @description 发送邮件的实现类
 * @author NewsDLee
 * @version 2019年1月19日14:49:09
 */
@Service
public class SendEmailEventServiceImpl implements SpringEventService{

	@Override
	public void doAction(Map<String, Object> params) {
		// 会员id
		String memberId = (String) params.get("memberId");
		// 发送的邮箱地址
		String sendEmail = (String) params.get("sendEmail");
		
		Map<String,Object> sendContent = (Map<String, Object>) params.get("emailContent");
		// 邮箱标题
		String title = (String) sendContent.get("title");
		// 发送的邮箱内容
		String content = (String) sendContent.get("content");
		
		System.out.println("会员id：" + memberId + "发送的邮箱地址：" + sendEmail + ",标题：" + title +",邮箱内容：" + content);
	}

}
