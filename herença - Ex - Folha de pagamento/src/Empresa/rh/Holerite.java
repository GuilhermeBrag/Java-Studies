package Empresa.rh;

public record Holerite(String nome, String mesAno, double valorSalario) {

    public void imprimir() {
        System.out.println();
        System.out.printf("Nome: %s", nome);
        System.out.printf("Mês/Ano: %s", mesAno );
        System.out.printf("Salario: %f", valorSalario );
    }

}
