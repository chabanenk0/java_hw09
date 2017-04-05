package com.github.chabanenk0.Plugin;

import com.github.chabanenk0.Entity.Car;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class CarAccelerateAspect {
    @Before("execution(* com.github.chabanenk0.Entity.Car.drive(..))")
    public void accelerateBefore(JoinPoint joinPoint) {
        Car car = (Car) joinPoint.getTarget();
        car.accelerate(1);
    }

    @After("execution(* com.github.chabanenk0.Entity.Car.drive(..))")
    public void accelerateAfter(JoinPoint joinPoint) {
        Car car = (Car) joinPoint.getTarget();
        car.accelerate(1);
    }

    @Around("execution(* com.github.chabanenk0.Entity.Car.getPosition(..))")
    public long getPositionAfter(ProceedingJoinPoint joinPoint) throws Throwable {
        Object returnValue = joinPoint.proceed(joinPoint.getArgs());

        return (Long)returnValue + 100;
    }

}
