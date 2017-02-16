package com.github.chabanenk0.Entity;

/**
 * Created by dmitry on 13.02.17.
 */
public class WinterTyre extends Tyre
{
    private String protectorType;

    public WinterTyre(double diameter, String modelName, String protectorType)
    {
        super(diameter, modelName);
        this.protectorType = protectorType;
    }

    public String getProtectorType() {
        return protectorType;
    }

    public void setProtectorType(String protectorType) {
        this.protectorType = protectorType;
    }
}
