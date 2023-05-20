import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CalculadoraParcelas {

    public  List<LocalDate> calcular(LocalDate dataPrimeiraParcela, int quantidadeParcelas){
            List<LocalDate> datasParcelas = new ArrayList<>();

        for (int i = 0; i < quantidadeParcelas; i++) {
            LocalDate dataProximaParcela = dataPrimeiraParcela.plusMonths(i);
            datasParcelas.add(dataProximaParcela);
        }


        return datasParcelas;
    }


}


