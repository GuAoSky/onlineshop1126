package com.guaosky.shop.service;

import com.guaosky.shop.bean.PmsBaseAttrInfo;
import com.guaosky.shop.bean.PmsBaseAttrValue;
import org.springframework.stereotype.Repository;

import java.util.List;


public interface AttrService {
    List<PmsBaseAttrInfo> attrInfoList(String catalog3Id);

    String saveAttrInfo(PmsBaseAttrInfo pmsBaseAttrInfo);

    List<PmsBaseAttrValue> getAttrValueList(String attrId);
}
