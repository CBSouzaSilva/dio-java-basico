import java.util.Scanner;

/*
Faça um programa que peça uma nota, entre 0 e 10.
Mostre uma mensagem caso o calor seja inválido
e continue pedindo
até que o usuário informe um valor válido.
 */
public class Ex2_Nota {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int nota;

        System.out.println("Digite uma nota entre 0 e 10: ");
        nota = scan.nextInt();

        while (nota < 0 || nota >10){
            System.out.println("Nota Inválida! Digite novamente: ");
            nota = scan.nextInt();

        }

        System.out.println("Correto!");
    }
}
