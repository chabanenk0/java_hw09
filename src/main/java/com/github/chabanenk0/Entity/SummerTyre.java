package com.github.chabanenk0.Entity;

/**
 * Created by dmitry on 13.02.17.
 */
public class SummerTyre extends Tyre
{
    protected String description;
    public SummerTyre(double diameter, String modelName, String description)
    {
        super(diameter, modelName);
        this.description = description;
    }
}
