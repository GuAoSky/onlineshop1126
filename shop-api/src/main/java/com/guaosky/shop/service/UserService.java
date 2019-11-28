package com.guaosky.shop.service;

import com.guaosky.shop.bean.UmsMember;
import com.guaosky.shop.bean.UmsMemberReceiveAddress;

import java.util.List;

public interface UserService {
    List<UmsMember> getAllUser();
    List<UmsMemberReceiveAddress> getReceiveAddressByMemberId(String id);
}
