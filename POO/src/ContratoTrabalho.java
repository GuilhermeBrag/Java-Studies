public class ContratoTrabalho {

    Funcionario funcionario;
    double valorHoraNormal;
    double valorHoraExtra;

    boolean temAdicional()  {
        return funcionario.possuiFilho();
    }

}
