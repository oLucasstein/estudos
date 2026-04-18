package org.train;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;

@EnableAutoConfiguration
@ComponentScan
public class TrainStart {
    public static void main(String[] args) {
        SpringApplication.run(TrainStart.class, args);
    }
}