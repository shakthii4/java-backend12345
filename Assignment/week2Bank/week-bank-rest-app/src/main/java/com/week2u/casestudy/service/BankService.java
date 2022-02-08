package com.week2u.casestudy.service;

import com.week2u.casestudy.domain.BankAccount;
import com.week2u.casestudy.exception.InvalidAmountException;

import java.util.List;

public interface BankService
{
    void createNewAccount(BankAccount ba);
    int updateAccountDetails(BankAccount ba);
    boolean activateAccount(Long acNum);
    boolean deactivateAccount(Long acNum);
    double withdraw(Long acNum,double amt)throws InvalidAmountException;
    double deposit(Long acNum,double amt);
    int transferMoney(Long srcAc,Long dstAc,int amt);
    BankAccount findAccountByAcNum(Long acNum);



    List<BankAccount> nameStartWith(String prefix);




}
