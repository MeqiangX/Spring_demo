package cn.springdemo.test;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import cn.springdemo.demo.HelloSpring;

/**
 * ������
 * @author xq
 *
 */
public class TestSpringDemo {
	
	
/*	@Test
	public void testNormal(){
		HelloSpring helloSpring = new HelloSpring("lilei"); //���췽��ע��
		
		//setע��
//		helloSpring.setName("hanmeimei");
		
		helloSpring.hello();
	}*/
	
	
	@Test
	public void testSpring(){
		
		// ����spring����  ͨ��ApplicationContext������spring�������ļ� �����ͼ�����spring���� ʵ�����������bean 
		AbstractApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		//ͨ��ApplicationContext spring������ ���õ�������Ҫ��bean ʵ��  ��Ȼǰ���������� �����������ļ���������
		//HelloSpring helloSpring = (HelloSpring) applicationContext.getBean("helloSpring");
		
		HelloSpring helloSpring = (HelloSpring) applicationContext.getBean("helloSpring");
		
		System.out.println("Hello Spring �Ƿ���:" + applicationContext.isSingleton("helloSpring"));
		
		
		System.out.println(helloSpring);
		
		//��ͼ�� ���� ���Ʋ�  ���Ʋ����ҵ���  ���ҵ�� 
		helloSpring.addUser();
		
		//�õ�ʵ������� ���ʷ���
		//helloSpring.hello();
		//�ر�spring����  
		applicationContext.close();
		//����
		
		
		
	}
	
	
}
