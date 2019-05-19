package com.mant.is.daoimpl;

import com.mant.is.dao.Coach;

public class TrackCoach implements Coach {
    @Override
    public String getCoachMessage() {
        return "Hello from Track Coach!";
    }
}
