package com.kangrenhui.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author kangrenhui
 */
@Controller
public class JenkinsTestController {
    @GetMapping("/test")
    @ResponseBody
    public String test(){
        return "test one";
    }
}
