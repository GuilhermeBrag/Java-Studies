package com.seguradora.modelo;

public class CarroParticular extends VeiculoAutomotor {

    public CarroParticular(String modelo, double valorMercado, int anoFabricacao) {
        super(modelo, valorMercado, anoFabricacao);
    }

    @Override
    public double calcularValorPremio() {
        double valorPremio = getValorMercado() * 0.04;

        if (getAnoFabricacao() < 2000 ){
            return valorPremio *= 1.05;
        }
        return valorPremio;
    }

    @Override
    public String descrever() {
        return String.format("Carro modelo %s no ano de %d, avaliado em %.2f",
                getModelo(), getAnoFabricacao(), getValorMercado());
    }
}
