package cn.meqiang.spring.demo.controller;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;

import cn.meqiang.spring.demo.service.UserService;

/**
 * user controller 
 * 调用业务层 完成 视图层和业务层 的连接
 * @author xq
 *
 */

@Controller
public class UserController {
	
	/*@Autowired  //自动注入 会在spring容器中  寻找这个类型的bean  找到立刻注入
	private UserService userService;*/
	
	//在有多个实现类的接口注入 时候 因为在spring容器中 有多个该接口的实现类  而autowired 注解只能匹配一个 如果有多个实现类则无法注入
	//所以这时候就有另外一个属性注入的注解 Resource 这是javax  也就是java 扩展包里的 不是spring的
	// 也可以用spring 提供的 autowired + Qualifier 指定名称 来注入 指定的实现类
	
	/*@Autowired
	@Qualifier(value="userServiceImpl2")
	private UserService userService;*/
 	
	@Resource(name="userServiceImpl2")
	private UserService userService;
	
	//先增加一个 用户 然后查找所有用户
	public void addAndSearch(){
		
		userService.addUser();
		
		userService.searchUser();
	}
	
}
