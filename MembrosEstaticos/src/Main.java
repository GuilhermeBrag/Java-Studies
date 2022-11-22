public class Main {
    public static void main(String[] args) {
        double areaQuadrado = CalcularAreaGeometricas.quadrado(10.5);
        double areaCirculo = CalcularAreaGeometricas.circulo(10.5);

        System.out.printf("Calculando Área de um quadrado: %.2f %n", areaQuadrado);

        System.out.printf("Calculando Área de um circulo: %.2f %n", areaCirculo);


    }
}