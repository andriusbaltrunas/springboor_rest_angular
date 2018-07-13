package com.spring.boot.example.rest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * Created by andriusbaltrunas on 7/12/2018.
 */
@Controller
public class IndexController {

    @GetMapping(value = "/")
    public String index(){
        return "index";
    }

}
