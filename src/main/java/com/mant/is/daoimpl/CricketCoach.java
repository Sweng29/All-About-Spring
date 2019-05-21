package com.mant.is.daoimpl;

import com.mant.is.dao.Coach;
import org.springframework.stereotype.Component;

@Component
public class CricketCoach implements Coach {

    private String emailAddress;
    private String teamName;

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public String getTeamName() {
        return teamName;
    }

    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }

    @Override
    public String getCoachMessage() {
        return "Do some batting practice for 15 mints.";
    }

    @Override
    public String getDailyfortune() {
        return "You will make hundred today.!";
    }
}
