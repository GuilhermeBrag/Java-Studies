public class Main {
    public static void main(String[] args) {
        System.out.println("- Sobrecarga de Métodos -");
        System.out.println("-------------------------");

        int maiorNumero2Inteiros = NumeroUtil.MaiorNumero(10, 21);
        System.out.printf("Maior Numero de 2 inteiros: %d %n", maiorNumero2Inteiros);

        int maiorNumero3inteiros = NumeroUtil.MaiorNumero(10,11,12);
        System.out.printf("Maior Numero de 3 inteiros: %d %n", maiorNumero3inteiros);

        double maiorNumero2Decimais = NumeroUtil.MaiorNumero(2.5, 7.4);
        System.out.printf("Maior Numero de 2 inteiros: %.1f %n", maiorNumero2Decimais);

        double maiorNumero3Decimais = NumeroUtil.MaiorNumero(2.5, 7.4, 10.3);
        System.out.printf("Maior Numero de 2 inteiros: %.1f %n", maiorNumero3Decimais);

    }
}