package com.rihua.springcloud.controller;

import com.rihua.springcloud.entity.CommonResult;
import com.rihua.springcloud.entity.Payment;
import com.rihua.springcloud.service.PaymentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpRequest;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

@RestController
@Slf4j
public class PaymentController {
    @Resource
    private PaymentService paymentService;
    @PostMapping(value = "/payment/addPayment")
    public CommonResult addPayment(@RequestBody Payment payment){
        int result=paymentService.save(payment);
        log.info("****插入结果:" + result);
        if (result>0){
            return  new CommonResult(200,"插入数据库成功",result);
        }else {
            return new CommonResult(444,"插入数据库失败",result);
        }
    }
    @GetMapping(value = "/payment/getPaymentByID/{id}")
    public CommonResult getPaymentByID(@PathVariable("id") Long id){
        Payment payment = paymentService.getPaymentById(id);
        log.info("****查询结果:" + payment);
        if(payment != null){
            return  new CommonResult(200,"查询成功",payment);
        } else {
            return new CommonResult(444,"没有对应记录，查询ID: " + id,null);
        }
    }
}
