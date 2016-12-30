package com.zdy.dubbo2.service.user;

import com.zdy.common.domain.user.User;

public interface Dubbo2UserService {
	
	/**
	 * 展示用户
	 * @param user
	 */
	String showUser(User user);

	/**
	 * 根据id拿到用户具体信息
	 * @param id
	 * @return
	 */
	User getUserInfoByTel(String tel);
}
