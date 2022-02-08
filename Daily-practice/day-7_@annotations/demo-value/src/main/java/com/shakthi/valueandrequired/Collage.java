package com.shakthi.valueandrequired;

import org.springframework.stereotype.Component;

//@Component("collageBean") //create the beans or object to the container (we ever spring find any class got a annotations called @component that means this is a component for this paricular class --> creating the object for us)
// id --> that is reference name
@Component // not providing the bean name it will provide default that is (c)ollage
public class Collage
{

    private Principal principal;

    public void setPrincipal(Principal principal) {
        this.principal = principal;
    }

    public Collage(Principal principal)
    {
        principal.principalInfo();
        this.principal = principal;
    }

    public void test()
    {
        System.out.println("test------1");
    }
}
