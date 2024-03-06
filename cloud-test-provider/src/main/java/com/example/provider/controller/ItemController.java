package com.example.provider.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ItemController {

    /**
     * 获取商品的信息
     *
     * @param id
     * @return
     */
    @GetMapping("/item/{id}")
    public String getInfo(@PathVariable(name = "id") String id) {
        String itemInfo = "SN:" + id;
        return itemInfo;
    }
}