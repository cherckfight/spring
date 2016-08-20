package com.shsxt.dao;

import com.shsxt.model.User;

public interface UserDao {	
	public void save(User user);
	public void del(User user);
}
