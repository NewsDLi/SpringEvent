package com.newsdlee.spring.listener;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

import com.newsdlee.service.impl.UpdateDBEventImpl;
import com.newsdlee.spring.event.UpdateDBEvent;

/**
 * @description 创建一个监听类，相当于行人（不管是否使用交通工具），需要实现ApplicationListener接口，并且重写onApplicationEvent方法，可以理解成这个行人需要看信号灯，并且能理解信号灯的意思才行。否则不看信号灯跟没有信号灯没有区别，看了不理解也没用
 * @author NewsDLee
 * @version 2019年1月19日14:52:39
 */
@Component
public class UpdateDBListener implements ApplicationListener<UpdateDBEvent>{

	@Autowired
	private UpdateDBEventImpl updateDBEventImpl;
	
	@Override
	public void onApplicationEvent(UpdateDBEvent event) {
		updateDBEventImpl.doAction(event.getParams());
	}

}
