package com.example.demo.common;

import org.springframework.stereotype.Component;

@Component
public class BaseballCoach implements Coach {
    @Override
    public String getDailyWorkout() {
        System.out.println(getClass().getSimpleName());
        return "Spend 30 minutes in batting practise";
    }
}
