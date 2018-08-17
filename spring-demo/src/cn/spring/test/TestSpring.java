package cn.spring.test;

import org.junit.Test;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.util.DigestUtils;

import cn.spring.dao.UserDao;
import cn.spring.service.UserService;

public class TestSpring {
	
	//传统方式  自己来管理对象 调用方法
	/*@Test
	public void testSpring(){
		
		//创建HelloSpring 对象
		HelloSpring hellSpring = new HelloSpring();
		
	    //调用方法
		hellSpring.hello();
	}*/
	
	
	//spring 来管理对象 
	@Test
	public void test2() throws Exception{
		//加载配置文件  启动bean工厂 加载spring容器
		AbstractApplicationContext applicationContext = new ClassPathXmlApplicationContext("classpath:applicationContext.xml");
		
		//从spring 上下文中得到 spring容器中的bean 对象实例
		//HelloSpring helloSpring = (HelloSpring)applicationContext.getBean("helloSpring");
		
		
		//调用方法
		//helloSpring.hello();
		
		
		
		String string = DigestUtils.md5DigestAsHex("123456".getBytes()).toString();
		System.out.println(string);
		//关闭spring容器
		applicationContext.close();
		
		
		
		
	/*	Class<?> classes = Class.forName("cn.spring.hellospring.HelloSpring");
		HelloSpring hellos = (HelloSpring) classes.newInstance();
		hellos.hello();

		Class classes2 = cn.spring.hellospring.HelloSpring.class;  // 类名.class获得.class对象
		HelloSpring hs = (HelloSpring) classes2.newInstance();
		hs.hello(); */
		
		
		//通过 forName 或者 .class 获得class 对象 根据这个对象(模板)来实例化 这个类的对象
		
	}	
	
	
	@Test
	public void test3(){
		
		//UserService userService = new UserService(new UserDao()); //Constract注入
		
		//userService.setUserDao(new UserDao()); //setter 注入
		
		//加载配置文件  启动bean工厂 加载spring容器
	    AbstractApplicationContext applicationContext = new ClassPathXmlApplicationContext("classpath:applicationContext.xml");
			
	    UserService userService = (UserService)applicationContext.getBean("userService");
		
	    userService.save();
	}
}
