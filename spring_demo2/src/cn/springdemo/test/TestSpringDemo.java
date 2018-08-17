package cn.springdemo.test;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import cn.springdemo.demo.HelloSpring;

/**
 * 测试类
 * @author xq
 *
 */
public class TestSpringDemo {
	
	
/*	@Test
	public void testNormal(){
		HelloSpring helloSpring = new HelloSpring("lilei"); //构造方法注入
		
		//set注入
//		helloSpring.setName("hanmeimei");
		
		helloSpring.hello();
	}*/
	
	
	@Test
	public void testSpring(){
		
		// 加载spring容器  通过ApplicationContext来加载spring的配置文件 这样就加载了spring容器 实例化了里面的bean 
		AbstractApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		//通过ApplicationContext spring上下文 来得到我们想要的bean 实例  当然前提是我们有 并且在配置文件中配置了
		//HelloSpring helloSpring = (HelloSpring) applicationContext.getBean("helloSpring");
		
		HelloSpring helloSpring = (HelloSpring) applicationContext.getBean("helloSpring");
		
		System.out.println("Hello Spring 是否单例:" + applicationContext.isSingleton("helloSpring"));
		
		
		System.out.println(helloSpring);
		
		//视图层 调用 控制层  控制层调用业务层  完成业务 
		helloSpring.addUser();
		
		//拿到实例对象后 访问方法
		//helloSpring.hello();
		//关闭spring容器  
		applicationContext.close();
		//结束
		
		
		
	}
	
	
}
