package com.company.clientservice.util.feign;

import com.company.clientservice.model.BankingAccount;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@FeignClient("banking-service")
public interface BankingClient {

    @PostMapping("/account/addfunds")
    public BankingAccount addFunds(@RequestBody BankingAccount banking);

    @GetMapping("/account/{id}")
    public Optional<BankingAccount> getBankingById(@PathVariable int id);

}
