package cn.spring.test;

import org.junit.Test;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import cn.spring.hellospring.HelloSpring;
import cn.spring.proxy_demo.ProxyUserService;
import cn.spring.service.UserService;
import cn.spring.service.UserService2;
import cn.spring.service.UserServiceImpl;

/**
 * Test class
 * @author xq
 *
 */
public class TestSpring {
	
	//���������������  ����ҵ������ ����������Ӧ�Ķ��� ������Ӧ�ķ��� ����ɹ��� 
	@Test
	public void test(){
		
		HelloSpring helloSpring = new HelloSpring();
		
		helloSpring.hello();
	}
	
	//��ʵ����  �������ְ��Ӧ����  �����Ӧ��ҵ�񣬶����ܶ��������
	//������
	
	
	@Test
	public void testSpring(){
		
		//��ͨ��ApplicationContext spring�����������������ǵ�spring���������ļ� �������ǵ�spring����(bean����)
		
		AbstractApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
	
		//ͨ��bean���� ���ĵ� ʵ������    ����Ȩ�ɳ��򽻸���spring����   ������ԭ����bean������ ����� bean������ 
		HelloSpring helloSpring = (HelloSpring)applicationContext.getBean("helloSpring");
	
		//����ҵ�񷽷�
		helloSpring.hello();
	}
	
	@Test
	public void test2(){
		UserService userService = ProxyUserService.get_Proxy_JDk(new UserServiceImpl());
		
		userService.addUser();
		
		UserService2 us2 = ProxyUserService.get_Proxy_cglib(new UserService2());
		
		us2.addUser();
	}
}
