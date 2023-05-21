
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    private static final Scanner SCANNER = new Scanner(System.in);
    private static final DateTimeFormatter FORMATTER_DATA = DateTimeFormatter.ofPattern("dd/MM/yyyy");
    private static final DateTimeFormatter FORMATTER_HORARIO = DateTimeFormatter.ofPattern("HH:mm");
    private static final DateTimeFormatter FORMATTER_ALL = DateTimeFormatter
            .ofLocalizedDateTime(FormatStyle.FULL, FormatStyle.SHORT)
            .withLocale(new Locale("pt","br"));

    public static void main(String[] args) {

        LocalDate dataEvento = requisitarData("Data do evento: ");
        LocalTime horarioEvento = requisitarHorario("Horário do evento: ");

        LocalDateTime DateTimeEvento = LocalDateTime.of(dataEvento,horarioEvento);

        System.out.printf("Evento agendado para %s %n",FORMATTER_ALL.format(DateTimeEvento));

    }

        private static LocalDate requisitarData(String descricao) {
            while(true) {
                try {
                    System.out.print(descricao);
                    String data = SCANNER.nextLine();

                    return LocalDate.parse(data, FORMATTER_DATA);
                } catch (Exception e) {
                    System.out.println("Data Invalida. Tente Novamente");
                }
            }
        }


        private static LocalTime requisitarHorario(String descricao) {
            while (true) {
                try {
                    System.out.print(descricao);
                    String horario = SCANNER.nextLine();

                    return LocalTime.parse(horario,FORMATTER_HORARIO);
                } catch (Exception e) {
                    System.out.println("Horário Invalido. Tente Novamente");
                }
            }
        }


    }
