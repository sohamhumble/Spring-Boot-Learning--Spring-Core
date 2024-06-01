package com.example.demo.common;

import org.springframework.stereotype.Component;

@Component
public class CricketCoach implements Coach {
    @Override
    public String getDailyWorkout() {
        System.out.println(getClass().getSimpleName());
        return "Practise fast bowling for 20 Minutes";
    }
}
