public class Holerite {

    Funcionario funcionario;
    double valorTotalHorasNormais;
    double valorTotalHorasExtras;
    double valorAdicionalFilhos;

    double CalcularValorTotal (){
        return valorTotalHorasNormais + valorTotalHorasExtras + valorAdicionalFilhos;
    }

    void imprimirHolerite () {
        System.out.println("-------- Holerite --------- %n");
        System.out.printf("Funcionario: %s %n", funcionario.nome);
        System.out.printf("Valor total de horas normais: %f %n", valorTotalHorasNormais);
        System.out.printf("Valor total de horas extras: %f %n", valorTotalHorasExtras);
        System.out.printf("Valor de adicional para filhos: %f %n", valorAdicionalFilhos);
        System.out.printf("Valor total do Salario: %f %n", CalcularValorTotal());

    }

}
