package cn.springaop.text;


import org.junit.Test;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import cn.springaop.service.UserService;

/**
 * spring aop demo
 * @author xq
 *
 */

public class AopTest {
	
	@Test
	public void test(){
		
		//启动spring容器 即 加载spring 核心配置文件
		AbstractApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		UserService userService = (UserService)applicationContext.getBean("userService");
		
		userService.addUser();
	}
}
