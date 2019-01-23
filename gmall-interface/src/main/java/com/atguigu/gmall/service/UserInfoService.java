package com.atguigu.gmall.service;

import com.atguigu.gmall.bean.UserAddress;
import com.atguigu.gmall.bean.UserInfo;

import java.util.List;

public interface UserInfoService {
    /**
     * 查询所有用户
     * @return
     */
    public List<UserInfo> findAll();

    /**
     * 根据userId来查询用户地址
     * @return
     */
    public List<UserAddress> findUserAddressByUserId(String userId);
}
