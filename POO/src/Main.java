public class Main {

    public static void main(String[] args) {

        Funcionario funcionario = new Funcionario();
        funcionario.nome = "Galvão";
        funcionario.quantidadeFilhos = 1;

        ContratoTrabalho contratoTrabalho = new ContratoTrabalho();
        contratoTrabalho.funcionario = funcionario;
        contratoTrabalho.valorHoraNormal = 7.50;
        contratoTrabalho.valorHoraExtra = 15.0;

        FolhaPagamento folhaPagamento = new FolhaPagamento();
        int quantidadeHorasNormais = 200;
        int quantidadeHorasExtras = 70;

        Holerite holerite = folhaPagamento.calcularSalario(contratoTrabalho,quantidadeHorasNormais,
                            quantidadeHorasExtras);

        holerite.imprimirHolerite();

    }

}