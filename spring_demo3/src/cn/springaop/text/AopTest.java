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
		
		//����spring���� �� ����spring ���������ļ�
		AbstractApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		UserService userService = (UserService)applicationContext.getBean("userService");
		
		userService.addUser();
	}
}
