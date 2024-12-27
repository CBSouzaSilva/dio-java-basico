import java.util.Scanner;
/*
Faça um Programa de que leia um vetor de 6 caracteres,
e diga quantas consoantes foram lidas.
Imprimia as consoantes.
 */
public class Ex2_Consoantes {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        //Criando um array/vetor de 6 lugares na memoria.
        String[] consoantes = new String[6];
        int quantidadeConsoantes = 0;

        int count = 0;
        do {
            System.out.println("Digite uma letra: ");
            String letra = scan.next();

            if( !(letra.equalsIgnoreCase("a")|
                    letra.equalsIgnoreCase("e") |
                    letra.equalsIgnoreCase("i") |
                    letra.equalsIgnoreCase("o") |
                    letra.equalsIgnoreCase("u")) ) {
                consoantes[count] = letra;
                quantidadeConsoantes++;
            }

            count++;


        } while(count < consoantes.length);

        System.out.println("\nQuantidade de Consoantes: "+ quantidadeConsoantes);
        System.out.println("Consoantes: ");


        for (String consoante : consoantes ){//foreach : for (  :  ) {} construção / atalho iter + enter
            if (consoante != null) //condição para a impressão na tela do que é diferente de null
                System.out.print(consoante + " ");
        }
    }
}


