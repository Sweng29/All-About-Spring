package com.mant.is.daoimpl;

import com.mant.is.dao.FortuneService;
import org.springframework.stereotype.Component;

import java.util.Random;

/*
*
* Practice Activity :
*
*  GENERATE RANDOM FORTUNE STRINGS FROM AN ARRAY
*
* */
@Component
public class SadFortuneService implements FortuneService {

    private final String[] sadFortunes = new String[]
            {"Yo!, you are out of balance",
                    "You will get lost from country",
                    "You will not be able to sleep",
                    "You will not reach home at time"
            };

    @Override
    public String getFortune() {
        return sadFortunes[new Random().nextInt(4)];
    }
}
