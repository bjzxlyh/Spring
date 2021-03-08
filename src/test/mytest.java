package com.learnspring.assembly;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class mytest {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationcontext.xml");
        hello hi = (hello) context.getBean("hello");
        System.out.println((hi.toString()));
    }


}