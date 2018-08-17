package proxy_demo.service;

/**
 * userService 接口 JDK的动态代理   是面向接口的 ，并且要有实现了接口的实现类 才能被代理
 * @author xq
 *
 */
public interface UserService {
	
	public void saveUser();
	
	public void searchUser();
	
	public void updateUser();
	
	public void deluser();
}
