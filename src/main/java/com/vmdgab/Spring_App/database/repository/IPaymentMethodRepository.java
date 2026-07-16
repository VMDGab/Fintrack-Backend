package com.vmdgab.Spring_App.database.repository;

import com.vmdgab.Spring_App.database.models.PaymentMethodEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface IPaymentMethodRepository extends JpaRepository<PaymentMethodEntity, UUID> {

}
