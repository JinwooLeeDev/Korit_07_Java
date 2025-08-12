package org.example;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Builder
public class Person {
    private String name;
    private double height;
    private double weight;

    public Person() {

    }

}
