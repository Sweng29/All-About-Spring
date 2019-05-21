package com.mant.is;

import com.mant.is.autowireactivity.HockeyCoach;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AutowireActivityApplication {

    public static void main(String[] args) {

        ClassPathXmlApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext("autowiredActivityApplicationContext.xml");

        System.out.println("====================== AUTOWIRED ANNOTATION AND QUALIFIER ACTIVITY EXAMPLE ==============================\n\n");

        HockeyCoach hockeyCoach = (HockeyCoach) classPathXmlApplicationContext.getBean("hockeyCoach", HockeyCoach.class);
        System.out.println(hockeyCoach.getCoachMessage());
        System.out.println(hockeyCoach.getDailyfortune());
    }
}
