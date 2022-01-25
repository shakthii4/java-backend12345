package com.week2u.casestudy.repository;

import com.week2u.casestudy.domain.BankAccount;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BankRepository extends JpaRepository<BankAccount,Long>
{
    List<BankAccount> findByAcHldNmStartingWith(String prefix);

    //List<BankAccount> findStatusTrue(Long acNum);
    @Modifying
    @Query(value = "update bank_account set balance = :bal where ac_num = :acNum", nativeQuery = true)
    public void withdraw(@Param("bal") double bal, @Param("acNum") Long acNum);

    @Modifying
    @Query(value = "update bank_account set balance = :bal where ac_num = :acNum", nativeQuery = true)
    public void deposit(@Param("bal") double bal, @Param("acNum") Long acNum);

}
