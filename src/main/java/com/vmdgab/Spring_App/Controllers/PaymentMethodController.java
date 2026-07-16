package com.vmdgab.Spring_App.Controllers;

import com.vmdgab.Spring_App.database.models.PaymentMethodEntity;
import com.vmdgab.Spring_App.dto.PaymentMethodDTO;
import com.vmdgab.Spring_App.services.PaymentMethodService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/v1/payment-method")
public class PaymentMethodController {

    private final PaymentMethodService paymentMethodService;

    public PaymentMethodController(PaymentMethodService paymentMethodService){
        this.paymentMethodService = paymentMethodService;
    }

    @GetMapping
    public List<PaymentMethodEntity> getAll(){
        return paymentMethodService.findAll();
    }


    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
        public void newMethod(@RequestBody PaymentMethodDTO method){
        paymentMethodService.newMethod(method);
        }
}
