import java.util.*;

import static java.util.Collection.*;

public class ExemploList {
    public static void main(String[] args) {
        // Dada uma lista com 7 notas de um aluno[7, 8.5, 9.3, 5, 7, 0, 3.6], faça:

        //Formas de iniciar um List
        //List notas = new ArrayList(); //ante do java 5
        //List<Double> notas new ArrayList<>();
        //ArrayList<Double> notas = new ArrayList<>(Arrays.asList(7d, 8.5, 9.3, 5d, 7d, 0d, 3.6));

        //List<Double> notas = Arrays.asList(7d, 8.5, 9.3, 5d, 7d, 0d, 3.6);
        //notas.add(10d)não funciona para o exemplo de list acima
        //System.out.println(notas);

        //List<Double> notas = List.of(7d, 8.5, 9.3, 5d, 7d, 0d, 3.6)
        //notas.add(10d);não funciona para o exemplo de list acima
        //notas.remove(5d);não funciona para o exemplo de list acima
        //System.out.println(notas);


        System.out.println("Crie uma lista e adicione as sete notas: ");
        List<Double> notas = new ArrayList<Double>();
        notas.add(7d);
        notas.add(8.5);
        notas.add(9.3);
        notas.add(5d);
        notas.add(7d);
        notas.add(0d);
        notas.add(3.6);
        System.out.println(notas.toString());

        System.out.println("Exiba a posição da nota 5.0: " + notas.indexOf(5d));


        System.out.println("Adicione na lista a nota 8.0 na posição 4: ");
        notas.add(4,8.0);
        System.out.println(notas);

        System.out.println("Substitua a nota 5.0 pela nota 6.0: ");
        notas.set(notas.indexOf(5d),6d);
        System.out.println(notas);

        System.out.println("Confira se a nota 5.0 está na lista:  ");
        System.out.println(notas.contains(5d));

//        System.out.println("Exiba todas as notas na ordem em que foram informadas: ");
//        for (Double nota : notas) System.out.println(nota);

        System.out.println("Exiba a terceira nota adicionada: ");
        System.out.println(notas.get(2));

        System.out.println("Exiba a menor nota: " + Collections.min(notas));

        System.out.println("Exiba a maior nota: " + Collections.max(notas));

        System.out.println("Exiba a soma dos valores: ");
        Iterator<Double> iterator = notas.iterator();
        Double soma = 0d;
        while (iterator.hasNext()){
            Double next = iterator.next();
            soma += next;
        }
        System.out.println(soma);

         System.out.println("Exiba a média das notas: " + (soma/notas.size()));

        System.out.println("Remova a nota 0: ");
        notas.remove(0d);
        System.out.println(notas);

        System.out.println("Remova a nota da posição 0: ");
        notas.remove(0);
        System.out.println(notas);

        System.out.println("Remova as notas menores que 7 e exiba a lista: ");
        Iterator<Double> iterator1 = notas.iterator();
        while (iterator1.hasNext()){
            Double next = iterator1.next();
            if(next < 7) iterator1.remove();
        }
        //notas.removeIf(next -> next < 7); forma mais simples sugestão da IDE
        System.out.println(notas);

        System.out.println("Apague toda a Lista: ");
        notas.clear();
        System.out.println(notas);

        System.out.println("Confira se a lista está vazia: "+ notas.isEmpty()); //confere se a lista está vazia respondendo com boolean



        //Resolva esses exercícios utilizando os métodos da implementação LinkedList:
        System.out.println("Crie uma lista e adicione as sete notas: ");
        List<Double> nota = new ArrayList<Double>();
        nota.add(7d);
        nota.add(8.5);
        nota.add(9.3);
        nota.add(5d);
        nota.add(7d);
        nota.add(0d);
        nota.add(3.6);
        System.out.println(nota.toString());



        System.out.println("Crie uma lista chamada nota2"+
                "e coloque todos os elementos da list ArrrayList nessa nova lista: ");

        LinkedList<Double> nota2 = new LinkedList<>();
        nota2.addAll(nota);
        System.out.println(nota2);

        //System.out.println("Mostre a Primeira nota da nova lista sem removê-la: "+nota2.getFirst());
        //System.out.println("Mostre a primeira nota da nova lista removendo-a: " +nota2.);




    }


}
