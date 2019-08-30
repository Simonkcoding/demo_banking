package com.company.clientservice.service;

import com.company.clientservice.model.BankingAccount;
import com.company.clientservice.util.feign.BankingClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
public class ClientService {
    @Autowired
    BankingClient client;

    public BankingAccount addFunds(BankingAccount bankingAccount){
        return client.addFunds(bankingAccount);
    }

    public Optional<BankingAccount> getBalance(int id){
        return client.getBankingById(id);
    }
}
