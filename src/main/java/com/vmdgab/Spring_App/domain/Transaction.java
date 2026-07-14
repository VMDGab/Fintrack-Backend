package com.vmdgab.Spring_App.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDate;

@Getter
@Setter
@AllArgsConstructor

public class Transaction {
    private String description;
    private BigDecimal amount;
    private LocalDate Transaction;
    private transactionType type;
    private String category;
    private String bankAccount;
    private String paymentMethod;
    private String card;
    private Boolean installment;
    private Integer numOfInstallment;
    private Boolean essential;
    private TransactionStatus status;
    private LocalDate dueDate;
    private LocalDate paymentDate;
    private String observation;
}
