package com.vmdgab.Spring_App.services;

import com.vmdgab.Spring_App.database.models.PaymentMethodEntity;
import com.vmdgab.Spring_App.database.repository.IPaymentMethodRepository;
import com.vmdgab.Spring_App.dto.PaymentMethodDTO;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PaymentMethodService {

    private final IPaymentMethodRepository paymentMethodRepository;

    public PaymentMethodService(IPaymentMethodRepository paymentMethodRepository){
        this.paymentMethodRepository = paymentMethodRepository;
    }

    public List<PaymentMethodEntity> findAll(){
        return paymentMethodRepository.findAll();
    }

    public void newMethod(PaymentMethodDTO method){
        paymentMethodRepository.save(
                PaymentMethodEntity.builder()
                        .title(method.getTitle())
                        .build()
        );
    }
}
