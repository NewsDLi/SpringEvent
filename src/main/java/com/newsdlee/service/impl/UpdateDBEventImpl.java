package com.newsdlee.service.impl;

import java.util.Map;

import org.springframework.stereotype.Service;

import com.newsdlee.service.SpringEventService;

/**
 * @description 更新数据库的实现类
 * @author NewsDLee
 * @version 2019年1月19日14:49:09
 */
@Service
public class UpdateDBEventImpl implements SpringEventService{

	@Override
	public void doAction(Map<String, Object> params) {
		// 会员id
		String memberId = (String) params.get("memberId");
		
		System.out.println("更新会员的id:" + memberId);
	}

}
