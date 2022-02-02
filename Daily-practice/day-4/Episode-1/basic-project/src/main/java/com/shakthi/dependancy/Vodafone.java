package com.shakthi.dependancy;

public class Vodafone implements Sim
{
    @Override
    public void calling()
    {
        System.out.println("calling using Vodafone mobile");
    }

    @Override
    public void data()
    {
        System.out.println("browsing internet using Vodafone Sim");

    }
}
