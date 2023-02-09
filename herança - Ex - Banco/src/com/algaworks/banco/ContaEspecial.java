package com.algaworks.banco;

public class ContaEspecial extends ContaInvestimento{
    private double tarifaMensal;
    private double limiteChequeEspecial;

    public ContaEspecial(Titular titular, int agencia, int numero, double tarifaMensal) {
        super(titular, agencia, numero);
        this.tarifaMensal = tarifaMensal;
    }

    public double getTarifaMensal() {
        return tarifaMensal;
    }

    public void setTarifaMensal(double tarifaMensal) {
        this.tarifaMensal = tarifaMensal;
    }

    public double getLimiteChequeEspecial() {
        return limiteChequeEspecial;
    }


    public double getSaldoDisponivel(){
        return getSaldo() + getLimiteChequeEspecial();
    }

    @Override
    public final void imprimirDemonstrativo() {
        super.imprimirDemonstrativo();

        System.out.printf("Saldo disponível: %.2f %n", getSaldoDisponivel());
    }

    public void setLimiteChequeEspecial(double limiteChequeEspecial) {
        this.limiteChequeEspecial = limiteChequeEspecial;
    }
    protected final void validarSaldoParaSaque(double valorSaque) {
        if (getSaldoDisponivel() < valorSaque) {
            throw new RuntimeException("Saldo insuficiente para saque");
        }
    }

    public void debitarTarifaMensal(){
            sacar(getTarifaMensal());
    }

    public String toString() {
        return "ContaEspecial{" +
                "titular=" + getTitular() +
                ", agencia=" + getAgencia() +
                ", numero=" + getNumero() +
                ", valorTotalRendimentos=" + getValorTotalRendimentos() +
                ", TarifaMensal" + tarifaMensal +
                ", LimiteChequeEspecial" + limiteChequeEspecial +
                '}';
    }



}