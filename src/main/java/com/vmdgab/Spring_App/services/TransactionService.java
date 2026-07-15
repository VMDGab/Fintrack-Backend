package com.vmdgab.Spring_App.services;

import com.vmdgab.Spring_App.domain.Transaction;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class TransactionService {

    private static final List<Transaction> TRANSACTIONS = new ArrayList<>();

    public List<Transaction> findAll(){
        return new ArrayList<>(TRANSACTIONS);
    }

    public Transaction newTransaction(Transaction transaction){
         TRANSACTIONS.add(transaction);
         return transaction;
    }

    public Transaction editTransaction(int id, Transaction transaction){
        if(id == 1){
            return transaction;
        }else{
            throw new RuntimeException("Lançamento não encontrado");
        }
    }
}
