package com.example.consumer.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name="provider",url = "127.0.0.1:8080")
public interface ItemFeign {

    /**
     * 根据用户ID 获取用户名
     * @param id
     * @return
     */
    @GetMapping("/item/{id}")
    String getItemInfo(@PathVariable(name="id") String id);
}