package com.shsxt.test;

import static org.junit.Assert.*;

import java.lang.reflect.Proxy;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.shsxt.aop.LogInterceptor;
import com.shsxt.dao.UserDao;
import com.shsxt.dao.impl.UserDaoImpl;
import com.shsxt.model.User;
import com.shsxt.service.UserService;

public class TestSpring {

	@Test
	public void test(){
		
		ApplicationContext ctx = new ClassPathXmlApplicationContext("beans.xml");
	
		
		UserService us  = (UserService) ctx.getBean("userService");
		User user = new User();
		
		us.add(user);
		
		
		//scope="prototype"   不实现监控destroy(); 不能实现连在一起用
		ClassPathXmlApplicationContext	ctxx = (ClassPathXmlApplicationContext) ctx;
		ctxx.destroy();
		
		
		
	}
	@Test
	public void  testProxy (){
		
		UserDao userDao = new UserDaoImpl(); // 真实角色
		
		LogInterceptor li  = new LogInterceptor(); // 代理角色
		
		li.setTarget(userDao);  // 在代理角色中引入真实角色信息
		
		UserDao  userDaoProxy =  	(UserDao) Proxy.newProxyInstance(
				userDao.getClass().getClassLoader(),userDao.getClass().getInterfaces(), li);
		
	
		
		System.out.println(userDaoProxy);
		userDaoProxy.save(new User());
		
		userDaoProxy.del(new User());
	
	
	}
	
	
}
