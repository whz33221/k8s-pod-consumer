package com.whz.k8spod.swaggertest.entity;

import lombok.Data;

import javax.persistence.*;

@Data
public class Order{
    private Integer id;


    private Integer price;


    private String name;

}
