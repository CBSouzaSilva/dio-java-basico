import java.sql.Time;
import java.util.Scanner;
/*
Desenvolva um gerador de tabuada,
capaz de gerar a tabuada de qualquer número inteiro entre 1 a 10.
O usuário deve informar de qual número ele deseja ver a tabuada.
A saída deve ser conforme exemplo abaixo:
Tabuada de 5:
5 x 1 = 5
5 x 2 = 10
...
5 x 10 = 50
 */

public class Ex5_Tabuada {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o valor que gostaria de ver a tabuada de 1 a 10: ");
        int tabuada  = scan.nextInt();

        System.out.println("Tabuada de "+tabuada+":");


        for (int i = 1; i <= 10 ; i++){
            System.out.println(tabuada + " x " + i + (" = " + tabuada*i));

        }
    }
}
