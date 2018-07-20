package com.ljheee.spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by lijianhua04 on 2018/7/20.
 */
@Controller
@RequestMapping("user")
public class UserController {


    @GetMapping("index")
    public String index(){
        return "index";
    }


    // 可以通过 ModelAndView 传递数据
}
