package com.github.chabanenk0.Plugin;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class CarLoggingAspect {
    @Before("execution(* com.github.chabanenk0.Entity.Car.drive(..))")
    public void logBefore() {
        System.out.println("Log: Before Driving...");
    }
}
