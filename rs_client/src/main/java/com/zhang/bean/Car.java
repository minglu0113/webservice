package com.zhang.bean;

import lombok.*;

import javax.xml.bind.annotation.XmlRootElement;

@Getter
@Setter
@XmlRootElement(name = "Car")
@AllArgsConstructor
@ToString
@Data
@NoArgsConstructor
public class Car {
    private Integer id;
    private String carName;
    private double price;
}
