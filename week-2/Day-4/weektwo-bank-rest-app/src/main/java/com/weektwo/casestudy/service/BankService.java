package com.weektwo.casestudy.service;

import com.weektwo.casestudy.domain.BankAccount;
import com.weektwo.casestudy.exception.InvalidAmountException;

import java.util.List;

public interface BankService
{
    int createNewAccount(BankAccount ba);
    int updateAccountDeatils(BankAccount ba);
    boolean activateAccount(Long acNum);
    boolean deActivateaccount(Long acNum);
    double withdraw(Long acNum,double amt)throws InvalidAmountException;
    double deposit(Long acNum,double amt)throws InvalidAmountException;
    int transferMoney(Long srcAc,Long dstAc,int amt)throws InvalidAmountException;
    BankAccount finAccountByAcNum();
    List<BankAccount> findAllAccounts();;
    List<BankAccount> namesStartwith(String prefix);
}