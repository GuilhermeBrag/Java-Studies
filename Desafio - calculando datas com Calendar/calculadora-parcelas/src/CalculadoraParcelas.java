import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

public class CalculadoraParcelas {

    public static List<Date> calcular(Date dataPrimeiraParcela, int quantidadeParcelas) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(dataPrimeiraParcela);

        int diaPrimeiroVencimento =  calendar.get(Calendar.DAY_OF_MONTH);

        List<Date> datasParcelas = new ArrayList<>();

        for (int i = 0; i < quantidadeParcelas; i++) {
            int diaVencimentoParcelaAtual = calendar.get(Calendar.DAY_OF_MONTH);
            int diaDoMesMaximo = calendar.getActualMaximum(Calendar.DAY_OF_MONTH);


            if (diaVencimentoParcelaAtual < diaPrimeiroVencimento && diaDoMesMaximo <= diaPrimeiroVencimento) {
                calendar.set(Calendar.DAY_OF_MONTH, diaDoMesMaximo);
            }

            datasParcelas.add(calendar.getTime());

            calendar.add(Calendar.MONTH, 1);
        }

        return datasParcelas;
    }

}