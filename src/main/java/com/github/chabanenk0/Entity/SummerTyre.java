package com.github.chabanenk0.Entity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("summerTyre")
public class SummerTyre extends Tyre
{
    protected String description;

    public SummerTyre()
    {
        super(0, "unnamed tyre model");
        this.description = "no description";
    }
    public SummerTyre(double diameter, String modelName, String description)
    {
        super(diameter, modelName);
        this.description = description;
    }

    @Autowired
    public void initTyre()
    {
        this.setDiameter(2.3);
        this.setModelName("superModel");
        this.description = "super description";
    }

    public Object clone() throws CloneNotSupportedException
    {
        return (Object) new SummerTyre(this.getDiameter(), this.getModelName(), this.description);
    }

    public String toString()
    {
        return "Summer Tyre(diameter=" + this.getDiameter() + "modelName=" + this.getModelName()
                + ", description=" +this.description + ")";
    }

}
