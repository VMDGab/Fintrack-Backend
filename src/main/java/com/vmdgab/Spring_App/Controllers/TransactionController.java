package com.vmdgab.Spring_App.Controllers;

import com.vmdgab.Spring_App.database.models.TransactionEntity;
import com.vmdgab.Spring_App.dto.TransactionDTO;
import com.vmdgab.Spring_App.enums.TransactionType;
import com.vmdgab.Spring_App.services.TransactionService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.math.BigDecimal;
import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/v1/transaction")
@RequiredArgsConstructor
public class TransactionController {
    
    private final TransactionService transactionService;

    @GetMapping
    public ResponseEntity<List<TransactionEntity>> findAllTransactions(){
        return new ResponseEntity<>(
                transactionService.findAll(),
                HttpStatus.OK
        );
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public void newTransaction(@RequestBody TransactionDTO transanction){
        transactionService.save(transanction);
    }

    @PostMapping("/amount")
    public ResponseEntity<BigDecimal> getTotalAmount(@RequestBody TransactionType type){
        return new ResponseEntity<>(
                transactionService.getTotalAmount(type),
                HttpStatus.OK
        );
    }

    @PutMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    public void editTransaction(@PathVariable UUID id, @RequestBody TransactionDTO transaction){
         transactionService.update(id, transaction);
    }

}
