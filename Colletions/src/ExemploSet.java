import java.util.*;

public class ExemploSet {
    public static void main(String[] args) {
        //Dada uma Lista com 7 notas de um aluno [7, 8.5, 9.3, 5, 7, 0, 3.6], faça:

        System.out.println("Crie um conjunto e adicione as notas:");
        Set<Double> notas = new HashSet<>(Arrays.asList(7d, 8.5, 9.3, 5d, 7d, 0d, 3.6));
        System.out.println(notas); // elementos repeditos so é exibido uma unica vez

        System.out.println("Exiba a posição da nota 5.0: não é possível mostrar posição dentro de um set ou hasset ");
        System.out.println("Adicione na lista a nota 8.0 na posição 4: não é possível adicionar valores em posições especificas utilizando o set");
        System.out.println("Subistitua a nota 5.0 pela nota 6.0: não é possível fazer utilizando set");

        System.out.println("Confira se a nota 5.0 está no conjunto: ");
        System.out.println(notas.contains(5.0));

        System.out.println("Exiba a terceira nota adicionada: não é possível por não ter o metodo get ");

        System.out.println(" Exiba a menor nota: ");
        System.out.println(Collections.min(notas));

        System.out.println(" Exiba a maior nota: ");
        System.out.println(Collections.max(notas));

        System.out.println("Exiba a soma dos valores: ");
        Iterator<Double> iterator = notas.iterator();
        Double soma = 0.0;
        while (iterator.hasNext()){
            Double next = iterator.next();
            soma += next;
        }
        System.out.println("A soma dos valores é: "+ soma);

        System.out.println("Exiba a média das notas: "+soma/notas.size())   ;

        System.out.println("Remova a nota 0: ");
        notas.remove(0d);
        System.out.println(notas);

        System.out.println("Remova a nota na posição 0: não é possível fazer remoção por índice ");

        System.out.println("Remova as notas menores que 7 e exiba a lista: ");
        Iterator<Double> iterator1 = notas.iterator();
        while (iterator1.hasNext()){
            Double next = iterator1.next();
            if (next < 7) iterator1.remove();
        }
        System.out.println(notas);

        System.out.println("Exiba todas as notas na ordem em que foram informadas: ");
        Set<Double> notas2 = new LinkedHashSet<>();// também funciona da outra forma
        notas2.add(7d);
        notas2.add(8.5);
        notas2.add(9.3);
        notas2.add(5d);
        notas2.add(7d);
        notas2.add(0d);
        notas2.add(3.6);
        System.out.println(notas2);

        System.out.println("Exiba todas as notas na ordem crescente: ");
        Set<Double> notas3 = new TreeSet<>(notas2); // funciona pq a classe tem a função de comparaçaõ
        System.out.println(notas3);

        System.out.println("Apague todo o pprimeiro conjunto");
        notas.clear();

        System.out.println("Confira se o primeiro conjunto está vazio: "+notas.isEmpty());
        System.out.println("Confira se o conjunto 2 está vazio: "+notas2.isEmpty());
        System.out.println("Confira se o conjunto 3 está vazio: "+notas3.isEmpty());



    }
}
