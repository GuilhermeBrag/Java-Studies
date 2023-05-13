import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws ParseException {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Preço do produto em Dólares: ");
        String precoProdutoStr = scanner.nextLine();

        System.out.print("Preço de 1 Dólar em Real: ");
        String precoDolarStr = scanner.nextLine();

        DecimalFormat formatadorUs = new DecimalFormat("#,##0.00",
            new DecimalFormatSymbols(Locale.US));
        formatadorUs.setParseBigDecimal(true);

        DecimalFormat formatadorBr = new DecimalFormat("#,##0.00",
            new DecimalFormatSymbols(new Locale("pt", "BR")));
        formatadorBr.setParseBigDecimal(true);

        DecimalFormat formatadorBrMoeda = new DecimalFormat("¤ #,##0.00",
            new DecimalFormatSymbols(new Locale("pt", "BR")));

        BigDecimal precoProduto = (BigDecimal) formatadorUs.parse(precoProdutoStr);
        BigDecimal precoDolar = (BigDecimal) formatadorBr.parse(precoDolarStr);

        BigDecimal total = precoDolar.multiply(precoProduto);

        System.out.printf("Preço do produto em Reais: %s %n", formatadorBrMoeda.format(total));



    }
}