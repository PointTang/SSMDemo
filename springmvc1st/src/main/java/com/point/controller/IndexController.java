package com.point.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by Point on 2017/6/14.
 */
@Controller
public class IndexController {

    @RequestMapping(value = "/index")
    @ResponseBody
    public String testSpring(){
        return "Hello, SpringMVC";

    }

}
