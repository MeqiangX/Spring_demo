package cn.spring.service;

import org.springframework.beans.factory.annotation.Autowired;

import cn.spring.dao.UserDao;

/**
 * User 业务类
 * @author xq
 *
 */
public class UserService {
	
	@Autowired  //自动装配在配置文件中寻找 这种类型的bean 如果有 则 注入 前提只有一个同类型的bean 不然会报错
	private UserDao userDao;
	
	public void save(){
		System.out.println("业务层........保存用户...");
		userDao.save();
	}
}	
