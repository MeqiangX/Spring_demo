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
	
	//我们是类的生产者  当有业务需求 我们生产相应的对象 调用相应的方法 来完成功能 
	@Test
	public void test(){
		
		HelloSpring helloSpring = new HelloSpring();
		
		helloSpring.hello();
	}
	
	//而实际上  程序本身的职责应该是  处理对应的业务，而不管对象的生产
	//吃橘子
	
	
	@Test
	public void testSpring(){
		
		//先通过ApplicationContext spring上下文来加载在我们的spring核心配置文件 就是我们的spring容器(bean工厂)
		
		AbstractApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
	
		//通过bean工厂 来的到 实例对象    控制权由程序交给了spring容器   程序由原来的bean生产者 变成了 bean消费者 
		HelloSpring helloSpring = (HelloSpring)applicationContext.getBean("helloSpring");
	
		//调用业务方法
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
