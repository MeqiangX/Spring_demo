package cn.springdemo.entity;

import java.util.List;

public class User {
	
	private String name;
	private int age;
	private List<String> hobbits;
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public List<String> getHobbits() {
		return hobbits;
	}
	public void setHobbits(List<String> hobbits) {
		this.hobbits = hobbits;
	}
	
	@Override
	public String toString() {
		return "User [name=" + name + ", age=" + age + ", hobbits=" + hobbits + "]";
	}
	
	
}
