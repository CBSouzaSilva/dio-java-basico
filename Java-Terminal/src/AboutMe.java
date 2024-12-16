public class AboutMe {
    //Aula de argumentos
    public static void main(String[] args) {
       //os arguementos começam com indice 0
       String nome = args [0];
       String sobrenome = args [1];
       int idade = Integer.valueOf(args[2]);//vamos falar sobre wrappers
       double altura = Double.valueOf(args[3]);

       System.out.println("Ola, me chamo " + nome + " "+ sobrenome);
       System.out.println("Tenho "+ idade + "anos");
       System.out.println("Minhas altura é " +altura+ "cm.");
       
    }
}
