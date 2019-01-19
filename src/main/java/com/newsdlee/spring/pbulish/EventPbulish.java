package com.newsdlee.spring.pbulish;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationEvent;
import org.springframework.stereotype.Component;


/**
 * @description 控制信号灯变化的东西，相当于是给他接好电线，给他一个正常变换红黄绿的程序和电路。
 * @author NewsDLee
 * @version 2019年1月19日15:00:39
 */
@Component
public class EventPbulish {

	@Autowired
	private ApplicationContext applicationContext;
	
	public void publish(ApplicationEvent event) {
		applicationContext.publishEvent(event);
    }
}
