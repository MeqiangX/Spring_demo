package cn.meqiang.spring.demo.pojo;

/**
 * car pojo
 * @author xq
 *
 */
public class Car {
	
	private String name;
	private User user;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	
	@Override
	public String toString() {
		return "Car [name=" + name + ", user=" + user + "]";
	}
	
	
	
}
