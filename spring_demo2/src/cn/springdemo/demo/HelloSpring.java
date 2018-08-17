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
		System.out.println("hello spring ���췽��===========");
	}
	

	public void hello(){
		
		System.out.println("Hello Spring.. ");
	}
	
	
	@PostConstruct
	public void init(){
		System.out.println("hello spring �� ��ʼ��ʱִ�еķ���=========");
	}
	
	
	@PreDestroy
	public void destory(){
		System.out.println("hello spring ������ʱִ�еķ���=========");
	}


	@Override
	public String toString() {
		return "HelloSpring [user=" + user + "]";
	}

	
	//���Ʋ� addUser����
	public void addUser(){
		System.out.println("���Ʋ�========����service���addUser");
		userService.addUser();
	}
	
}
