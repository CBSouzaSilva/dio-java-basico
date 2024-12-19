import java.util.Scanner;
/*
Faça um Programa que leia 5 números
e informe o maior número
e a média desses números.
 */
public class Ex3_MaiorEMedia {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int numero;
        int maior = 0;
        int soma=0;

        int count = 0;
        do {
            System.out.println("Digite o "+ (count+1) +"º número: ");
            numero = scan.nextInt();

            if(numero > maior) maior = numero;

            soma += numero;
            count ++;
        } while(count < 5);

        System.out.println("O maior número é: "+ maior);
        System.out.println("A média entre os 5 valores é: " + (soma/5));
    }
}
