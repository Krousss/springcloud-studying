package com.rihua.springcloud.service;

import com.rihua.springcloud.entity.Payment;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Service;

public interface PaymentService {
    public int save(Payment payment);
    public Payment getPaymentById(@Param("id") long id);
}
