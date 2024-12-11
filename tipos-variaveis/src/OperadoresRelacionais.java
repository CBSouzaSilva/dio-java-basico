public class OperadoresRelacionais {
    public static void main(String[] args) {
        String nomeUm = "Ivan";
        String nomeDois = new String( "Ivan"); //usando o new cria um novo objeto que para o java ele é salvo na memoria de uma forma um pouco diferente não podendo ser comparado diretamento

        System.out.println(nomeUm.equals(nomeDois)); //equals compara o conteudo
        //para objetos utilizar equals//

        int numero1 = 1;
        int numero2 = 2;

        boolean simNao = numero1 == numero2;

        if (numero1 == numero2) {//true
            System.out.println("a nossa condição é verdadeira");           
        }else{//false
            System.out.println("a nossa condição é falsa");
        }

        System.out.println("numeroUm é igual a numeroDois? "+ simNao);

        simNao = numero1 != numero2;
        System.out.println("numeroUm é diferente do numeroDois? "+ simNao);

        simNao = numero1 > numero2;
        System.out.println("numeroUm é maior que  numeroDois? "+ simNao);

        simNao = numero1 < numero2;
        System.out.println("numeroUm é menor do que o numeroDois? "+ simNao);
    }
}
