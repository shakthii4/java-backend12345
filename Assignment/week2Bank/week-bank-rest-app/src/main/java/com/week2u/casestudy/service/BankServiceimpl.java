package com.week2u.casestudy.service;

import com.week2u.casestudy.domain.BankAccount;
import com.week2u.casestudy.repository.BankRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BankServiceimpl implements BankService
{
    @Autowired
    private BankRepository repository;

    @Override
    public void createNewAccount(BankAccount ba)
    {
         repository.save(ba);
    }

    @Override
    public int updateAccountDetails(BankAccount ba) {
        return 0;
    }

    @Override
    public boolean activateAccount(Long acNum)
    {
      //  repository.
        return true;
    }

    @Override
    public boolean deactivateAccount(Long acNum) {
        return false;
    }

    @Override
    public double withdraw(Long acNum, double amt) {
        repository.withdraw(amt,acNum);
        return amt;
    }

    @Override
    public double deposit(Long acNum, double amt) {
        return 0;
    }

    @Override
    public int transferMoney(Long srcAc, Long dstAc, int amt) {
        return 0;
    }

    @Override
    public BankAccount findAccountByAcNum(Long acNum) {
        BankAccount bankAccount=repository.findAccountByAcNum(acNum);
        return bankAccount;
    }

    @Override
    public List<BankAccount> nameStartWith(String prefix) {
        return null;
    }

 /*   @Override
    public List<BankAccount> findAllBankAccounts() {
        BankAccount bankAccount = repository.findAllBankAccounts();
        return (List<BankAccount>) bankAccount;
    }

    @Override
    public List<BankAccount> nameStartWith(String prefix) {
        return repository.findAllBankAccounts(prefix);
    }*/
}
