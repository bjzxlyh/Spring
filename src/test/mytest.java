package com.learnspring.assembly;

import learnspring_2.people;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class mytest {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
        people p = context.getBean("people",people.class);
        p.getC().shout();
        p.getD().shout();
    }


}