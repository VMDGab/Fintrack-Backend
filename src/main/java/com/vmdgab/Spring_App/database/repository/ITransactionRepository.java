package com.vmdgab.Spring_App.database.repository;

import com.vmdgab.Spring_App.database.models.TransactionEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface ITransactionRepository extends JpaRepository<TransactionEntity, UUID> {

}
