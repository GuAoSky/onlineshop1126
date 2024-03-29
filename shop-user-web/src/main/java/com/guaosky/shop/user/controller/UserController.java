package com.guaosky.shop.user.controller;


import com.alibaba.dubbo.config.annotation.Reference;
import com.guaosky.shop.bean.UmsMember;
import com.guaosky.shop.bean.UmsMemberReceiveAddress;
import com.guaosky.shop.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class UserController {

    @Reference
    UserService userService;


    @RequestMapping("index")
    @ResponseBody
    public String index(){
        return "hello user";
    }

    @RequestMapping("getAllUser")
    @ResponseBody
    public List<UmsMember> getAllUser(){
        List<UmsMember> umsMembers = userService.getAllUser();
        return umsMembers;
    }

    @RequestMapping("getReceiveAddressByMemberId")
    @ResponseBody
    public List<UmsMemberReceiveAddress> getReceiveAddressByMemberId(String memberId){
        List<UmsMemberReceiveAddress> memberReceiveAddresses = userService.getReceiveAddressByMemberId(memberId);
        return memberReceiveAddresses;
    }

}
