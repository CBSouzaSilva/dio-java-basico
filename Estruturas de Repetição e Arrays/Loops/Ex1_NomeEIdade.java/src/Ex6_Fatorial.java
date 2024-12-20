import java.util.Scanner;
/*
Faça um programa que calcule o fatorial de um número inteiro fornecido pelo usuário.
EX.: 5! = 120
 */
public class Ex6_Fatorial {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Qual número deseja saber o fatorial: ");
        int numero = scan.nextInt();
        int fatorial = 1;
        for(int i = 1;i <= numero;i++ ){
            fatorial *= i;
        }

        System.out.println(numero + "!= "+fatorial);
    }
}
