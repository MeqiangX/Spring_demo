package cn.meqiang.spring.demo.test;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import cn.meqiang.spring.demo.controller.UserController;

/**
 * ����spring demo 
 * @author xq
 *
 */
public class SpringTest {
	
	@Test
	public void testSpring(){
		
		//����spring����   ����spring�ĺ��������ļ� applicationContext.xml
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("classpath:applicationContext.xml");
		
		//ͨ��id/name �������ȫ������ ���õ�ʵ������
		//User user = (User)applicationContext.getBean("user");
		
		//user.setId(1);
		//user.setName("hanmeimei");
		
		//System.out.println(user);
		
		//Car car = (Car)applicationContext.getBean("car");
		
		//System.out.println(car);
		
		//applicationContext.close(); //�ֶ��ر�����
	
		UserController userController = (UserController)applicationContext.getBean("userController");
		
		userController.addAndSearch();
		
	}
	
	
}
