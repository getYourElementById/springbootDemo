package com.example.demo.controllers;

import com.example.demo.dto.baseDtoPackage.BaseDto;
import com.example.demo.service.Interfaces.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMethod;

import com.example.demo.service.LoginServiceImpl;

import javax.annotation.Resource;

@RestController
@RequestMapping("/user_api")
public class LoginController {

    @Autowired
    private LoginService loginService;

    @RequestMapping(value = "/apitest", method = RequestMethod.GET)
    public String apitest() {
        BaseDto result = loginService.SUCCESS();
//        System.out.println(result);
        return "hello";
    }

    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public String login() {

        return "hello world!";
    }
}