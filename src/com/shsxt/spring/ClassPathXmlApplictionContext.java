package com.shsxt.spring;

import java.util.HashMap;
import java.util.Map;

public class ClassPathXmlApplictionContext implements BeansFactory {

	private Map<String, Object> beans = new HashMap<>();

	
	
	// 从配置文件里面读取信息放置map中
	
	
	
	@Override
	public Object getBean(String name) {
		// 从容器中获取参数即可
		return beans.get(name);
	}
	
	
}
