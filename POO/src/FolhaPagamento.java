public class FolhaPagamento {

    Holerite calcularSalario(ContratoTrabalho contratoTrabalho, int quantidadeHorasNormais, int quantidadeHorasExtras){
        Holerite holerite = new Holerite();
        holerite.funcionario = contratoTrabalho.funcionario;
        holerite.valorTotalHorasNormais = quantidadeHorasNormais * contratoTrabalho.valorHoraNormal;
        holerite.valorTotalHorasExtras = quantidadeHorasExtras * contratoTrabalho.valorHoraExtra;

        double salario = holerite.valorTotalHorasNormais + holerite.valorTotalHorasExtras;

        if (contratoTrabalho.temAdicional()){
            holerite.valorAdicionalFilhos = salario * 0.10;
        }

        return holerite;

    }

}