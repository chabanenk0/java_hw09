package com.github.chabanenk0.Entity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("winterTyre")
public class WinterTyre extends Tyre
{
    private String protectorType;

    public WinterTyre()
    {
        super(.8, "my model name");
        this.protectorType = "";
    }


    public WinterTyre(double diameter, String modelName, String protectorType)
    {
        super(diameter, modelName);
        this.protectorType = protectorType;
    }

    @Autowired
    public void initWinterTyre()
    {
        this.setDiameter(0.7);
        this.setModelName("Super winter model");
        this.setProtectorType("winter protector 1");
    }

    public String getProtectorType() {
        return protectorType;
    }

    public void setProtectorType(String protectorType) {
        this.protectorType = protectorType;
    }
    public Object clone() throws CloneNotSupportedException
    {
        return (Object) new WinterTyre(this.getDiameter(), this.getModelName(), this.protectorType);
    }

    public String toString()
    {
        return "Winter Tyre(diameter=" + this.getDiameter() + "modelName=" + this.getModelName()
                + ", protectorType=" +this.getProtectorType() + ")";
    }
}
