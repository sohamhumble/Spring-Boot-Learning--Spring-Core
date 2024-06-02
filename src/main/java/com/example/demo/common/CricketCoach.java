package com.example.demo.common;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;

@Component
public class CricketCoach implements Coach {
    @Override
    public String getDailyWorkout() {
        System.out.println(getClass().getSimpleName());
        return "Practise fast bowling for 20 Minutes";
    }

    @PostConstruct
    public void postCreation() {
        System.out.println(getClass().getSimpleName() + " created on " + LocalDateTime.now());
    }

    @PreDestroy
    public void predestroy() {
        System.out.println(getClass().getSimpleName() + " destoryed on " + LocalDateTime.now());
    }
}
