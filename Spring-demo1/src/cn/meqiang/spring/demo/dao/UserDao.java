package cn.meqiang.spring.demo.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import cn.meqiang.spring.demo.pojo.User;

/**
 * user �־û�����
 * @author xq
 *
 */
@Repository
public class UserDao {

	//�����û�
	public void addUser(){
		System.out.println("�־ò�..������һ���û�");
	}
	
	//�鿴�û�
	public void searchUser(){
		System.out.println("�־ò�..���������û�");
	}
	
	
}
