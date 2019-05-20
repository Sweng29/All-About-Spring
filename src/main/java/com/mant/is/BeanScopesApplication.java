package com.mant.is;

import com.mant.is.daoimpl.BaseballCoach;
import com.mant.is.daoimpl.CricketCoach;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/*
*  Bean Scopes :
*   There are five types of bean scopes in Spring
*   1. Singleton
*   2. Prototype
*   3. Session
*   4. GlobalSession
*   5. Request
*
*   Most commonly used scopes are : Singleton and Protoype
*   We will look two bean scopes here,
*   1. Singleton
*   2. Prototype
* */
public class BeanScopesApplication {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext("beanScopesApplicationContext.xml");

        System.out.println("====================== BEAN SCOPES ==============================\n\n");
        // Creating two objects for the Singleton beans
        CricketCoach cricketCoach = (CricketCoach) classPathXmlApplicationContext.getBean("cricketCoach", CricketCoach.class);
        CricketCoach cricketCoach1 = (CricketCoach) classPathXmlApplicationContext.getBean("cricketCoach", CricketCoach.class);

        boolean checkObject = (cricketCoach == cricketCoach1);

        System.out.println("====================== SINGLETON SCOPE ==============================");
        System.out.println("Bean objects point to same location : " + checkObject);
        System.out.println("cricketCoach object memory location : " + cricketCoach);
        System.out.println("cricketCoach1 object memory location : " + cricketCoach1);

        // Testing bean scopes for prototype
        BaseballCoach baseballCoach = (BaseballCoach) classPathXmlApplicationContext.getBean("baseballCoach", BaseballCoach.class);
        BaseballCoach baseballCoach1 = (BaseballCoach) classPathXmlApplicationContext.getBean("baseballCoach", BaseballCoach.class);

        checkObject = (baseballCoach == baseballCoach1);
        System.out.println("\n====================== PROTOTYPE SCOPE ==============================");

        System.out.println("Bean objects point to same location : " + checkObject);
        System.out.println("baseBallCoach object memory location : " + baseballCoach);
        System.out.println("baseBallCoach1 object memory location : " + baseballCoach1);

        System.out.println("\n====================== BEAN LIFE CYCLE ==============================");

        BaseballCoach baseballCoachBeanLifeCyle = (BaseballCoach) classPathXmlApplicationContext.getBean("baseballCoachBeanLifeCycle", BaseballCoach.class);

        // to call destroy method of bean
        classPathXmlApplicationContext.close();

    }
}
