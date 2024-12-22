package TiposVariaveis;
public class TiposVariaveis {
    public static void main(String[] args) throws Exception {
        double salarioMinimo = 2500;

        short numeroCurto = 1;
        int numeroNormal = numeroCurto;
        short numeroCurto2 = (short) numeroNormal; //cuidado nas conversões das classes de numeros


        //Quando o valor nunca podera mudar!!!
        //São usados as constantes nestes casos
        // utilizando a palavra final e sempre 
        //caixa alta 
        // exemplo quando o valor muda
        int numero = 5;
        numero = 10;
        System.out.println(numero);

        //Exemplo quando o número não altera
        final double VALOR_DE_PI = 3.14;

        //tipos primitivos
        //classe String que representa texto na aplicação
        //ex

        String meuNome = "Ivan MSS";

    }



}