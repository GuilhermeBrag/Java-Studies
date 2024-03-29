import com.algaworks.banco.*;

public class Principal {

    public static void main(String[] args) {
        CaixaEletronico caixaEletronico = new CaixaEletronico();

        ContaEspecial conta1 = new ContaEspecial(new Titular("jao","12312312300"),
                1111,99999, 90);
        conta1.setLimiteChequeEspecial(1000);
        conta1.depositar(100);
        conta1.creditarRendimentos(10);

        ContaInvestimento conta2 = new ContaInvestimento(new Titular("jao","12312312300"),
                1111,99999);

        conta2.depositar(100);
        conta2.creditarRendimentos(10);

        ContaSalario conta3 = new ContaSalario(new Titular("jao","12312312300"),
                1111,99999, 18_000);
        conta3.depositar(100);

       caixaEletronico.imprimirDemonstrativo(conta1);


    }


}
