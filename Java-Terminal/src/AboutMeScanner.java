import java.util.Locale;
import java.util.Scanner;

public class AboutMeScanner {
    public static void main(String[] args) {
       //criando o objeto scanner
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
     
        System.out.println("Digite seu primeiro nome");
        String nome = scanner.next();

        System.out.println("Digite seu sobrenome:");
        String sobrenome = scanner.next();

        System.out.println("Qual a sua idade:");
        int idade = scanner.nextInt();

        System.out.println("Qual a sua altura:");
        double altura = scanner.nextDouble();


        // imprime os dados informados pelo usuário.
        System.out.println("Ola, me chamo " + nome + " "+ sobrenome);
        System.out.println("Tenho "+ idade + " anos");
        System.out.println("Minhas altura é " +altura+ " cm.");
       
    }
}
