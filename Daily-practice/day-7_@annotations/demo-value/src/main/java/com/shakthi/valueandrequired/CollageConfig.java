package com.shakthi.valueandrequired;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Configuration // it will tells to spring this is a configuration class and we need define componentscan class
//@ComponentScan(basePackages = "com/shakthi/valueandrequired/Collage.java") //
public class CollageConfig
{
    public void principalBean()
    {
        f
    }

        @Bean // when we use @ bean we don't want @Component scan

    // @Bean(name = "clg") -  --> using different  reference name       // @Component,  @Bean ------> both are working similerly creating an object for us.
    public Collage collageBean()  //this method name is used to giving or creating object reference  @--#1
    {
        Collage collage=new Collage();
        return new Collage();

    }

}
