package com.zanko.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author: Zanko
 * @createDate: 2021/05/23 15:02:46
 * @classDesc: 
 */
@Controller //控制器
public class HomeController {

    @GetMapping("/") //处理对根路径“/”的请求
    public String home() {
        return "home"; //返回视图名
    }
}
