package com.zhang.ws;

import javax.jws.WebService;

@WebService
public class UserServiceImpl implements UserService {
    public void say(String name) {
        System.out.println(name+":\"你好\"");
    }
}
