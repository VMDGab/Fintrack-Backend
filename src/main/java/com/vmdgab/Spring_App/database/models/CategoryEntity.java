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
@Table(name = "category")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class CategoryEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID category_id;

    @Column(length = 100, nullable = false)
    private String title;

    @Column(nullable = false )
    private Boolean essential;

    @OneToMany(mappedBy = "category")
    private List<TransactionEntity> transactions = new ArrayList<>();
}
