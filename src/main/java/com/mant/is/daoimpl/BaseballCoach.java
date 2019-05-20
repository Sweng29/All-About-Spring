package com.mant.is.daoimpl;

import com.mant.is.dao.Coach;
import com.mant.is.dao.FortuneService;

public class BaseballCoach implements Coach {

    private FortuneService fortuneService;

    // Constructor based dependency injection
    public BaseballCoach(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }

    @Override
    public String getCoachMessage() {
        return "Hello from baseball Coach!";
    }

    @Override
    public String getDailyfortune() {
        return fortuneService.getFortune();
    }

    public String getInitialValues() {
        System.out.println("Bean lifecyle init-method called.");
        return "Bean lifecyle init-method called.";
    }

    public String destroyValues() {
        System.out.println("Bean life cycle Destroy method called.");
        return "Bean life cycle Destroy method called.";
    }
}
