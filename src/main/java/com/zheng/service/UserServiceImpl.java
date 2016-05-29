package com.zheng.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zheng.dao.UserDao;
import com.zheng.model.User;
import com.zheng.service.UserService;

@Service
public class UserServiceImpl implements UserService {
	@Autowired  
    private UserDao userDao;  
  
    public User selectUserById(Integer userId) {  
        return userDao.selectUserById(userId);  
          
    } 
}
