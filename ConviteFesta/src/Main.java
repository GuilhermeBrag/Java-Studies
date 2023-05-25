import java.time.*;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

public class Main {

    private static final Scanner ENTRADA = new Scanner(System.in);

    private static final DateTimeFormatter FORMATAR_DATA = DateTimeFormatter.ofPattern("dd/MM/yyyy");
    private static final DateTimeFormatter FORMATAR_HORA = DateTimeFormatter.ofPattern("HH:mm");
    private static final DateTimeFormatter FORMATAR_DATA_HORA_COMPLETA = DateTimeFormatter
            .ofPattern("dd 'de' MMMM 'de' yyyy 'às' HH:mm (zzzz)")
            .withLocale(new Locale("pt", "BR"));



    public static void main(String[] args) {
        LocalDate dataFestaLocal = requisitarDataLocalFesta("Data local da festa (dd/MM/yyyy): ");
        LocalTime horarioFestaLocal = requisitarHorarioLocalFesta("Horário local da festa (HH:mm): ");

        LocalDateTime dataHoraFesta = LocalDateTime.of(dataFestaLocal,horarioFestaLocal);

        ZonedDateTime dataFestaFusoPadrao = dataHoraFesta
                .atZone(ZoneId.systemDefault());

        ZonedDateTime dataFestaFusoSp = dataFestaFusoPadrao
                .withZoneSameInstant(ZoneId.of("America/Sao_Paulo"));

        ZonedDateTime dataFestaFusoLosAngeles = dataFestaFusoPadrao
                .withZoneSameInstant(ZoneId.of("America/Los_Angeles"));

        ZonedDateTime dataFestaFusoJapao = dataFestaFusoPadrao
                .withZoneSameInstant(ZoneId.of("Japan"));

        System.out.println(FORMATAR_DATA_HORA_COMPLETA.format(dataFestaFusoSp));
        System.out.println(FORMATAR_DATA_HORA_COMPLETA.format(dataFestaFusoLosAngeles));
        System.out.println(FORMATAR_DATA_HORA_COMPLETA.format(dataFestaFusoJapao));

    }


    public static LocalDate requisitarDataLocalFesta(String descricao) {
        while (true) {
            try {
                System.out.print(descricao);
                String dataFestaTxt = ENTRADA.nextLine();

                return LocalDate.parse(dataFestaTxt,FORMATAR_DATA);

            } catch (Exception e) {
                System.out.println("Data inválida. Tente Novamente");
            }
        }
    }

    public static LocalTime requisitarHorarioLocalFesta(String descricao) {
        while (true) {
            try {
                System.out.print(descricao);
                String horaFestaTxt = ENTRADA.nextLine();

                return LocalTime.parse(horaFestaTxt,FORMATAR_HORA);

            }catch (Exception e) {
                System.out.println("Horário inválido. Tente novamente ");
            }
        }

    }

}