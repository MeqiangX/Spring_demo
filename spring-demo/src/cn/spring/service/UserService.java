package cn.spring.service;

import org.springframework.beans.factory.annotation.Autowired;

import cn.spring.dao.UserDao;

/**
 * User ҵ����
 * @author xq
 *
 */
public class UserService {
	
	@Autowired  //�Զ�װ���������ļ���Ѱ�� �������͵�bean ����� �� ע�� ǰ��ֻ��һ��ͬ���͵�bean ��Ȼ�ᱨ��
	private UserDao userDao;
	
	public void save(){
		System.out.println("ҵ���........�����û�...");
		userDao.save();
	}
}	
