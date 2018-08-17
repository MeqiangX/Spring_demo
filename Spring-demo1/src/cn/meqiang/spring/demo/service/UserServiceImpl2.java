package cn.meqiang.spring.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import cn.meqiang.spring.demo.dao.UserDao;

/**
 * ͬ��ʵ����userService �ӿڵ� ��ͬʵ����
 * @author xq
 *
 */
@Component
public class UserServiceImpl2 implements UserService {
	
	@Autowired
	private UserDao userDao;
	
	@Override
	public void addUser() {
		System.out.println("2  �����û�ҵ���..���ó־ò�");
		userDao.addUser();
	}

	@Override
	public void searchUser() {
		System.out.println("2   �����û�ҵ���..���ó־ò�");
		userDao.searchUser();
	}

}
