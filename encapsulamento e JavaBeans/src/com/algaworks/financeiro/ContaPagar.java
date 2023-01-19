package com.algaworks.financeiro;

import java.io.Serializable;

public class ContaPagar implements Serializable {

    private String descricao;

    private double valor;
    private String dataVencimento;
    private boolean pago;
    private Fornecedor fornecedor;


    public void setFornecedor(Fornecedor forncedor) {
        this.fornecedor = forncedor;
    }
    public Fornecedor getFornecedor() {
        return fornecedor;
    }

    public boolean isPago() {
        return pago;
    }

    public void setPago(boolean pago) {
        this.pago = pago;
    }
    public String getDataVencimento() {
        return dataVencimento;
    }

    public void setDataVencimento(String dataVencimento) {
        this.dataVencimento = dataVencimento;
    }
    public String getDescricao() {
        return descricao;
    }
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public double getValor() {
        return valor;
    }
    public void setValor(double valor) {
        this.valor = valor;
    }


  public void pagar(){
        if (isPago()) {
            throw new RuntimeException("A conta ja foi paga");
        }else {
//            setPago(true);
            pago = true;
        }
  }

  public void cancelarPagamento(){
        if (!isPago()) {
            throw new RuntimeException("A conta ainda não foi paga ou já foi cancelada!!");
        }else {
//            setPago(false);
            pago = false;
        }
  }

}


