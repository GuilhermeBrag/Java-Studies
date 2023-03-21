import java.util.Scanner;

public class InverterString {

    public static void main(String[] args) {

        // Lendo a string do usuário
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite uma string: ");
        String original = sc.nextLine();
        sc.close();

        // Invertendo a string
        String invertida = "";
        for (int i = original.length() - 1; i >= 0; i--) {
            invertida += original.charAt(i);
        }

        // Imprimindo a string invertida
        System.out.println("A string invertida é: " + invertida);
    }

}