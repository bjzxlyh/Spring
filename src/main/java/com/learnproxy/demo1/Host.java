package com.learnproxy.demo1;
//房东
public class Host implements Rent{
    @Override
    public void rent() {
        System.out.println("房东要租房子");
    }
}
