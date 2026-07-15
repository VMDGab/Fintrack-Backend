package com.vmdgab.Spring_App.database.models;

import com.vmdgab.Spring_App.domain.TransactionStatus;
import com.vmdgab.Spring_App.domain.transactionType;
import jakarta.persistence.*;
import lombok.*;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.UUID;

@Entity
@Table(name = "transaction")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
public class TransactionEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    @Column(name = "description", nullable = false)
    private String description;

    @Column(name = "amount", nullable = false)
    private BigDecimal amount;

    @Column(name = "type", nullable = false)
    private transactionType type;

    @Column(name = "bankAccount", nullable = false)
    private String bankAccount;

    @Column(name = "paymentMethod", nullable = false)
    private String paymentMethod;

    @Column(name = "card")
    private String card;

    @Column(name = "installment")
    private Boolean installment;

    @Column(name = "numOfInstallment")
    private Integer numOfInstallment;

    @Column(name = "essential", nullable = false)
    private Boolean essential;

    @Column(name = "status", nullable = false)
    private TransactionStatus status;

    @Column(name = "dueDate")
    private LocalDate dueDate;

    @Column(name = "paymentDate")
    private LocalDate paymentDate;

    @Column(name = "observation")
    private String observation;

    @ManyToOne
    @JoinColumn(name = "category_id")
    private CategoryEntity category;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private UserEntity user;

    @ManyToOne
    @JoinColumn(name = "payment_method_id")
    private PaymentMethodEntity payment_method;
}
