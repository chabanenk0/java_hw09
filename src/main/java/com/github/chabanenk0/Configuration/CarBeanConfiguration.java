package com.github.chabanenk0.Configuration;

import com.github.chabanenk0.Entity.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

import java.util.LinkedList;

@EnableAspectJAutoProxy
@Configuration
public class CarBeanConfiguration {
    @Bean
    public Car car(Engine engine, Wheel wheel) {
        LinkedList<Wheel> wheels = new LinkedList<Wheel>();

        wheels.add(wheel);

        for (int i = 1; i < 4; i++) {
            Wheel newWheel;

            try {
                newWheel = (Wheel) wheel.clone();
                wheels.add(newWheel);
            } catch (CloneNotSupportedException e) {
                e.printStackTrace();
            }
        }
        return new Car();
    }

    @Bean
    public Engine engine()
    {
        return new Engine("Volksvagen", 12356, 3.5, "dizel");
    }

    @Bean
    public Wheel wheel(SummerTyre summerTyre)
    {
        return new Wheel(
                summerTyre,
                "titanWheels",
                "usual",
                3.14
        );
    }

    @Bean
    public SummerTyre summerTyre()
    {
        return new SummerTyre(3.14, "summerProtector", "tyreDescription");
    }

    @Bean
    public WinterTyre winterTyre()
    {
        return new WinterTyre(3.14, "winterProtector", "winterProtectorSupperCool");
    }
}
