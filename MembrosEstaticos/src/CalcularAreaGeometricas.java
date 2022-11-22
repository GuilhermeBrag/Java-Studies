public class CalcularAreaGeometricas {

    static double pi = 3.14159265358979323846;

    static double quadrado(double lado) {
        return lado * lado;
    }

    static double circulo(double raio) {
        return quadrado(raio) * CalcularAreaGeometricas.pi;
    }
}
