package com.github.chabanenk0;

import com.github.chabanenk0.Entity.Car;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main
{
    public static void main(String[] args)
    {
        ApplicationContext context = new ClassPathXmlApplicationContext(new String[] {"car_beans.xml"});
        Car car = (Car) context.getBean("car");
        System.out.println(car);
        System.out.println("Hello, world!");
    }
}
