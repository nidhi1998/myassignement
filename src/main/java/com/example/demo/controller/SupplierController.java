package com.example.demo.controller;

import com.example.demo.co.SupplierCO;
import com.example.demo.entity.Supplier;
import com.example.demo.service.SupplierService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/")
public class SupplierController {

    @Autowired
    private SupplierService supplierService;



    @PostMapping
    public ResponseEntity<Supplier> save(@RequestBody SupplierCO supplierCO) {
Supplier supplier= supplierService.save(supplierCO);
        return new ResponseEntity(supplier, HttpStatus.OK);
    }
}
