package com.kafka.consumer.model;

import lombok.*;

import java.io.Serializable;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class Person implements Serializable {

    private String name;
    private Integer age;
}
