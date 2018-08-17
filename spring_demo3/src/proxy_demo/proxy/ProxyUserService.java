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
	
	//生成userService 的代理类方法
	public static UserService getProxy_jdk(UserService userService){
		
		//使用proxy类生成代理对象
		UserService ProxyuserService = (UserService)Proxy.newProxyInstance(userService.getClass().getClassLoader(), 
				userService.getClass().getInterfaces(), new InvocationHandler(){
					//实现 对被代理类的 加强方法
					@Override
					public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
						//当前代理对象   当前被代理类的执行方法  方法参数列表
						
						if ("saveUser".equals(method.getName())){
							System.out.println("对增加用户进行记录日志====");
						}
						
						//System.out.println("代理方法执行===========");
						return method.invoke(userService, args); //方法继续执行下去
					}
			
		}); //参数分别是 被代理类的加载器，被代理类的实现接口列表，方法处理接口
		
		return ProxyuserService;  //返回代理对象
	} 
	
	
	//CGLib 方式生成代理对象    这个方式可以对一个没有实现接口的类 进行代理， 用产生这个类的子类的方式
	public static AccountService getProxy_cglib(AccountService accountService){
		
		//创建cglib 核心类
		Enhancer enhancer = new Enhancer();
		
		//设置父类
		enhancer.setSuperclass(AccountService.class);
		
		//设置回调函数   代理加强方法
		enhancer.setCallback(new MethodInterceptor(){
			
			@Override
			public Object intercept(Object proxy, Method method, Object[] args, MethodProxy methodProxy) throws Throwable {
				// TODO Auto-generated method stub
				//methodProxy 是对方法再次进行了代理
				
				//方法加强
				
				//控制台打印
				System.out.println("cglib Proxy执行。。。。。。。");
				
				return methodProxy.invokeSuper(proxy, args); //父类继续执行  
			}
			
		});
		
		//生成代理对象
		AccountService accountServiceProxy = (AccountService)enhancer.create();
		
		//将代理对象返回
		return accountServiceProxy;
		
	}
}
