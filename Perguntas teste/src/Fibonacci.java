import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        // Define os primeiros dois números da sequência
        int primeiro = 0;
        int segundo = 1;

        // Lê o número a ser verificado
        Scanner input = new Scanner(System.in);
        System.out.print("Digite um número para verificar se pertence à sequência de Fibonacci: ");
        int numero = input.nextInt();

        // Itera pela sequência até encontrar um número maior ou igual ao número fornecido
        while (segundo < numero) {
            int proximo = primeiro + segundo;
            primeiro = segundo;
            segundo = proximo;
        }

        // Verifica se o número fornecido pertence à sequência
        if (segundo == numero) {
            System.out.println(numero + " pertence à sequência de Fibonacci.");
        } else {
            System.out.println(numero + " não pertence à sequência de Fibonacci.");
        }
    }
}