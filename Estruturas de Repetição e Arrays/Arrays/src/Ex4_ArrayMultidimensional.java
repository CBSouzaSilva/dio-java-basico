import java.util.Random;

/*
Gere e imprima uma matriz M 4x4 com valores aleatórios entre 0-9.
 */
public class Ex4_ArrayMultidimensional {
    public static void main(String[] args) {
        Random random = new Random();

        int[][] M = new int[4][4];
        /*
        H 0 1 2 3
        0 X X X X
        1 X X X X
        2 X X X X
        3 X X X X
         */
        for(int i =0; i <M.length; i++){
            for (int j = 0;j < M.length; j++){
                M[i][j] = random.nextInt(9);
            }
        }
        System.out.println("Matriz: ");
        for (int[] linha : M) {
            for (int coluna : linha) {
                System.out.print(coluna + "  ");
            }
            System.out.println("\n");
            
        }
    }
}
