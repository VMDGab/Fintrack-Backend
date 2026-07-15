package com.vmdgab.Spring_App.database.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Entity
@Table(name = "payment_method")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class PaymentMethodEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID payment_method_id;

    @Column( nullable = false)
    private String title;

    @OneToMany(mappedBy = "payment_method")
    private List<TransactionEntity> transactions = new ArrayList<>();
}
