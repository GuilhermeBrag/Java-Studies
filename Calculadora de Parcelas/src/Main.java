import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Scanner;

public class Main {

    private static final Scanner ENTRADA = new Scanner(System.in);
    private static final DateTimeFormatter FORMATADOR_DATA = DateTimeFormatter.ofPattern("dd/MM/yyyy");

    public static void main(String[] args) {
        System.out.print("Data da primeira parcela: ");
        String primeiraParcelaTxt = ENTRADA.nextLine();

        System.out.print("Quantidade de parcelas: ");
        int quantParcelas = ENTRADA.nextInt();

        LocalDate  primeiraParcela = LocalDate.parse(primeiraParcelaTxt, FORMATADOR_DATA);

        CalculadoraParcelas calculadora = new CalculadoraParcelas();
        List<LocalDate> datasParcelas = calculadora.calcular(primeiraParcela,quantParcelas);

        imprimirParcelas(datasParcelas);

    }

    public static void imprimirParcelas(List<LocalDate> datasParcelas){
        for (int i = 0; i < datasParcelas.size() ; i++) {
            System.out.printf("Parcela #%d - %s %n", i+1,
                    FORMATADOR_DATA.format(datasParcelas.get(i)));
        }
    }

}