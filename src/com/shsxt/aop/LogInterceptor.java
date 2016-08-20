package com.shsxt.aop;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class LogInterceptor implements InvocationHandler {

	private Object target;
	
	
	public Object getTarget() {
		return target;
	}

	public void setTarget(Object target) {
		this.target = target;
	}

	public void beforeMethod(Method method) {
		System.out.println(method.getName()+ " start");
	}

	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		
		beforeMethod(method);
		
		//method.invok(target, args);  // 代理角色执行目标 (方法,参数)
		return null;
	}

}
