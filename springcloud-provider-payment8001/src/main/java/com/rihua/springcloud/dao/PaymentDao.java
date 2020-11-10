package com.rihua.springcloud.dao;

import com.rihua.springcloud.entity.Payment;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
@Mapper
public interface PaymentDao {
    public int save(Payment payment);
    public Payment getPaymentById(@Param("id") long id);
}
