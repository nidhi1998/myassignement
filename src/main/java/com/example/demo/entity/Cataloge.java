package com.example.demo.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
@Data
@Entity
public class Cataloge {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private  String skuCode;
    private String skuName;
    private  String skuDescription;
    private String brandName;
    private String brandDescription;


}
