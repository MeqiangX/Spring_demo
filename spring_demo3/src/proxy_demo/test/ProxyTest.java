package proxy_demo.test;

import org.junit.Test;

import proxy_demo.proxy.ProxyUserService;
import proxy_demo.service.AccountService;
import proxy_demo.service.UserService;
import proxy_demo.service.UserServiceImpl;

/**
 * ≤‚ ‘¥˙¿Ì
 * @author xq
 *
 */
public class ProxyTest {
	
	@Test
	public void test(){
		UserService userService = ProxyUserService.getProxy_jdk(new UserServiceImpl());
			
		userService.saveUser();
		
		userService.searchUser();
		
		userService.updateUser();
		
		userService.deluser();
		
		/*AccountService accountService = ProxyUserService.getProxy_cglib(new AccountService());
		
		accountService.addAccount();*/
	}
}
