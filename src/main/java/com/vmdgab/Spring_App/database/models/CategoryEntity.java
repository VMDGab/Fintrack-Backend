package com.vmdgab.Spring_App.database.models;

import jakarta.persistence.*;
import lombok.*;

import java.util.UUID;

@Entity
@Table(name = "category")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
public class CategoryEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID category_id;

    @Column(length = 100, nullable = false)
    private String title;

    @Column(nullable = false )
    private Boolean essential;


}
