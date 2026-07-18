package com.vmdgab.Spring_App.dto;

import com.vmdgab.Spring_App.enums.TransactionStatus;
import com.vmdgab.Spring_App.enums.TransactionType;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
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
    @NotBlank
    private String description;
    @NotNull
    private BigDecimal amount;
    @NotNull
    private TransactionType type;
    @NotNull
    private UUID category;
    private String bankAccount;
    @NotNull
    private UUID paymentMethod;
    private String card;
    @NotNull
    private Boolean installment;
    private Integer numOfInstallment;
    @NotNull
    private Boolean essential;
    @NotBlank
    private TransactionStatus status;
    private LocalDate dueDate;
    private LocalDate paymentDate;
    private String observation;
    @NotNull
    private UUID user;

}
