import com.auditoriaImpostos.*;

public class Main {
    public static void main(String[] args) {
        var gestorImpostos = new GestorDeImpostos();

        var jao = new PessoaFisica("Jao do Teste", 45_000);
        var maria = new PessoaFisica("Maria do Teste", 180_000);

        var bardoZe = new EmpresaSimples("Bar do Ze", 250_000,160_000);
        var codeConsultoria = new EmpresaLucroReal("Code Consultoria",8_000_000,6_000_000);

        gestorImpostos.adicionar(jao);
        gestorImpostos.adicionar(maria);

        gestorImpostos.adicionar(bardoZe);
        gestorImpostos.adicionar(codeConsultoria);

        System.out.printf("Total de Impostos: %.2f", gestorImpostos.getValorTotalImpostos());

    }
}