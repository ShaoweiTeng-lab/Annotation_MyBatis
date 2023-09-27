package com.example.myBatis.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Customer {
    private  String  customerId;
    private  String customerName;
    private  String phone;
    private  String address;

}
