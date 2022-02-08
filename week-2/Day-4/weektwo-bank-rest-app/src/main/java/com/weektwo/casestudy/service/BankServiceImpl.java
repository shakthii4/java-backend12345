package com.weektwo.casestudy.service;

import com.weektwo.casestudy.domain.BankAccount;
import com.weektwo.casestudy.repository.BankRepository;

import java.util.List;

public class BankServiceImpl implements BankService
{
    private BankRepository repository;

    @Override
    public int createNewAccount(BankAccount ba) {
        return 0;
    }

    @Override
    public int updateAccountDeatils(BankAccount ba) {
        return 0;
    }

    @Override
    public boolean activateAccount(Long acNum) {
        return false;
    }

    @Override
    public boolean deActivateaccount(Long acNum) {
        return false;
    }

    @Override
    public double withdraw(Long acNum, double amt) {
        return 0;
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
    public BankAccount finAccountByAcNum() {
        return null;
    }

    @Override
    public List<BankAccount> findAllAccounts() {
        return null;
    }

    @Override
    public List<BankAccount> namesStartwith(String prefix) {
        return null;
    }
}
