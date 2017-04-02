package com.github.chabanenk0.Entity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("wheel")
public class Wheel
{
    private Tyre tyre;
    private String modelName;
    private String type;
    private double diameter;

    public Wheel()
    {

    }

    @Autowired
    public void initWheel(SummerTyre tyre)
    {
        this.tyre = tyre;
        this.modelName = "nonamed wheel";
        this.type = "undefined type";
        this.diameter = 0;
    }

    public Wheel(@Qualifier("summerTyre") Tyre tyre, String modelName, @Value("configuratedTyreType") String type, @Value("3.14") double diameter)
    {
        this.tyre = tyre;
        this.modelName = modelName;
        this.type = type;
        this.diameter = diameter;
    }

    public String getModelName() {
        return modelName;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public double getDiameter() {
        return diameter;
    }

    public void setDiameter(double diameter) {
        this.diameter = diameter;
    }

    public Tyre getTyre() {
        return tyre;
    }

    public void setTyre(Tyre tyre) {
        this.tyre = tyre;
    }

    public Wheel clone() throws CloneNotSupportedException
    {
        return new Wheel((Tyre) this.tyre.clone(), this.modelName, this.type, this.diameter);
    }

    public String toString()
    {
        return "Wheel: diameter=" + this.diameter + ", type=" + this.type + ", modelName=" + this.modelName
                + ", tyre:" + this.tyre;
    }
}
