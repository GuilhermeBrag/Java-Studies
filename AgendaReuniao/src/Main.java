import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.time.temporal.TemporalAdjusters;
import java.util.Formatter;
import java.util.Locale;
import java.util.Scanner;

public class Main {

    private static final Scanner ENTRADA = new Scanner(System.in);

    private static final DateTimeFormatter FORMATAR_ANO_MES = DateTimeFormatter.ofPattern("MMMM 'de' yyyy",
            new Locale("pt", "BR"));

    private static final DateTimeFormatter FORMATAR_DATA_COMPLETA = DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL)
            .withLocale(new Locale("pt", "BR"));

    public static void main(String[] args) {
        System.out.print("Ano: ");
        Year ano = Year.of(ENTRADA.nextInt());

        System.out.print("Mês inicial: ");
        Month mesInicial = Month.of(ENTRADA.nextInt());

        YearMonth mesAno = YearMonth.of(ano.getValue(),mesInicial);

        System.out.printf("Gerando agenda anual de reuniões desde %s... %n", FORMATAR_ANO_MES.format(mesAno));

        for (int mes = mesInicial.getValue(); mes <= Month.DECEMBER.getValue(); mes++ ) {
            LocalDate dataReunioes = mesAno.withMonth(mes).atDay(1)
                    .with(TemporalAdjusters.nextOrSame(DayOfWeek.MONDAY));
            System.out.println(FORMATAR_DATA_COMPLETA.format(dataReunioes));
        }

    }

    }
