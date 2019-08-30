package com.company.bankingservice.controller;

import com.company.bankingservice.model.BankingAccount;
import com.company.bankingservice.service.BankingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/account")
public class BankingController {

    @Autowired
    BankingService service;

    @PostMapping("/addfunds")
    @ResponseStatus(HttpStatus.CREATED)
    public BankingAccount addFunds(@RequestBody BankingAccount banking){
        return service.addFund(banking);
    }

    @GetMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    public Optional<BankingAccount> getBankingById(@PathVariable int id){
        return service.getBankingById(id);
    }
}
