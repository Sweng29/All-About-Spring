package com.mant.is.daoimpl;

import com.mant.is.dao.FortuneService;
import org.springframework.stereotype.Component;

@Component
public class HappyfortueService implements FortuneService {
    @Override
    public String getFortune() {
        return "Happy fortune! :) ";
    }
}
