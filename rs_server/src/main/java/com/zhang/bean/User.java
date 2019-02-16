package com.zhang.bean;

import lombok.*;

import javax.xml.bind.annotation.XmlRootElement;
import java.util.ArrayList;
import java.util.List;

@XmlRootElement(name = "User")
@Getter
@Setter
@AllArgsConstructor
@ToString
@NoArgsConstructor
public class User {
    private Integer id;
    private String userName;
    private String city;
    private List<Car> cars = new ArrayList<Car>();
}
