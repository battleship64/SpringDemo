package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationDemo {
    public static void main(String[] args) {

        //read class config
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        //get bean from spring container
        Coach theCoach = context.getBean("tennisCoach",Coach.class);

        //call a method on the bean
        System.out.println(theCoach.getDailyWorkout());

        //call a method to get daily fortune
        System.out.println(theCoach.getDailyFortune());

        //close context
        context.close();
    }
}
