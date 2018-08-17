package cn.meqiang.spring.demo.test;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import cn.meqiang.spring.demo.controller.UserController;

/**
 * 测试spring demo 
 * @author xq
 *
 */
public class SpringTest {
	
	@Test
	public void testSpring(){
		
		//加载spring容器   就是spring的核心配置文件 applicationContext.xml
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("classpath:applicationContext.xml");
		
		//通过id/name 或者类的全限类名 来拿到实例对象
		//User user = (User)applicationContext.getBean("user");
		
		//user.setId(1);
		//user.setName("hanmeimei");
		
		//System.out.println(user);
		
		//Car car = (Car)applicationContext.getBean("car");
		
		//System.out.println(car);
		
		//applicationContext.close(); //手动关闭容器
	
		UserController userController = (UserController)applicationContext.getBean("userController");
		
		userController.addAndSearch();
		
	}
	
	
}
