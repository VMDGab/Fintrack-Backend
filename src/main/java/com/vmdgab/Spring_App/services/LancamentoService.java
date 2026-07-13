package com.vmdgab.Spring_App.services;

import com.vmdgab.Spring_App.domain.lancamento;
import org.springframework.stereotype.Service;

@Service
public class LancamentoService {
    public lancamento newLancamento(lancamento lancamento){
        return lancamento;
    }

    public lancamento editLancamento(int id, lancamento lancamento){
        if(id == 1){
            return lancamento;
        }else{
            throw new RuntimeException("Lançamento não encontrado");
        }
    }
}
