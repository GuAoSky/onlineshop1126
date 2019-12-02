package com.guaosky.shop.manage.service.impl;


import com.alibaba.dubbo.config.annotation.Service;
import com.guaosky.shop.bean.PmsBaseCatalog1;
import com.guaosky.shop.bean.PmsBaseCatalog2;
import com.guaosky.shop.bean.PmsBaseCatalog3;
import com.guaosky.shop.manage.mapper.PmsBaseCatalog1Mapper;
import com.guaosky.shop.manage.mapper.PmsBaseCatalog2Mapper;
import com.guaosky.shop.manage.mapper.PmsBaseCatalog3Mapper;
import com.guaosky.shop.service.CatalogService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;


@Service
public class CatalogServiceImpl implements CatalogService {

    @Autowired
    PmsBaseCatalog1Mapper pmsBaseCatalog1Mapper;

    @Autowired
    PmsBaseCatalog2Mapper pmsBaseCatalog2Mapper;

    @Autowired
    PmsBaseCatalog3Mapper pmsBaseCatalog3Mapper;


    @Override
    public List<PmsBaseCatalog1> getCatalog1() {
        List<PmsBaseCatalog1> catalog1s = pmsBaseCatalog1Mapper.selectAll();
        return catalog1s;
    }
}
