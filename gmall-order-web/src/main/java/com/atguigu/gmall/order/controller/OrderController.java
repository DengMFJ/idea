package com.atguigu.gmall.order.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.atguigu.gmall.bean.UserAddress;
import com.atguigu.gmall.bean.UserInfo;
import com.atguigu.gmall.service.UserInfoService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("/")
public class OrderController {
    @Reference
    private UserInfoService userInfoService;
    @RequestMapping("order")
    @ResponseBody
    public List<UserAddress> findUserAddressByuserId(String userId){
        return userInfoService.findUserAddressByUserId(userId);
    }
}
