package com.vmdgab.Spring_App.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

@Getter
@Setter
@AllArgsConstructor

public class lancamento {
    private String descricao;
    private BigDecimal valor;

//    public lancamento(BigDecimal valor, String descricao) {
//        this.valor = valor;
//        this.descricao = descricao;
//    }
//
//    public String getDescricao() {
//        return descricao;
//    }
//
//    public void setDescricao(String descricao) {
//        this.descricao = descricao;
//    }
//
//    public BigDecimal getValor() {
//        return valor;
//    }
//
//    public void setValor(BigDecimal valor) {
//        this.valor = valor;
//    }
}
