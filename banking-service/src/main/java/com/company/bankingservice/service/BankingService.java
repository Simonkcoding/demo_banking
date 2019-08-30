package com.company.bankingservice.service;

import com.company.bankingservice.model.BankingAccount;
import com.company.bankingservice.repository.BankingRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;
import java.util.Optional;

@Component
public class BankingService {

    @Autowired
    BankingRepo repo;

    public BankingService(BankingRepo repo) {
        this.repo = repo;
    }

    //(
    // Number="100” ,
    // Credit = 1000
    // )

    //(
    // Number="100” ,
    // Credit = 0
    // )

    public BankingAccount addFund(BankingAccount banking){
       BankingAccount bankingAccount = repo.findById(100).get();
        BigDecimal oldAmount = bankingAccount.getCredit();
        BigDecimal amountToAdd = banking.getCredit();
        bankingAccount.setCredit(oldAmount.add(amountToAdd));
        bankingAccount = repo.save(bankingAccount);
        return bankingAccount;
    }

    public Optional<BankingAccount> getBankingById(int id){
        return repo.findById(id);
    }


}
