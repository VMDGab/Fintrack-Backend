package com.vmdgab.Spring_App.Controllers;

import com.vmdgab.Spring_App.domain.Transaction;
import com.vmdgab.Spring_App.services.TransactionService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/transaction")
@RequiredArgsConstructor
public class TransactionController {

    private final TransactionService transactionService;

    @GetMapping("")
    public ResponseEntity<List<Transaction>> findAllTransactions(){
        return new ResponseEntity<>(
                transactionService.findAll(),
                HttpStatus.OK
        );
    }

    @PostMapping("")
    public ResponseEntity<Transaction> newLancamento(@RequestBody Transaction body){
        return new ResponseEntity<>(
                transactionService.newTransaction(body),
                HttpStatus.CREATED
        );
    }

    @PutMapping("/{id}")
    public ResponseEntity<Transaction> editLancamento(@PathVariable("id") int id, @RequestParam(value = "filter", defaultValue = "nenhum") String filter, @RequestBody Transaction body){
        return new ResponseEntity<>(
                transactionService.editTransaction(id, body),
                HttpStatus.OK
        );
    }

}
