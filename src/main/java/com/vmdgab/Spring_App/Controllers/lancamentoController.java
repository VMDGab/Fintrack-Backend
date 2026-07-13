package com.vmdgab.Spring_App.Controllers;

import com.vmdgab.Spring_App.domain.lancamento;
import com.vmdgab.Spring_App.services.LancamentoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/")
public class lancamentoController {
    @Autowired
    private LancamentoService LancamentoService;

//    public lancamentoController(LancamentoService lancamentoService){
//        this.LancamentoService = lancamentoService;
//    }

    @GetMapping("/Lancamento")
    public String lancamentoWorks(){
        return "Works";
    }

    @PostMapping("/newLancamento")
    public lancamento newLancamento(@RequestBody lancamento body){
        return LancamentoService.newLancamento(body);
    }

    @PutMapping("/editLancamento/{id}")
    public lancamento editLancamento(@PathVariable("id") int id, @RequestParam(value = "filter", defaultValue = "nenhum") String filter, @RequestBody lancamento body){
        return LancamentoService.editLancamento(id, body);
    }

}
