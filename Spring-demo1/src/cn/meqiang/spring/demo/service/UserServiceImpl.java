package cn.meqiang.spring.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.meqiang.spring.demo.dao.UserDao;

/**
 * user service
 * @author xq
 *
 */

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserDao userDao;
	
	@Override
	public void addUser() {
		// TODO Auto-generated method stub
		System.out.println("增加用户业务层..调用持久层");
		userDao.addUser();
	}

	@Override
	public void searchUser() {
		// TODO Auto-generated method stub
		System.out.println("查找用户业务层..调用持久层");
		userDao.searchUser();
	}

}
