package com.mant.is.daoimpl;

import com.mant.is.dao.Coach;
import org.springframework.stereotype.Component;

@Component
public class FootballCoach implements Coach {

    private SadFortuneService sadFortuneService;

    public FootballCoach(SadFortuneService sadFortuneService) {
        this.sadFortuneService = sadFortuneService;
    }

    @Override
    public String getCoachMessage() {
        return "Hi Footballer fans!";
    }

    @Override
    public String getDailyfortune() {
        return sadFortuneService.getFortune();
    }
}
