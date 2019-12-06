package com.js.controler;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class QucikController {

    @RequestMapping("/quick")
    @ResponseBody
    public String quick(){
        return "hello springboot2";
    }

}
