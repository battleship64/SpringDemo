package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationBeanScopeDemoApp {
    public static void main(String[] args) {
        //load Spring config file
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        //retrieve bean from spring container
        Coach theCoach =context.getBean("tennisCoach",Coach.class);

        Coach alphaCoach = context.getBean("tennisCoach",Coach.class);
        //check if the same

        boolean result = (theCoach==alphaCoach);

        //print results

        System.out.println("\nPoing to the same object: "+result);
        System.out.println("\nMemory location of theCoach: "+theCoach);
        System.out.println("\nMemory location of alphaCoach: "+alphaCoach);
    }
}
