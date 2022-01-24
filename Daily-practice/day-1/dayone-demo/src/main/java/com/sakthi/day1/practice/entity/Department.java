package com.sakthi.day1.practice.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Department
{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long dId;
    private String dName;
    private  String dAddress;
    private String dCode;

    public Department(Long dId, String dName, String dAddress, String dCode) {
        this.dId = dId;
        this.dName = dName;
        this.dAddress = dAddress;
        this.dCode = dCode;
    }

    public Department() {
    }

    public Long getdId() {
        return dId;
    }

    public void setdId(Long dId) {
        this.dId = dId;
    }

    public String getdName() {
        return dName;
    }

    public void setdName(String dName) {
        this.dName = dName;
    }

    public String getdAddress() {
        return dAddress;
    }

    public void setdAddress(String dAddress) {
        this.dAddress = dAddress;
    }

    public String getdCode() {
        return dCode;
    }

    public void setdCode(String dCode) {
        this.dCode = dCode;
    }

    @Override
    public String toString() {
        return "Department{" +
                "dId=" + dId +
                ", dName='" + dName + '\'' +
                ", dAddress='" + dAddress + '\'' +
                ", dCode='" + dCode + '\'' +
                '}';
    }


}
