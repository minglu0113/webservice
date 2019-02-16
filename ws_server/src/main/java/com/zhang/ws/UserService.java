package com.zhang.ws;

import javax.jws.WebService;

@WebService
public interface UserService {
    void say(String name);
}
