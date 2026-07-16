package com.vmdgab.Spring_App.database.models;

import jakarta.persistence.*;
import lombok.*;

import java.util.UUID;

@Entity
@Table(name = "payment_method")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
public class PaymentMethodEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID payment_method_id;

    @Column( nullable = false)
    private String title;

}
