package com.vmdgab.Spring_App.Controllers;

import com.vmdgab.Spring_App.domain.Transaction;
import com.vmdgab.Spring_App.services.TransactionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/transaction")
public class TransactionController {
    @Autowired
    private TransactionService transactionService;

    @GetMapping("/transaction")
    public String lancamentoWorks(){
        return "Works";
    }

    @PostMapping("/newTransaction")
    public Transaction newLancamento(@RequestBody Transaction body){
        return transactionService.newTransaction(body);
    }

    @PutMapping("/editTransaction/{id}")
    public Transaction editLancamento(@PathVariable("id") int id, @RequestParam(value = "filter", defaultValue = "nenhum") String filter, @RequestBody Transaction body){
        return transactionService.editTransaction(id, body);
    }

}
