package com.vmdgab.Spring_App.Controllers;

import com.vmdgab.Spring_App.database.models.TransactionEntity;
import com.vmdgab.Spring_App.dto.TransactionDTO;
import com.vmdgab.Spring_App.services.TransactionService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

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
    public void newLancamento(@RequestBody TransactionDTO transanction){
        transactionService.newTransaction(transanction);

    }


}
