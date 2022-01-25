package com.week2u.casestudy.dto;

import com.week2u.casestudy.domain.BankAccount;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
@Entity
public class AmountTransferDto
{

    @Id
    private Long acNum;
    private Long srcAc;
    private Long dstAc;
    private Double amt;

    @OneToOne(mappedBy = "user")
    private BankAccount account;

    public Long getAcNum() {
        return acNum;
    }

    public void setAcNum(Long acNum) {
        this.acNum = acNum;
    }

    public Long getSrcAc() {
        return srcAc;
    }

    public void setSrcAc(Long srcAc) {
        this.srcAc = srcAc;
    }

    public Long getDstAc() {
        return dstAc;
    }

    public void setDstAc(Long dstAc) {
        this.dstAc = dstAc;
    }

    public Double getAmt() {
        return amt;
    }

    public void setAmt(Double amt) {
        this.amt = amt;
    }


}
