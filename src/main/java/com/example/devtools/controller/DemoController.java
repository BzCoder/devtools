package com.example.devtools.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author BaoZhou
 * @date 2018/7/3
 */
@Controller
public class DemoController {
    @GetMapping("/test")
    public String demo() {
        return "hello";
    }
}
