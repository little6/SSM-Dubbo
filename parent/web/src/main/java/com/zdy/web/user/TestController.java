package com.zdy.web.user;

import com.zdy.common.domain.user.User;
import com.zdy.dubbo1.service.user.Dubbo1UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class TestController {

	@Autowired
	Dubbo1UserService dubbo1UserService;

//	@Autowired
//	Dubbo2UserService dubbo2UserService;

	@ResponseBody
	@RequestMapping(value = "test001", produces = "application/json;charset=UTF-8")
	public String delAccessToken() {
		User user =new User();
		user.setName("张三");
		user.setTelephone("13476840002");
		return user.toString();

	}
	
	@ResponseBody
	@RequestMapping(value = "testDubbo001", produces = "application/json;charset=UTF-8")
	public String testDubbo002() {
		//在此测试dubbo1的service使用
		User user =new User();
		user.setName("张三");
		user.setTelephone("13476840003");
		String result=dubbo1UserService.showUser(user);
		return result;

	}

	@ResponseBody
	@RequestMapping(value = "testDubbo003", produces = "application/json;charset=UTF-8")
	public String testDubbo003() {
		//在此测试dubbo1的service链接dao使用
		User user =dubbo1UserService.getUserInfoByTel("123");
		return user.toString();
	}

	@ResponseBody
	@RequestMapping(value = "testDubbo004", produces = "application/json;charset=UTF-8")
	public String testDubbo004() {
		dubbo1UserService.testRedis();
		return "OK";
	}

}
