package com.library.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.library.entity.Transaction;
import com.library.entity.TransactionType;
import com.library.repository.TransactionRepository;

@Service
public class TransactionService {
	@Autowired
    private TransactionRepository repo;

    public Transaction addTransaction(Transaction t) {
        return repo.save(t);
    }

    public List<Transaction> getAllTransactions() {
        return repo.findAll();
    }

    public double getBalance() {
        List<Transaction> list = repo.findAll();
        double balance = 0;

        for (Transaction t : list) {
            if (t.getType() == TransactionType.INCOME)
                balance += t.getAmount();
            else
                balance -= t.getAmount();
        }
        return balance;
    }

    public List<Transaction> getByCategory(String category) {
        return repo.findByCategory(category);
    }
    public Double getTotalByCategory(String category) {
        return repo.getTotalByCategory(category);
    }

}
