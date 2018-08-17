package cn.meqiang.spring.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import cn.meqiang.spring.demo.dao.UserDao;

/**
 * 同样实现了userService 接口的 不同实现类
 * @author xq
 *
 */
@Component
public class UserServiceImpl2 implements UserService {
	
	@Autowired
	private UserDao userDao;
	
	@Override
	public void addUser() {
		System.out.println("2  增加用户业务层..调用持久层");
		userDao.addUser();
	}

	@Override
	public void searchUser() {
		System.out.println("2   查找用户业务层..调用持久层");
		userDao.searchUser();
	}

}
