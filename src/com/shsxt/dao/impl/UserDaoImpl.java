package com.shsxt.dao.impl;

import com.shsxt.dao.UserDao;
import com.shsxt.model.User;

public class UserDaoImpl implements UserDao {

	@Override
	public void save(User user) {
	
		System.out.println("a user savede!");
	}

	@Override
	public void del(User user) {
		System.out.println("a user del!");
		
	}	
	
}
