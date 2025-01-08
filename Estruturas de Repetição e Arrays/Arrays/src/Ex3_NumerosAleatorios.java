import java.util.Random;

/*
    Faça um Programa que leia 20 números inteiros aleatórios (entre 0 e 100) armazene-os em um vetor.
    Ao Final mostre os números e seus sucessores.
     */
public class Ex3_NumerosAleatorios {
    public static void main(String[] args) {
        //função que gera numeros aleatórios, já vem na biblioteca java.
        Random random = new Random();

        //criando vetor para armazenar os números aleatórios
        int[] numerosAleatorios = new int[20];


        for(int i = 0; i<numerosAleatorios.length; i++) {
           int numero = random.nextInt(100);
           numerosAleatorios[i] = numero;
        }

        System.out.print("Números Aleatórios: ");
        for (int numero : numerosAleatorios) {
            System.out.print(numero+ " ");

        }
        System.out.print("\nAntecessores dos Números Aleatórios: ");
        for (int numero : numerosAleatorios) {
            System.out.print(numero-1 + " ");

        }
        System.out.print("\nSucessores dos Números Aleatórios: ");
        for (int numero : numerosAleatorios) {
            System.out.print(numero+1 + " ");

        }
    }
}
