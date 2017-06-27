package com.jayden.intelligence.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by za-xujianjun on 2017/6/27.
 */
@RestController
public class IndexController {
    @RequestMapping("/index")
    public String index(){
        System.out.println("-------------------");
        return "Index Page!";
    }
}
