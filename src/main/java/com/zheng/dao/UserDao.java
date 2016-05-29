package com.zheng.dao;

import com.zheng.model.User;

public interface UserDao {
	public User selectUserById(Integer userId);  
}
