package cn.spring.proxy_demo;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;
import org.springframework.cglib.proxy.Enhancer;
import org.springframework.cglib.proxy.MethodProxy;

import cn.spring.service.UserService;
import cn.spring.service.UserService2;

public class ProxyUserService {
	
	//jdk形式产生代理对象 
	public static UserService get_Proxy_JDk(UserService userService){
		
		UserService proxyUserService = (UserService) Proxy.newProxyInstance(userService.getClass().getClassLoader(), userService.getClass().getInterfaces(),
				new InvocationHandler() {
					
					@Override
					public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
						
						System.out.println("代理类回调函数执行===");
						
						return method.invoke(userService, args); 
					}
				});
		
		
		return proxyUserService;
	}
	
	//cgLib 形式 产生代理对象
	public static UserService2 get_Proxy_cglib(UserService2 userService2){
		
		//创建enhancer核心类
		Enhancer enhancer = new Enhancer();
		
		//设置  目标被代理类为父类
		enhancer.setSuperclass(UserService2.class);
		
		//调用回调函数
		enhancer.setCallback(new org.springframework.cglib.proxy.MethodInterceptor() {
			
			@Override
			public Object intercept(Object proxy, Method method, Object[] args, MethodProxy methodProxy) throws Throwable {
				// TODO Auto-generated method stub
				
				System.out.println("代理类回调函数执行===");
				
				return methodProxy.invokeSuper(proxy, args);
			}
		});
		
		//创建一个代理对象
		UserService2 proxy = (UserService2) enhancer.create();
		return proxy;
	}
	
	
}
