package com.shsxt.service;

import com.shsxt.dao.UserDao;
import com.shsxt.dao.impl.UserDaoImpl;
import com.shsxt.model.User;

public class UserService {
	
	private UserDao dao ;
	
	
	private void init() {
		System.out.println("bean 加载的时候 开始书写日志的开始");

	}
	
	private void destroy() {
		
		System.out.println("spring 开始关闭的时刻");

	}
	
	public UserDao getDao() {
		return dao;
	}

	public void setDao(UserDao dao) {
		this.dao = dao;
	}

	
	public void add(User user) {
		this.dao.save(user);
	}

}
