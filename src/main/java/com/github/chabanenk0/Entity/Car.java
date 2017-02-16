package com.github.chabanenk0.Entity;

import com.sun.org.apache.xpath.internal.functions.WrongNumberArgsException;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Class "Car" for car bean, dependent on "wheels", "Engine"...
 */
public class Car
{
    private String modelName;
    private String number;
    private List<Wheel> wheels;
    private Engine engine;

    public Car(Engine engine, List<Wheel> wheels, String modelName, String number) throws WrongNumberArgsException {
        if (4 != wheels.size()) {
            throw new WrongNumberArgsException("Wrong number of wheels!!");
        }
        this.wheels = wheels;
        this.engine = engine;
        this.modelName = modelName;
        this.number = number;
    }

    public Engine getEngine()
    {
        return this.engine;
    }

    public void setEngine(Engine newEngine)
    {
        this.engine = newEngine;
    }

    public List<Wheel> getWheels()
    {
        return this.wheels;
    }

    public Wheel getWheel(int i)
    {
        return this.wheels.get(i);
    }

    public Wheel changeWheel(Wheel wheel, int i)
    {
        Wheel oldWheel = this.wheels.get(i);
        this.wheels.set(i, wheel);

        return oldWheel;
    }

    public String getModelName() {
        return modelName;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String toString()
    {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Car:\n");
        stringBuilder.append("ModelName:");
        stringBuilder.append(this.getNumber().toString());

        stringBuilder.append("\nNumber:");
        stringBuilder.append(this.getNumber().toString());

        stringBuilder.append("\nEngine:\n");
        stringBuilder.append(this.getEngine().toString());
        stringBuilder.append("\nWheels:\n");
        for(Wheel wheel: this.getWheels()) {
            stringBuilder.append(wheel.toString());
            stringBuilder.append("\n");
        }

        return stringBuilder.toString();
    }
}
