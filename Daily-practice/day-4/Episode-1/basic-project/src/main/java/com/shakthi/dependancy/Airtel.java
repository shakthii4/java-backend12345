package com.shakthi.dependancy;

public class Airtel implements Sim
{
    public Airtel()//automatically beans call this constructor
    {
        System.out.println("hi");
    }

    @Override
    public void calling()
    {
        System.out.println("calling using Airtel mobile");

    }

    @Override
    public void data()
    {
        System.out.println("browsing internet using Airtel Sim");

    }
}
