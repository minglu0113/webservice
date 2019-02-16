package com.zhang.ws;

import org.apache.cxf.jaxws.JaxWsServerFactoryBean;

public class Test {
    public static void main(String[] args)
    {
        JaxWsServerFactoryBean factoryBean = new JaxWsServerFactoryBean();
        factoryBean.setAddress("http://localhost/ws/hello");
        factoryBean.setServiceClass(UserService.class);
        factoryBean.setServiceBean(new UserServiceImpl());
        factoryBean.create();
    }
}
