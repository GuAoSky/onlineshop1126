package com.guaosky.shop.service;

import com.guaosky.shop.bean.PmsProductInfo;

import java.util.List;

public interface SpuService {
    List<PmsProductInfo> spuList(String catalog3Id);
}
