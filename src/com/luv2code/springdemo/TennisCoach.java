package com.luv2code.springdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
@Scope("singleton")
public class TennisCoach implements Coach {

    //define init method
    @PostConstruct
    public void doMyStartupStuff(){
        System.out.println(">>TennisCoach:inside of doMyStartupStuff()");
    }

    //define destroy method
    @PreDestroy
    public void doMyCleanupStuff(){
        System.out.println(">>TennisCoach:inside of doMyCleanupStuff()");
    }

    @Autowired
    @Qualifier("randomFortuneService")
    private FortuneService fortuneService;

    public TennisCoach(){
        System.out.println("inside non-args costructor");
    }

    @Override
    public String getDailyWorkout() {
        return "Practice your backhand volley";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }

    /*
    @Autowired
    public TennisCoach(FortuneService theFortuneService){
        fortuneService=theFortuneService;
    }

     */
/*
    @Autowired
    public void setFortuneService(FortuneService theFortuneService) {
        System.out.println("Tennis Coach: inside setFortuneService();\n");
        fortuneService = theFortuneService;
    }

 */
//    @Autowired
//    public void doSomeCrazyStaff(FortuneService theFortuneService) {
//        System.out.println("Tennis Coach: inside doSomeCrazyStaff();\n");
//        fortuneService = theFortuneService;
//    }



}
