package cn.meqiang.spring.demo.controller;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;

import cn.meqiang.spring.demo.service.UserService;

/**
 * user controller 
 * ����ҵ��� ��� ��ͼ���ҵ��� ������
 * @author xq
 *
 */

@Controller
public class UserController {
	
	/*@Autowired  //�Զ�ע�� ����spring������  Ѱ��������͵�bean  �ҵ�����ע��
	private UserService userService;*/
	
	//���ж��ʵ����Ľӿ�ע�� ʱ�� ��Ϊ��spring������ �ж���ýӿڵ�ʵ����  ��autowired ע��ֻ��ƥ��һ�� ����ж��ʵ�������޷�ע��
	//������ʱ���������һ������ע���ע�� Resource ����javax  Ҳ����java ��չ����� ����spring��
	// Ҳ������spring �ṩ�� autowired + Qualifier ָ������ ��ע�� ָ����ʵ����
	
	/*@Autowired
	@Qualifier(value="userServiceImpl2")
	private UserService userService;*/
 	
	@Resource(name="userServiceImpl2")
	private UserService userService;
	
	//������һ�� �û� Ȼ����������û�
	public void addAndSearch(){
		
		userService.addUser();
		
		userService.searchUser();
	}
	
}
