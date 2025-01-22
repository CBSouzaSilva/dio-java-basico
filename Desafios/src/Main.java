import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        String barra = "/";
        int numero  = leitor.nextInt();
        String resultado = new String(new char[numero]).replace('\0', barra.charAt(0));
        System.out.println(resultado);

    }
}
/*
for (int i = 1; i<= 10; i++){
int tamanho = leitor.nextInt();

            if(tamanho==1){
        System.out.print("/");
            }else if(tamanho == 2){
        System.out.print("//");
            }else if(tamanho == 3){
        System.out.print("///");
            }else if(tamanho == 4){
        System.out.print("////");
            }else if(tamanho == 5){
        System.out.print("/////");
            }else if(tamanho == 6){
        System.out.print("//////");
            }else if(tamanho == 7){
        System.out.print("///////");
            }else if(tamanho == 8){
        System.out.print("////////");
            }else if(tamanho == 9){
        System.out.print("/////////");
            }else if(tamanho == 10){
        System.out.print("//////////");
            }
                    }
                    // TODO: Crie a condição necessária para que, de acordo com o tamanho, seja printado no console barras representando o download

                    }
                    }

 */