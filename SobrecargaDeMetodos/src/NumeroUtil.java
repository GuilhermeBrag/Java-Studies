public class NumeroUtil {

    static int MaiorNumero(int number1, int number2){
        return number1 > number2 ? number1: number2;
    }

    static int MaiorNumero (int number1, int number2, int number3){
        int MaiorNumero = 0;
        if (number1 > number2 && number1 > number3){
            return MaiorNumero = number1;
        } else if (number2 > number3) {
            return number2;
        } else {
            return number3;
        }
    }

    static double MaiorNumero (double number1, double number2) {
        return number1 > number2 ? number1: number2;
    }

    static double MaiorNumero (double number1, double number2, double number3) {
        double MaiorNumero;
        if (number1 > number2 && number1 > number3){
            return MaiorNumero = number1;
        } else if (number2 > number3) {
            return number2;
        } else {
            return number3;
        }
    }

}
