package cn.springdemo.dao;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

/**
 * User Dao
 * @author xq
 *
 */
@Repository
public class UserDao {
	
	public void addUser(){
		System.out.println("==========调用持久层，完成用户数据的持久化.......");
		System.out.println("增加成功！");
	}
}
