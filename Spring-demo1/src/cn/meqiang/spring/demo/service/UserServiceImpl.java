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
		System.out.println("�����û�ҵ���..���ó־ò�");
		userDao.addUser();
	}

	@Override
	public void searchUser() {
		// TODO Auto-generated method stub
		System.out.println("�����û�ҵ���..���ó־ò�");
		userDao.searchUser();
	}

}
