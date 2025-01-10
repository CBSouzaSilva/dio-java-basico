/*
exemplo para a aula de sobrecarga:
Criar uma aplicação que calcule a área dos 3 quadriláteros notáveis:
Quadrado, retângulo e trapézio.
 */

//O nome do método é matido e a sua lida de paramentos é alterada isso contitui a sobrecarga
//o mesmo metodo calcula área de 3 tipos de figuras diferentes, basta o usuário informar o valor desejado
public class AreaQuadrilateros {
    public static void area(double lado){
        System.out.println("Área do quadrado: " + lado*lado);
    }

    public static void area(double lado1,double lado2){
        System.out.println("Área do retângulo: " +lado1*lado2);
    }

    public static void area(double baseMaior, double baseMenor, double altura){
        System.out.println("Área do trapézio: "+((baseMaior+baseMenor)*altura)/2);
    }

    public static void area(float diagonal1,float diagonal2){
        System.out.println("Área do losango: " +(diagonal1*diagonal2)/2);
    }
}

