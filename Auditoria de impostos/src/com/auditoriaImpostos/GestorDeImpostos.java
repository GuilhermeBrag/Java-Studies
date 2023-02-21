package com.auditoriaImpostos;

public class GestorDeImpostos {
    private double valorTotalImpostos;
     public void adicionar(Pessoa pessoa){
            double valorImpostosPessoa = pessoa.calcularImpostos();

            System.out.printf("Impostos devidos de %s: %.2f %n", pessoa.getNome(),valorImpostosPessoa);

            valorTotalImpostos += valorImpostosPessoa;
        }

    public double getValorTotalImpostos(){
        return valorTotalImpostos;
    }

}
