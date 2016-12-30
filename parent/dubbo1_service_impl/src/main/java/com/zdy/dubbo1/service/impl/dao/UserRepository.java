package com.zdy.dubbo1.service.impl.dao;

import com.zdy.common.domain.user.User;

public interface UserRepository {
    /**
     * 根据tel拿到User
     * @param tel
     * @return
     */
    User getUserByTel(String tel);

}