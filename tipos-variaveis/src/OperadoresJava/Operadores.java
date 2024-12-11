package OperadoresJava;
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

        //System.out.println(numero); 

        //numero = - numero;// deixa o numero positivo desta forma ou 
        numero = numero *-1; // desta forma
        //System.out.println(numero);
        
        //INCRIMENTO x repetições
        
        int numeroI = 5;

        //numeroI++; // isso é igual numeroI = numeroI + 1;
        //exitem 2 possibilidade
        
        System.out.println(++ numeroI); //Neste caso o numeroI é acrecido de 1 e depois é impresso na tela

        //System.out.println(numeroI ++); // neste caso o numeroI impresso na tela e so depois é acrecido de 1, sendo necessário um segundo print para mostra o valor atual

        //System.out.println(numeroI);

        // todas essas regras são identicas para decrementar 

        boolean variavel =true;
        //System.out.println(!variavel); // porem so modifica em memoria

        variavel = !variavel; //agora muda o valor da variavel 
        System.out.println(variavel);

        
    }
    
}
