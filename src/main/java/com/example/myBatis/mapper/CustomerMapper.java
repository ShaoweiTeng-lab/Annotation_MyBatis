package com.example.myBatis.mapper;

import com.example.myBatis.entity.Customer;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface  CustomerMapper {
    @Select("SELECT * FROM CUSTOMER WHERE customer_id = #{customerId}")
    @Results({
            @Result(property = "customerId", column = "customer_id"),
            @Result(property = "customerName", column = "customer_name"),
            @Result(property = "phone", column = "phone"),
            @Result(property = "address", column = "address")
    })
    Customer getCustomerById(String customerId);

}
