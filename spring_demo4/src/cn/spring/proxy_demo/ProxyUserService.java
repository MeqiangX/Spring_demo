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
	
	//jdk��ʽ����������� 
	public static UserService get_Proxy_JDk(UserService userService){
		
		UserService proxyUserService = (UserService) Proxy.newProxyInstance(userService.getClass().getClassLoader(), userService.getClass().getInterfaces(),
				new InvocationHandler() {
					
					@Override
					public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
						
						System.out.println("������ص�����ִ��===");
						
						return method.invoke(userService, args); 
					}
				});
		
		
		return proxyUserService;
	}
	
	//cgLib ��ʽ �����������
	public static UserService2 get_Proxy_cglib(UserService2 userService2){
		
		//����enhancer������
		Enhancer enhancer = new Enhancer();
		
		//����  Ŀ�걻������Ϊ����
		enhancer.setSuperclass(UserService2.class);
		
		//���ûص�����
		enhancer.setCallback(new org.springframework.cglib.proxy.MethodInterceptor() {
			
			@Override
			public Object intercept(Object proxy, Method method, Object[] args, MethodProxy methodProxy) throws Throwable {
				// TODO Auto-generated method stub
				
				System.out.println("������ص�����ִ��===");
				
				return methodProxy.invokeSuper(proxy, args);
			}
		});
		
		//����һ���������
		UserService2 proxy = (UserService2) enhancer.create();
		return proxy;
	}
	
	
}
