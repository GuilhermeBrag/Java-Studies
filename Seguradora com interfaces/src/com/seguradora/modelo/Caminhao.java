package com.seguradora.modelo;

public class Caminhao extends VeiculoAutomotor {
    private int quantidadeEixos;

    public Caminhao(String modelo, double valorMercado, int anoFabricacao, int quantidadeEixos) {
        super(modelo, valorMercado, anoFabricacao);
        this.quantidadeEixos = quantidadeEixos;
    }

    public int getQuantidadeEixos() {
        return quantidadeEixos;
    }

    public void setQuantidadeEixos(int quantidadeEixos) {
        this.quantidadeEixos = quantidadeEixos;
    }
    @Override
    public double calcularValorPremio() {
        double valorPremio = getValorMercado() * 0.02;
        return valorPremio += quantidadeEixos * 50;
    }

    @Override
    public String descrever() {
        return String.format("Caminhão modelo %s no ano de %d, %d eixos, avaliado em %.2f",
                getModelo(), getAnoFabricacao(), getQuantidadeEixos(),getValorMercado());
    }
}
