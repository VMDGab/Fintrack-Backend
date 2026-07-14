package com.vmdgab.Spring_App.services;

import com.vmdgab.Spring_App.domain.Transaction;

import org.springframework.stereotype.Service;

@Service
public class TransactionService {
    public Transaction newTransaction(Transaction transaction){
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
