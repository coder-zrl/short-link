package com.bird.link.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bird.link.service.ShortInfoService;

import jakarta.annotation.Resource;


/**
 * @author zhangruilong <zhangruilong03@kuaishou.com>
 * Created on 2024-03-18
 */
@RestController
public class LinkInfoController {
    @Resource
    private ShortInfoService shortInfoService;


    @PostMapping("/gen")
    public String genShortLink(){
        return null;
    }

    @GetMapping("/{key}")
    public void lookup(@PathVariable String key){
        shortInfoService.lookup(key);
    }
}
