package com.luv2code.springdemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SwimJavaConfigDemoApp {
    public static void main(String[] args) {

        //read spring config java class
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SportConfig.class);

        //get bean from spring container
        SwimCoach theCoach = context.getBean("swimCoach",SwimCoach.class);

        //call a method on the bean
        System.out.println(theCoach.getDailyWorkout());

        //call a method to get daily fortune
        System.out.println(theCoach.getDailyFortune());

        //call our new swim coach methods has props values injected
        System.out.println("email: "+ theCoach.getEmail());
        System.out.println("team: "+ theCoach.getTeam());

        //close context
        context.close();
    }
}
