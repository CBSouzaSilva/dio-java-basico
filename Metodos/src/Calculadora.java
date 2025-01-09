/*
1. Calcule as 4 operações básicas: soma, subtração, multiplicação e divisão.
sempre 2 valores devem ser passados
 */
public class Calculadora {
    public static void soma(double numero1, double numero2) {
        double resultado = numero1 + numero2;

        System.out.println("A soma de "+numero1+" mais "+numero2+" é: "+resultado);
    }

    public static void subtracao(double numero1, double numero2){
        double resultado = numero1 - numero2;
        System.out.println("A subtração de "+numero1+" menos "+numero2+" é: "+resultado);
    }

    public static void multiplicacao(double numero1, double numero2) {
        double resultado = numero1 * numero2;
        System.out.println("O resultado da Multiplicação entre "+numero1+" e "+numero2+" é: "+resultado);
    }

    public static void divisao(double numero1, double numero2) {
        double resultado = numero1 / numero2;
        System.out.println("O resultado da Divisão de "+numero1+" por "+numero2+" é: "+resultado);
    }
}
