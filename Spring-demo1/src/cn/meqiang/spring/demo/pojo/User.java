package cn.meqiang.spring.demo.pojo;

import java.util.List;
import java.util.Map;

public class User {
	
	private int id;
	private String name;
	private List<String> hobbits;
	private Map<String,String> identity;
	
	User(){
		System.out.println("user ���췽��ִ����..");
	}
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<String> getHobbits() {
		return hobbits;
	}
	public void setHobbits(List<String> hobbits) {
		this.hobbits = hobbits;
	}
	public Map<String, String> getIdentity() {
		return identity;
	}
	public void setIdentity(Map<String, String> identity) {
		this.identity = identity;
	}
	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", hobbits=" + hobbits + ", identity=" + identity + "]";
	}
	
	
	//bean ����ʱ�����е�init����
	public void init(){
		System.out.println("user bean creaed start....");
	}
	
	//bean user����ʱ���е�destory����
	public void destory(){
		System.out.println("user bean destory....");
	}
	
	
	

	
		
	
	
	
}
