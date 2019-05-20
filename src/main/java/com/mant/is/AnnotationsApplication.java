package com.mant.is;

import com.mant.is.annotationsconfig.ActivityCoach;
import com.mant.is.annotationsconfig.TennisCoach;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationsApplication {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext("annotations-config.xml");
        /*
            This will goto xml file which will scan for the annotation based classes with the ids like tennisCoach
        *   that we have given @Component("") in TennisCoach class
        * */

        TennisCoach tennisCoach = (TennisCoach) classPathXmlApplicationContext.getBean("tennisCoach", TennisCoach.class);
        System.out.println("======================= ANNOTATIONS BASED CONFIG ========================================");
        System.out.println(tennisCoach.getCoachMessage());
        System.out.println(tennisCoach.getDailyfortune());

        System.out.println("\n======================= ANNOTATIONS BASED ACTIVITY ========================================");
        /*
        *  Here we have not given any bean id name in Activity @Component annotation,
        *  so spring will give default name as first lower character and other same class name like activityCoach here.!
        * */
        ActivityCoach activityCoach = (ActivityCoach) classPathXmlApplicationContext.getBean("activityCoach", ActivityCoach.class);
        System.out.println(activityCoach.getCoachMessage());
        System.out.println(activityCoach.getDailyfortune());
    }
}
