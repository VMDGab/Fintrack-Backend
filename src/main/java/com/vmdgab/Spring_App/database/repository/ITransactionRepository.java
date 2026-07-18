package com.vmdgab.Spring_App.database.repository;

import com.vmdgab.Spring_App.database.models.TransactionEntity;
import com.vmdgab.Spring_App.enums.TransactionType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.math.BigDecimal;
import java.util.List;
import java.util.UUID;

@Repository
public interface ITransactionRepository extends JpaRepository<TransactionEntity, UUID> {
    List<TransactionEntity> findAllByPaymentMethod(String paymentMethod);

    @Query("SELECT COUNT(amount) FROM TransactionEntity t WHERE t.type = :type ")
    BigDecimal countAmount(TransactionType type);
}
