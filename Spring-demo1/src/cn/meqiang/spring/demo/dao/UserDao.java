package cn.meqiang.spring.demo.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import cn.meqiang.spring.demo.pojo.User;

/**
 * user 持久化操作
 * @author xq
 *
 */
@Repository
public class UserDao {

	//增加用户
	public void addUser(){
		System.out.println("持久层..增加了一个用户");
	}
	
	//查看用户
	public void searchUser(){
		System.out.println("持久层..查找所有用户");
	}
	
	
}
