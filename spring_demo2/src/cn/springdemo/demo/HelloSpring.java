package cn.springdemo.demo;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import cn.springdemo.entity.User;
import cn.springdemo.service.UserService;

/**
 * spring_demo1
 * @author xq
 *
 */
@Controller
public class HelloSpring {
	
	@Autowired
	private User user;
	
	@Autowired
	private UserService userService;
	
	
	public HelloSpring(){
		System.out.println("hello spring 构造方法===========");
	}
	

	public void hello(){
		
		System.out.println("Hello Spring.. ");
	}
	
	
	@PostConstruct
	public void init(){
		System.out.println("hello spring 的 初始化时执行的方法=========");
	}
	
	
	@PreDestroy
	public void destory(){
		System.out.println("hello spring 的销毁时执行的方法=========");
	}


	@Override
	public String toString() {
		return "HelloSpring [user=" + user + "]";
	}

	
	//控制层 addUser需求
	public void addUser(){
		System.out.println("控制层========调用service层的addUser");
		userService.addUser();
	}
	
}
