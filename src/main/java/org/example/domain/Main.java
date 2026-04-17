package org.example.domain;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Main {
    private String name;

    public Main(String name) {
        this.name = name;
    }

    public Main() {
    }

}