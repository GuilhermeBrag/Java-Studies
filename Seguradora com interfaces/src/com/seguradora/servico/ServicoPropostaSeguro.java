package com.seguradora.servico;

import com.seguradora.modelo.BemSeguravel;

public class ServicoPropostaSeguro {

    public void emitir (BemSeguravel bem){
        System.out.println("----------------------");
        System.out.println("Proposta de Seguro");
        System.out.println("----------------------");
        System.out.println(bem.descrever());
        System.out.printf("Premio: R$%.2f %n", bem.calcularValorPremio());
    }
}
