package com.eason.malladmin.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

/**
 * @ClassName MyDemoController
 * @Description Class created by Eason Lee
 * @Author Eason Lee
 * @Date 2024-05-15 8:58 PM
 */

@Controller
@RequestMapping("/demo")
public class MyDemoController {

    @GetMapping("demoController")
    @ResponseBody
    public String DemoController(
            @RequestParam int id
    ) {
        return "This is a demo." + id;
    }
}
