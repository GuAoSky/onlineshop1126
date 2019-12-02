package com.guaosky.shop.bean;


import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

public class PmsBaseCatalog3 implements Serializable {

    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String id;
    @Column
    private String name;
    @Column
    private String catalog2Id;

}
