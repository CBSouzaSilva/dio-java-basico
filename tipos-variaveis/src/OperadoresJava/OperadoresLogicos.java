package OperadoresJava;
public class OperadoresLogicos {
    public static void main(String[] args) {
        boolean condicao1 = true;

        boolean condicao2 = true;

        if (condicao1 && (7 > 4)) { // porta AND na eletronica !
            System.out.println("as duas condições são verdadeiras");
        }

        if (condicao1 && condicao2) { // porta AND na eletronica !
            System.out.println("as duas condições são verdadeiras");
        }

        if (condicao1 || condicao2) { //porta OR na eletronica
            System.out.println("uma das condições é verdadeira");
        }
        System.out.println("fim");

    }
}
