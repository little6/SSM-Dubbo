package com.zdy.dubbo1.service.impl.user;


import com.zdy.common.domain.user.User;
import com.zdy.dubbo1.service.impl.dao.UserRepository;
import com.zdy.dubbo1.service.user.Dubbo1UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import redis.clients.jedis.JedisCluster;


@Service("dubbo1_userService")
public class Dubbo1UserServiceImpl implements Dubbo1UserService{

	@Autowired
	UserRepository userRepository;

	@Autowired
	JedisCluster jedisCluster;

	@Override
	public String showUser(User user) {
		
		return "dubbo1 测试成功";
	}

	@Override
	public User getUserInfoByTel(String tel) {
		User user=userRepository.getUserByTel(tel);
		user.setName("[dubbo1]");
		return user;
	}

	@Override
	public void testRedis() {
		String key="zdyzdy";
		String answer="answer";
		for (int i=0;i<1000;i++){
			jedisCluster.set(key+i,answer+i);
		}
	}


}
