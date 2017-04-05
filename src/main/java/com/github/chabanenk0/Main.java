package com.github.chabanenk0;

import com.github.chabanenk0.Configuration.CarBeanConfiguration;
import com.github.chabanenk0.Entity.Car;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.NoSuchBeanDefinitionException;
import org.springframework.beans.factory.config.AutowireCapableBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationEvent;
import org.springframework.context.MessageSourceResolvable;
import org.springframework.context.NoSuchMessageException;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.ResolvableType;
import org.springframework.core.env.Environment;
import org.springframework.core.io.Resource;

import java.io.IOException;
import java.lang.annotation.Annotation;
import java.util.Locale;
import java.util.Map;

public class Main
{
    public static void main(String[] args)
    {
        ApplicationContext context = new ClassPathXmlApplicationContext(new String[] {"car_beans.xml"});
//        ApplicationContext context = new ClassPathXmlApplicationContext(new String[] {"car_beans_annotations.xml"});
        // @todo investigate why aspects doesn't work with my java-based configuration
//        ApplicationContext context = new AnnotationConfigApplicationContext(CarBeanConfiguration.class);

        Car car = (Car) context.getBean(Car.class);
        System.out.println(car);
        System.out.println("Position(outside Car)=" + car.getPosition());
        car.drive();
        System.out.println("Position(outside Car)=" + car.getPosition());
        car.drive();
        System.out.println("Position(outside Car)=" + car.getPosition());
        car.drive();
        System.out.println("Position(outside Car)=" + car.getPosition());
    }
}
