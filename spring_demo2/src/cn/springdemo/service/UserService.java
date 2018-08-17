package cn.springdemo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.springdemo.dao.UserDao;

/**
 * user Service
 * @author xq
 *
 */
@Service
public class UserService {

	@Autowired
	private UserDao userDao;
	
	public void addUser(){
		System.out.println("ҵ���========����dao���addUser");
		userDao.addUser();
	}
}
