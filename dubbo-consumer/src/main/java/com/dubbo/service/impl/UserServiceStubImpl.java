package com.dubbo.service.impl;

import com.dubbo.bean.UserAddress;
import com.dubbo.service.UserService;

import java.util.List;

public class UserServiceStubImpl implements UserService {
    private final UserService userService;

    public UserServiceStubImpl(UserService userService) {
        this.userService = userService;
    }

    public List<UserAddress> getUserAddressList(String userId) {
        if(userId.equals("1")){
            System.out.println("进入本地存根方法");
        }
        return userService.getUserAddressList(userId);
    }
}
