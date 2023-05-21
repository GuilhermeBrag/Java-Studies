import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;


public class Main {

    private static final Scanner ENTRADA = new Scanner(System.in);
    private static final DateTimeFormatter DATA_FORMATADA = DateTimeFormatter.ofPattern("dd/MM/yyyy");

    public static void main(String[] args) {
        Period idade = calcularIdade("Data de nascimento: ");

        imprimirIdade(idade);
    }


    public static Period calcularIdade (String descricao) {
        while (true) {
            try {
                System.out.print(descricao);
                String dataNascTxt = ENTRADA.nextLine();

                LocalDate dataNasc = LocalDate.parse(dataNascTxt, DATA_FORMATADA);
                LocalDate agora = LocalDate.now();

                return dataNasc.until(agora);

            } catch (Exception e) {
                System.out.println("Data Inválida. Tente Novamente");
            }
        }
    }

    public static void imprimirIdade(Period idade) {
            String idadeFormatada = String.format("Paciente tem %d %s, %d %s e %d %s de vida.",idade.getYears(),
                    (idade.getYears() > 1) ? "anos" : "ano",
                    idade.getMonths(),(idade.getMonths() > 1) ? "meses" : "mes",
                    idade.getDays(),(idade.getDays() > 1) ? "dias" : "dia");
            System.out.println(idadeFormatada);
    }

}