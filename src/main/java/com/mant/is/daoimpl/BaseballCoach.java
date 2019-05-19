package com.mant.is.daoimpl;

import com.mant.is.dao.Coach;

public class BaseballCoach implements Coach {

    @Override
    public String getCoachMessage() {
        return "Hello from baseball Coach!";
    }
}
