package com.mant.is.daoimpl;

import com.mant.is.dao.Coach;
import com.mant.is.dao.FortuneService;

public class TrackCoach implements Coach {

    private FortuneService fortuneService;

    public FortuneService getFortuneService() {
        return fortuneService;
    }

    public void setFortuneService(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }

    @Override
    public String getCoachMessage() {
        return "Hello from Track Coach!";
    }

    @Override
    public String getDailyfortune() {
        return "Today is your happiest day!";
    }
}
