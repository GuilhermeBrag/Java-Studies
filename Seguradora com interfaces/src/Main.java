import com.seguradora.modelo.Caminhao;
import com.seguradora.modelo.CarroParticular;
import com.seguradora.modelo.ImovelResidencial;
import com.seguradora.servico.ServicoPropostaSeguro;

public class Main {
    public static void main(String[] args) {
        ServicoPropostaSeguro servicoPropostaSeguro = new ServicoPropostaSeguro();

        CarroParticular carro = new CarroParticular("Honda-Civic",120_000,2021);
        ImovelResidencial imovel = new ImovelResidencial(3_300_000, 400);
        Caminhao caminhao = new Caminhao("Volvo Fh540", 879_000,2022,4);

        servicoPropostaSeguro.emitir(carro);
        servicoPropostaSeguro.emitir(imovel);
        servicoPropostaSeguro.emitir(caminhao);

    }
}