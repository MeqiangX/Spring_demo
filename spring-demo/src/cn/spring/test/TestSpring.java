package cn.spring.test;

import org.junit.Test;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.util.DigestUtils;

import cn.spring.dao.UserDao;
import cn.spring.service.UserService;

public class TestSpring {
	
	//��ͳ��ʽ  �Լ���������� ���÷���
	/*@Test
	public void testSpring(){
		
		//����HelloSpring ����
		HelloSpring hellSpring = new HelloSpring();
		
	    //���÷���
		hellSpring.hello();
	}*/
	
	
	//spring ��������� 
	@Test
	public void test2() throws Exception{
		//���������ļ�  ����bean���� ����spring����
		AbstractApplicationContext applicationContext = new ClassPathXmlApplicationContext("classpath:applicationContext.xml");
		
		//��spring �������еõ� spring�����е�bean ����ʵ��
		//HelloSpring helloSpring = (HelloSpring)applicationContext.getBean("helloSpring");
		
		
		//���÷���
		//helloSpring.hello();
		
		
		
		String string = DigestUtils.md5DigestAsHex("123456".getBytes()).toString();
		System.out.println(string);
		//�ر�spring����
		applicationContext.close();
		
		
		
		
	/*	Class<?> classes = Class.forName("cn.spring.hellospring.HelloSpring");
		HelloSpring hellos = (HelloSpring) classes.newInstance();
		hellos.hello();

		Class classes2 = cn.spring.hellospring.HelloSpring.class;  // ����.class���.class����
		HelloSpring hs = (HelloSpring) classes2.newInstance();
		hs.hello(); */
		
		
		//ͨ�� forName ���� .class ���class ���� �����������(ģ��)��ʵ���� �����Ķ���
		
	}	
	
	
	@Test
	public void test3(){
		
		//UserService userService = new UserService(new UserDao()); //Constractע��
		
		//userService.setUserDao(new UserDao()); //setter ע��
		
		//���������ļ�  ����bean���� ����spring����
	    AbstractApplicationContext applicationContext = new ClassPathXmlApplicationContext("classpath:applicationContext.xml");
			
	    UserService userService = (UserService)applicationContext.getBean("userService");
		
	    userService.save();
	}
}
