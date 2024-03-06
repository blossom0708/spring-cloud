package com.example.consumer.controller;

import com.example.consumer.feign.ItemFeign;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RefreshScope
public class OrderController {
    @Autowired
    private ItemFeign itemFeign;

    @GetMapping("/doOrder")
    public String doOrder() {
        //1.模拟远程调用获取到到商品信息
        String info = itemFeign.getItemInfo("1");
        //2.模拟下单
        System.out.println("张三:下单成功,商品信息为："+info);
        //3.模拟返回成功信息
        return info;
    }
}