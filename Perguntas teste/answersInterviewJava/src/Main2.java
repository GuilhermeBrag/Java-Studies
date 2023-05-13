import java.math.BigDecimal;
import java.text.NumberFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.*;
import java.util.stream.Collectors;

public class Main2 {

    public static void main(String[] args) {
//        1 - Monte a estrutura condicional if/else para as regras abaixo e no final o que será mostrado para cada valores:
//        Regras:
//        - homens a partir de 65 anos, escrever APOSENTADO;
//        - mulheres a partir de 60 anos, escrever APOSENTADA;
//        - pessoas entre 13 que 18 anos, escrever ADOLESCENTE;
//        - pessoas menores que 13 anos, escrever CRIANÇAS;
//        - todos os outros, escrever ADULTO;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite seu sexo (masculino / feminino): ");
        String sexo = scanner.nextLine();

        System.out.print("Digite sua Idade: ");
        int idade = scanner.nextInt();


        if (sexo.equalsIgnoreCase("masculino")) {
            if (idade >= 65) {
                System.out.println("APOSENTADO");
            } else if (idade >= 13 && idade <= 18) {
                System.out.println("ADOLESCENTE");
            } else if (idade < 13) {
                System.out.println("CRIANÇA");
            } else {
                System.out.println("ADULTO");
            }
        } else if (sexo.equalsIgnoreCase("feminino")) {
             if (idade >= 60) {
                System.out.println("APOSENTADA");
            } else if (idade >= 13 && idade <= 18) {
                System.out.println("ADOLESCENTE");
            } else if (idade < 13) {
                System.out.println("CRIANÇA");
            } else {
                System.out.println("ADULTO");
            }
        } else {
            System.out.println("Sexo é invalido");
        }

//        2 - De acordo com o algoritmo a seguir, escolha uma das alternativas abaixo.
//        contador :=  3
//        soma  := 57
//        for (contador <= 10 ) {
//            if (contador < 5 || contador == 8 ) {
//                soma := soma - contador
//            } else {
//                soma = soma + contador
//            }
//            contador++
//        }
//        print(“O valor da soma é ” + soma)
//        a) O valor da soma é 57
//        b) O valor da soma é 69
//        c) O valor da soma é 79
//        X) O valor da soma é 93 // ESCOLHO ESSA ALTERNATIVA


    }


}