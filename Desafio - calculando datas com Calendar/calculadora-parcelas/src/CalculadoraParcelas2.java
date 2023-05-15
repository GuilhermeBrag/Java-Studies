import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

public class CalculadoraParcelas2 {

    public static List<Date> calcular(Date dataPrimeiraParcela, int quantidadeParcelas) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(dataPrimeiraParcela);

        int diaPrimeiroVencimento =  calendar.get(Calendar.DAY_OF_MONTH);

        List<Date> datasParcelas = new ArrayList<>();
        datasParcelas.add(calendar.getTime());

        for (int i = 0; i < quantidadeParcelas; i++) {
            calendar.add(Calendar.MONTH, 1);

            int diaParcelaVencimento = calendar.get(Calendar.DAY_OF_MONTH);
            int ultimoDiaDoMes = calendar.getActualMaximum(Calendar.DAY_OF_MONTH);

            if (diaParcelaVencimento < diaPrimeiroVencimento &&
                diaPrimeiroVencimento <= ultimoDiaDoMes) {
                calendar.set(Calendar.DAY_OF_MONTH, diaPrimeiroVencimento);
            }

            datasParcelas.add(calendar.getTime());
        }

        return datasParcelas;
    }

    private static void limparHora(Calendar calendar) {

    }

}