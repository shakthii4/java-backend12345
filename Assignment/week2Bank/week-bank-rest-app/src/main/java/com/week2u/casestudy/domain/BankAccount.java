package com.week2u.casestudy.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.sql.Date;


@Entity
public class BankAccount
{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long acNum;
    private String acHldNm;
    private Double balance;
    private Boolean status;
    private Date acrd;

    public Long getAcNum() {
        return acNum;
    }

    public void setAcNum(Long acNum) {
        this.acNum = acNum;
    }

    public String getAcHldNm() {
        return acHldNm;
    }

    public void setAcHldNm(String acHldNm) {
        this.acHldNm = acHldNm;
    }

    public Double getBalance() {
        return balance;
    }

    public void setBalance(Double balance) {
        this.balance = balance;
    }

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }

    public Date getAcrd() {
        return acrd;
    }

    public void setAcrd(Date acrd) {
        this.acrd = acrd;
    }
}
