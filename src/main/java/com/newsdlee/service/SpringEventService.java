package com.newsdlee.service;

import java.util.Map;

/**
 * @description 定义一个事件接口
 * @author NewsDLee
 * @version 2019年1月19日14:49:09
 */
public interface SpringEventService {

	void doAction(Map<String, Object> params);
}
