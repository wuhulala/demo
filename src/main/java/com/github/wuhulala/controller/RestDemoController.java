package com.github.wuhulala.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

/**
 * @author xueaohui
 */
@Controller
public class RestDemoController {
    @RequestMapping("/demo")
    public String demo(Model model){
        System.out.println("demo--------------------");
        model.addAttribute("user","wuhulala");
        return "demo";
    }

}
