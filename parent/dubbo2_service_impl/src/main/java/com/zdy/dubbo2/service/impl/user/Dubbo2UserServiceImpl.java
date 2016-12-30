package com.zdy.dubbo2.service.impl.user;


import com.zdy.common.domain.user.User;
import com.zdy.dubbo2.service.impl.dao.UserRepository;
import com.zdy.dubbo2.service.user.Dubbo2UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service("dubbo2_userService")
public class Dubbo2UserServiceImpl implements Dubbo2UserService {

	@Autowired
	UserRepository userRepository;

	@Override
	public String showUser(User user) {
		
		return "dubbo2 测试成功";
	}

	@Override
	public User getUserInfoByTel(String tel) {
		User user=userRepository.getUserByTel(tel);
		user.setName("[dubbo2]");
		return user;
	}

}
