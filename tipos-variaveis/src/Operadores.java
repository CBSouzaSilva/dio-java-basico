public class Operadores {
    public static void main(String[] args) {
        String nomeCompleto = "LINGUAGEM" + " " + "JAVA";
        //System.out.println(nomeCompleto);

        //String Concatenacao

        String concatenacao = "?";
        concatenacao = 1+1+1+"1";
        //System.out.println(concatenacao);

        concatenacao = 1+"1"+1+1+1;
        //System.out.println(concatenacao);

        concatenacao = 1+"1"+1+"1";
        //System.out.println(concatenacao);

        concatenacao = "1"+1+1+1;
        //System.out.println(concatenacao);

        concatenacao = "1"+(1+1+1);
        //System.out.println(concatenacao);

        //Operadores Unários
        int numero = 5;
        
        numero = -numero; // deixa o número negativo

        System.out.println(numero); 

        //numero = - numero;// deixa o numero positivo desta forma ou 
        numero = numero *-1; // desta forma
        System.out.println(numero);
    }
    
}
