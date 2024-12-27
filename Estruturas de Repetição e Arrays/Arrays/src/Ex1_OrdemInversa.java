/*
Crie um vetor de 6 números inteiros
e mostre-os na ordem inversa.
 */
public class Ex1_OrdemInversa {
    public static void main(String[] args) {
        //iniciando o vetor/array
        int[] vetor = {0,1,2,3,4,5};

        //System.out.println(vetor.length); //tamanho do vetor

        System.out.print("Vetor Natural: ");
        int count = 0;

        while(count < vetor.length){
            System.out.print(vetor[count] + " ");
            count++;
        }

        System.out.print("\nVetor Inverso: ");
        for (int i = (vetor.length-1);i >= 0;i--){
            System.out.print(vetor[i] + " ");
        }
    }
}
