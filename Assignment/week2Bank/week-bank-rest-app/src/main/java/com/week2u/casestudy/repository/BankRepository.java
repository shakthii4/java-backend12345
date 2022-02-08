package com.week2u.casestudy.repository;

import com.week2u.casestudy.domain.BankAccount;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface BankRepository extends JpaRepository<BankAccount,Long>
{
    @Modifying
    @Query(value = "update bank_account set balance =:bal where ac_num =: acNum",nativeQuery = true)
    void withdraw(@Param("bal") double bal,@Param("acNum") Long acNum);


    BankAccount findAccountByAcNum(Long acNum);

    BankAccount findAllBankAccounts();
}
