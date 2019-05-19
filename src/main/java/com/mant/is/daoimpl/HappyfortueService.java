package com.mant.is.daoimpl;

import com.mant.is.dao.FortuneService;

public class HappyfortueService implements FortuneService {
    @Override
    public String getFortune() {
        return "Happy fortune! :) ";
    }
}
