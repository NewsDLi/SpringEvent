package com.newsdlee.service.impl;

import java.util.Map;

import org.springframework.stereotype.Service;

import com.newsdlee.service.SpringEventService;

/**
 * @description 添加积分的实现类
 * @author NewsDLee
 * @version 2019年1月19日14:49:09
 */
@Service
public class AddPointsEventImpl implements SpringEventService{

	@Override
	public void doAction(Map<String, Object> params) {
		// 会员id
		String memberId = (String) params.get("memberId");
		// 添加的积分
		Integer points = (Integer) params.get("addPoints");
		
		System.out.println("会员id：" + memberId + "，添加的积分为：" + points);
	}

}
