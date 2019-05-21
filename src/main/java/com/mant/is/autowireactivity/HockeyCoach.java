package com.mant.is.autowireactivity;

import com.mant.is.dao.Coach;
import com.mant.is.dao.FortuneService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

/*
*  Example activity for annotations based beans configuration and autowired :
*  @Qualifier("nameOftheBean") annotation is used to uniquely identify a bean if we don't specify
*  any qualifier name the spring container will get confused during dependency injection,
*  so we use qualifiers to uniquely identify any bean.
*
*  NOTE  : Here i am getting a weired thing this should through an exception at runtime when i remove @Qualifier
*  annotation but it does not it explicitly injects HappyFortuneService to hockyCoach by default.
*
* */

@Component
public class HockeyCoach implements Coach {

    @Autowired
    @Qualifier("coolFortuneService")
    private FortuneService fortuneService;

    @Override
    public String getCoachMessage() {
        return "Hockey coach has something to say to you!";
    }

    @Override
    public String getDailyfortune() {
        return fortuneService.getFortune();
    }
}
