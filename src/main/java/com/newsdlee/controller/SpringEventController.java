package com.newsdlee.controller;

import java.util.HashMap;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.newsdlee.spring.event.AddPointsEvent;
import com.newsdlee.spring.event.SendEmailEvent;
import com.newsdlee.spring.event.UpdateDBEvent;
import com.newsdlee.spring.pbulish.EventPbulish;

@Controller
public class SpringEventController {

	/**
	 * 这里我理解为事件触发器，我们可以通过它来触发我们想要触发的事件
	 */
	@Resource(name="eventPbulish")
	private EventPbulish eventPbulish;
	
	/**
	 * @description 这里我们简单的模拟一下用户注册成功之后我们需要做的一些事情，比如：注册成功之后我们需要为用户发放积分、发送邮件、更新数据库等操作，都可以通过事件的形式来进行触发
	 * @return
	 */
	@RequestMapping("/user/register")
	@ResponseBody
	public String userRegister(){
		// 这里我们直接模拟用户注册成功之后的操作
		
		// 这里懒省事,使用了同一个map进行传参
		Map<String, Object> params = new HashMap<>();
		// 用户的id
		params.put("memberId", "123456");
		// 添加的积分
		params.put("addPoints", 50);
		// 发送的用户邮箱
		params.put("sendEmail", "12346@163.com");
		// 发送的邮箱内容
		Map<String, Object> emailContent = new HashMap<>();
		emailContent.put("title", "注册成功！");
		emailContent.put("content", "你好用户邮箱名称为:12346@163.com的用户,恭喜您成为xxxx的会员!");
		params.put("emailContent", emailContent);
		
		// 添加积分事件
		AddPointsEvent addPoints = new AddPointsEvent(this, params);
		// 发送邮件事件
		SendEmailEvent sendEmail = new SendEmailEvent(this, params);
		// 更新数据库事件
		UpdateDBEvent updateDB = new UpdateDBEvent(this, params);
		eventPbulish.publish(addPoints);
		eventPbulish.publish(sendEmail);
		eventPbulish.publish(updateDB);
		return "demo";
	}
}
