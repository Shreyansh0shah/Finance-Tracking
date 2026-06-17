package com.library.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.library.entity.Transaction;
import com.library.service.TransactionService;

@RestController
@RequestMapping("/transactions")
public class TransactionController {

    @Autowired
    private TransactionService service;

    @PostMapping
    public Transaction add(@RequestBody Transaction t) {
        return service.addTransaction(t);
    }

    @GetMapping
    public List<Transaction> getAll() {
        return service.getAllTransactions();
    }

    @GetMapping("/balance")
    public double getBalance() {
        return service.getBalance();
    }

    @GetMapping("/category/{category}")
    public List<Transaction> getByCategory(@PathVariable String category) {
        return service.getByCategory(category);
    }
    
    @GetMapping("/total/{category}")
    public Double getTotal(@PathVariable String category) {
        return service.getTotalByCategory(category);
    }
}
