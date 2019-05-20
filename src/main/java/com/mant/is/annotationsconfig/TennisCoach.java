package com.mant.is.annotationsconfig;

import com.mant.is.dao.Coach;
import com.mant.is.dao.FortuneService;
import org.springframework.stereotype.Component;
/*
*  To configure beans with annotations in Spring
*
*   Whenever the Spring project is run the spring scans for different classes for bean registration,
*   A bean/class annotated with following annotations can be called as beans and spring
*   will handle those at runtime
*
*  1. @Component("beanId")
*
*  NOTE : beanId is not nessacary, spring can handle that as well,
 *        which will generate default name in class name camel case notation,
*         i.e same name as class with first character in lower case
* */

@Component("tennisCoach")
public class TennisCoach implements Coach {

    private FortuneService fortuneService;

    public TennisCoach(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }

    @Override
    public String getCoachMessage() {
        return "tennis Star coach has sent you a message!";
    }

    @Override
    public String getDailyfortune() {
        return fortuneService.getFortune();
    }
}
