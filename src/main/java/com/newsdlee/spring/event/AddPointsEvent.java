package com.newsdlee.spring.event;

import java.util.Map;

import org.springframework.context.ApplicationEvent;

/**
 * @description 定义一个event事件，需要继承ApplicationEvent，并实现它的方法，相当于安装了一个没有通电，没有灯光的信号灯，需要具有信号灯的基本特征
 * @author NewsDLee
 * @version 2019年1月19日14:49:09
 */
public class AddPointsEvent extends ApplicationEvent{

	private static final long serialVersionUID = 2977278121453197257L;

	private Map<String, Object> params;
	
	public AddPointsEvent(Object source, Map<String, Object> params) {
		super(source);
		this.params = params;
	}

	public Map<String, Object> getParams() {
		return params;
	}

	public void setParams(Map<String, Object> params) {
		this.params = params;
	}
	

	
}
