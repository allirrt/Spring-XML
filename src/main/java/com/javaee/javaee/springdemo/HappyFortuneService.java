package com.javaee.javaee.springdemo;

public class HappyFortuneService implements FortuneService {
    @Override
    public String getFortune() {
        return "Today is you lucky day!";
    }
}