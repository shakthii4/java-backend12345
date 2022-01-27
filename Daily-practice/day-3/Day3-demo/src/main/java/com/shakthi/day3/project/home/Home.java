package com.shakthi.day3.project.home;

import com.shakthi.day3.project.connection.Connection;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
//@Scope(value = "prototype")
public class Home
{
    private String owner;
    private int doorNo;
    @Autowired
    private Connection connection;
    public Home()
    {
        System.out.println("Home Home");
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public int getDoorNo() {
        return doorNo;
    }

    public void setDoorNo(int doorNo) {
        this.doorNo = doorNo;
    }
    public void connect()
    {
        connection.switchOn();
        System.out.println("Connection ");
    }
}
