package com.eason.malladmin.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

/**
 * @ClassName MyDemoController
 * @Description Class created by Eason Lee
 * @Author Eason Lee
 * @Date 2024-05-15 8:58 PM
 */

@Controller
@Api(tags = "DemoController")
@Tag(name = "DemoController", description = "demo")
@RequestMapping("/demo")
public class MyDemoController {

    @GetMapping("demoController")
    @ApiOperation("demoApi")
    @ResponseBody
    public String DemoController(
            @RequestParam(value = "id", defaultValue = "-1")
            @ApiParam("id") int id
    ) {
        return "This is a demo." + id;
    }
}
