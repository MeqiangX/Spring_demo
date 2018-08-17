package proxy_demo.service;

/**
 * 
 * @author xq
 *
 */
public class UserServiceImpl implements UserService{

	@Override
	public void saveUser() {
		System.out.println("保存用户==========");
	}

	@Override
	public void searchUser() {
		System.out.println("查找用户==========");
		
	}

	@Override
	public void updateUser() {
		System.out.println("更新用户==========");
		
	}

	@Override
	public void deluser() {
		System.out.println("删除用户==========");
		
	}
	
}
