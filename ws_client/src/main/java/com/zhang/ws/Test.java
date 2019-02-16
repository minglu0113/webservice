package com.zhang.ws;

import org.apache.cxf.jaxws.JaxWsProxyFactoryBean;

public class Test {
    public static void main(String[] args)
    {
        JaxWsProxyFactoryBean factoryBean = new JaxWsProxyFactoryBean();
        factoryBean.setAddress("http://localhost/ws/hello");
        factoryBean.setServiceClass(UserService.class);
        UserService userServiceimpl = factoryBean.create(UserService.class);
        userServiceimpl.say("zhangsan");
    }
}
