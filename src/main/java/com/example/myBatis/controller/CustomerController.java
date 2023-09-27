package com.example.myBatis.controller;

import com.example.myBatis.entity.Customer;
import com.example.myBatis.mapper.CustomerMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CustomerController {
    public  CustomerController(){
        System.out.println("scan Customer");
    }
    @Autowired
    CustomerMapper customerMapper;
    @GetMapping("/testCustomer")
    public  String testCustomer(){
        Customer customer=customerMapper.getCustomerById("C001");
        return  customer.getCustomerName();
    }
}
