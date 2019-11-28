package com.guaosky.shop.user.service.impl;

import com.guaosky.shop.bean.UmsMember;
import com.guaosky.shop.bean.UmsMemberReceiveAddress;
import com.guaosky.shop.user.mapper.UmsMemberReceiveAddressMapper;
import com.guaosky.shop.user.mapper.UserMapper;
import com.guaosky.shop.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserMapper userMapper;
    @Autowired
    UmsMemberReceiveAddressMapper umsMemberReceiveAddressMapper;

    @Override
    public List<UmsMember> getAllUser() {
        return userMapper.selectAll();/*userMapper.selectAllUser();*/
    }

    @Override
    public List<UmsMemberReceiveAddress> getReceiveAddressByMemberId(String memberId) {
        UmsMemberReceiveAddress umra = new UmsMemberReceiveAddress();
        umra.setMemberId(memberId);
        List<UmsMemberReceiveAddress> umsMemberReceiveAddresses  = umsMemberReceiveAddressMapper.select(umra);
        return umsMemberReceiveAddresses;
    }
}
