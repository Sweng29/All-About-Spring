package com.mant.is.annotationsconfig;

import com.mant.is.dao.Coach;
import org.springframework.stereotype.Component;

@Component
public class ActivityCoach implements Coach {

    @Override
    public String getCoachMessage() {
        return "Activity Coach wants to say something.!";
    }

    @Override
    public String getDailyfortune() {
        return "You don't have good fortune day today.! :D";
    }
}
