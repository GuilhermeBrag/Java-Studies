package Empresa.rh;

import java.util.Objects;

public class Funcionario {
    private String nome;
    private double valorHora;


    public Funcionario(String nome, double valorHora) {
        setNome(nome);
        setValorHora(valorHora);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        Objects.requireNonNull(nome);
        this.nome = nome;
    }

    public double getValorHora() {
        return valorHora;
    }

    public void setValorHora(double valorHora) {
        if (valorHora < 0) {
            throw new IllegalArgumentException("O valor da hora não pode ser menor que zero!");
        }
        this.valorHora = valorHora;
    }

    protected double calcularSalario(int horasTrabalhadas){
        return getValorHora() * horasTrabalhadas;
        // return valorHora * horasTrabalhadas;
    }

    public Holerite gerarHolerite(int horasTrabalhadas, String mesAno){
        double valorSalario = calcularSalario(horasTrabalhadas);
        return new Holerite(getNome(), mesAno,valorSalario);
    }

    @Override
    public String toString() {
        return "Funcionário{" +
                "nome='" + nome + '\'' +
                ", valorHora=" + valorHora +
                '}';
    }
}
