package com.vmdgab.Spring_App.services;

import com.vmdgab.Spring_App.database.models.CategoryEntity;
import com.vmdgab.Spring_App.database.models.PaymentMethodEntity;
import com.vmdgab.Spring_App.database.models.TransactionEntity;
import com.vmdgab.Spring_App.database.models.UserEntity;
import com.vmdgab.Spring_App.database.repository.ICategoryRepository;
import com.vmdgab.Spring_App.database.repository.IPaymentMethodRepository;
import com.vmdgab.Spring_App.database.repository.ITransactionRepository;
import com.vmdgab.Spring_App.database.repository.IUserRepository;
import com.vmdgab.Spring_App.dto.TransactionDTO;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class TransactionService {
    private final ITransactionRepository transactionRepository;
    private final ICategoryRepository categoryRepository;
    private final IUserRepository userRepository;
    private final IPaymentMethodRepository paymentMethodRepository;


    public List<TransactionEntity>findAll(){
        return transactionRepository.findAll();
    }

    public void newTransaction(TransactionDTO transaction){

        CategoryEntity category = categoryRepository.findById(transaction.getCategory())
                .orElseThrow(() -> new RuntimeException("Category not found"));

        UserEntity user = userRepository.findById(transaction.getUser())
                .orElseThrow(() -> new RuntimeException("Category not found"));

        PaymentMethodEntity method = paymentMethodRepository.findById(transaction.getPaymentMethod())
                .orElseThrow(() -> new RuntimeException("Category not found"));

        transactionRepository.save(
                TransactionEntity.builder()
                        .description(transaction.getDescription())
                        .amount(transaction.getAmount())
                        .type(transaction.getType())
                        .bankAccount(transaction.getBankAccount())
                        .card(transaction.getCard())
                        .installment(transaction.getInstallment())
                        .numOfInstallment(transaction.getNumOfInstallment())
                        .essential(transaction.getEssential())
                        .status(transaction.getStatus())
                        .dueDate(transaction.getDueDate())
                        .paymentDate(transaction.getPaymentDate())
                        .observation(transaction.getObservation())
                        .category(category)
                        .paymentMethod(method)
                        .user(user)
                        .build()
        );
    }

}
