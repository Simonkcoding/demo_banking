package com.company.clientservice.controller;

import com.company.clientservice.model.BankingAccount;
import com.company.clientservice.service.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/account")
public class ClientController {

    @Autowired
    ClientService service;

    @PostMapping("/addfunds")
    @ResponseStatus(HttpStatus.CREATED)
    public BankingAccount addFunds(@RequestBody BankingAccount bankingAccount){
        return service.addFunds(bankingAccount);
    }

    @GetMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    public Optional<BankingAccount> getBankingById(@PathVariable int id){
        return service.getBalance(id);
    }
}
