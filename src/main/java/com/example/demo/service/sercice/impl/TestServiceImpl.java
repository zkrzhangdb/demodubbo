package com.example.demo.service.sercice.impl;

import com.example.demo.service.TestService;

public class TestServiceImpl implements TestService {

    @Override
    public String say(String name) {
        return name;
    }

}
