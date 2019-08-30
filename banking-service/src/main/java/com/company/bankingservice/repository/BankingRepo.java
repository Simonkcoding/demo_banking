package com.company.bankingservice.repository;

import com.company.bankingservice.model.BankingAccount;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BankingRepo extends JpaRepository<BankingAccount, Integer> {

}
