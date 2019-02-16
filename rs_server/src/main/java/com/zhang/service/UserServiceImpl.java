package com.zhang.service;

import com.zhang.bean.Car;
import com.zhang.bean.User;

import java.util.ArrayList;
import java.util.List;

public class UserServiceImpl implements UserService {
    public void saveUser(User user) {
        System.out.println(user.toString());
    }

    public User getUser(Integer id) {
        List<Car> cars = new ArrayList<Car>();
        cars.add(new Car(0001,"baoma",120000));
        cars.add(new Car(0002,"benchi",300000.0));
        User user = new User(id,"zhangkun","zhengzhou",cars);
        System.out.println(user);
        return user;
    }
}
