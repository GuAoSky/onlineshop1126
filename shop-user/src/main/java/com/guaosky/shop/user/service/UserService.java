package com.guaosky.shop.user.service;

import com.guaosky.shop.user.bean.UmsMember;
import com.guaosky.shop.user.bean.UmsMemberReceiveAddress;

import java.util.List;

public interface UserService {
    List<UmsMember> getAllUser();
    List<UmsMemberReceiveAddress> getReceiveAddressByMemberId(String id);
}
