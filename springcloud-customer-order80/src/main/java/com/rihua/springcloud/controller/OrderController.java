package com.rihua.springcloud.controller;

import com.rihua.springcloud.entity.CommonResult;
import com.rihua.springcloud.entity.Payment;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

@RestController
@Slf4j
public class OrderController {
    public static final String PATMENT_URL="http://localhost:8001";
    @Resource
    private RestTemplate restTemplate;
    @GetMapping("/consumer/payment/addPayment")
    public CommonResult<Payment> addPayment(Payment payment){
        return restTemplate.postForObject(PATMENT_URL+"/payment/addPayment",payment,CommonResult.class);
    }
    @GetMapping("/consumer/payment/getPaymentByID/{id}")
    public CommonResult<Payment> getPayment(@PathVariable("id") Long id){
        return restTemplate.getForObject(PATMENT_URL+"/payment/getPaymentByID/"+id,CommonResult.class);
    }
}
