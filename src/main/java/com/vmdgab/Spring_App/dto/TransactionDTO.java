package com.vmdgab.Spring_App.dto;

import com.vmdgab.Spring_App.enums.TransactionStatus;
import com.vmdgab.Spring_App.enums.transactionType;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.UUID;

@Getter
@Setter
@AllArgsConstructor

public class TransactionDTO {
    private String description;
    private BigDecimal amount;
    private transactionType type;
    private UUID category;
    private String bankAccount;
    private UUID paymentMethod;
    private String card;
    private Boolean installment;
    private Integer numOfInstallment;
    private Boolean essential;
    private TransactionStatus status;
    private LocalDate dueDate;
    private LocalDate paymentDate;
    private String observation;
    private UUID user;

}
