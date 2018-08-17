package proxy_demo.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

import org.springframework.cglib.proxy.Enhancer;
import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

import proxy_demo.service.AccountService;
import proxy_demo.service.UserService;

public class ProxyUserService {
	
	//����userService �Ĵ����෽��
	public static UserService getProxy_jdk(UserService userService){
		
		//ʹ��proxy�����ɴ������
		UserService ProxyuserService = (UserService)Proxy.newProxyInstance(userService.getClass().getClassLoader(), 
				userService.getClass().getInterfaces(), new InvocationHandler(){
					//ʵ�� �Ա�������� ��ǿ����
					@Override
					public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
						//��ǰ�������   ��ǰ���������ִ�з���  ���������б�
						
						if ("saveUser".equals(method.getName())){
							System.out.println("�������û����м�¼��־====");
						}
						
						//System.out.println("������ִ��===========");
						return method.invoke(userService, args); //��������ִ����ȥ
					}
			
		}); //�����ֱ��� ��������ļ����������������ʵ�ֽӿ��б���������ӿ�
		
		return ProxyuserService;  //���ش������
	} 
	
	
	//CGLib ��ʽ���ɴ������    �����ʽ���Զ�һ��û��ʵ�ֽӿڵ��� ���д��� �ò�������������ķ�ʽ
	public static AccountService getProxy_cglib(AccountService accountService){
		
		//����cglib ������
		Enhancer enhancer = new Enhancer();
		
		//���ø���
		enhancer.setSuperclass(AccountService.class);
		
		//���ûص�����   �����ǿ����
		enhancer.setCallback(new MethodInterceptor(){
			
			@Override
			public Object intercept(Object proxy, Method method, Object[] args, MethodProxy methodProxy) throws Throwable {
				// TODO Auto-generated method stub
				//methodProxy �ǶԷ����ٴν����˴���
				
				//������ǿ
				
				//����̨��ӡ
				System.out.println("cglib Proxyִ�С�������������");
				
				return methodProxy.invokeSuper(proxy, args); //�������ִ��  
			}
			
		});
		
		//���ɴ������
		AccountService accountServiceProxy = (AccountService)enhancer.create();
		
		//��������󷵻�
		return accountServiceProxy;
		
	}
}
