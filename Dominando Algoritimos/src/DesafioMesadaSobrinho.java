import java.util.Scanner;
public class DesafioMesadaSobrinho {
    public static void main(String[] args) {
    Scanner leitor = new Scanner(System.in);
    int entrada = leitor.nextInt();
    int mesada = 50;

    int totalMesada = entrada * mesada;
        System.out.println("Voce tera "+ totalMesada+ "reais");
    }
}
