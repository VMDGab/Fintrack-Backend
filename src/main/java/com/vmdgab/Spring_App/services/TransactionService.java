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

import com.vmdgab.Spring_App.enums.TransactionType;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.List;
import java.util.UUID;

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

    public void save(TransactionDTO transaction){

        CategoryEntity category = categoryRepository.findById(transaction.getCategory())
                .orElseThrow(() -> new RuntimeException("Category not found"));

        UserEntity user = userRepository.findById(transaction.getUser())
                .orElseThrow(() -> new RuntimeException("User not found"));

        PaymentMethodEntity method = paymentMethodRepository.findById(transaction.getPaymentMethod())
                .orElseThrow(() -> new RuntimeException("Method not found"));

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

    public void update(UUID id, TransactionDTO transactionDTO){

        CategoryEntity category = categoryRepository.findById(transactionDTO.getCategory())
                .orElseThrow(() -> new RuntimeException("Category not found"));

        UserEntity user = userRepository.findById(transactionDTO.getUser())
                .orElseThrow(() -> new RuntimeException("User not found"));

        PaymentMethodEntity method = paymentMethodRepository.findById(transactionDTO.getPaymentMethod())
                .orElseThrow(() -> new RuntimeException("Method not found"));


        TransactionEntity transaction = transactionRepository.findById(id).orElseThrow(() -> new RuntimeException("id not found"));

        transaction.setDescription(transactionDTO.getDescription());
        transaction.setAmount(transactionDTO.getAmount());
        transaction.setType(transactionDTO.getType());
        transaction.setBankAccount(transactionDTO.getBankAccount());
        transaction.setCard(transactionDTO.getCard());
        transaction.setInstallment(transactionDTO.getInstallment());
        transaction.setNumOfInstallment(transactionDTO.getNumOfInstallment());
        transaction.setEssential(transactionDTO.getEssential());
        transaction.setStatus(transactionDTO.getStatus());
        transaction.setDueDate(transactionDTO.getDueDate());
        transaction.setPaymentDate(transactionDTO.getPaymentDate());
        transaction.setObservation(transactionDTO.getObservation());
        transaction.setCategory(category);
        transaction.setPaymentMethod(method);
        transaction.setUser(user);

        transactionRepository.save(transaction);
    }

    public BigDecimal getTotalAmount(TransactionType type){

        return transactionRepository.countAmount(type);
    }

}
