package com.mant.is;

import com.mant.is.daoimpl.BaseballCoach;
import com.mant.is.daoimpl.CricketCoach;
import com.mant.is.daoimpl.TrackCoach;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
@ImportResource("classpath:applicationContext.xml")
public class SpringpracticeApplication {

    public static void main(String[] args) {
        ApplicationContext applicationContext = SpringApplication.run(SpringpracticeApplication.class, args);

        // Constructor based DI
        BaseballCoach baseballCoach = (BaseballCoach) applicationContext.getBean("baseballCoach");
        System.out.println("============= CONSTRUCTOR BASED D.I ========================");
        System.out.println(baseballCoach.getCoachMessage());
        System.out.println(baseballCoach.getDailyfortune());

        // GETTER BASED D.I
        System.out.println("============= GETTER BASED D.I ========================");
        TrackCoach trackCoach = (TrackCoach) applicationContext.getBean("trackCoach");
        System.out.println(trackCoach.getCoachMessage());
        System.out.println(trackCoach.getDailyfortune());

        // LITERAL VALUES D.I
        System.out.println("============= LITERAL VALUES BASED D.I ========================");
        CricketCoach cricketCoach = (CricketCoach) applicationContext.getBean("cricketCoach");
        System.out.println(cricketCoach.getEmailAddress());
        System.out.println(cricketCoach.getTeamName());

        // Properties file based D.I
        System.out.println("============= PROPERTY FILE VALUES BASED D.I ========================");
        CricketCoach cricketCoachProperties = (CricketCoach) applicationContext.getBean("cricketCoachProperties");
        System.out.println(cricketCoachProperties.getEmailAddress());
        System.out.println(cricketCoachProperties.getTeamName());
    }

}
