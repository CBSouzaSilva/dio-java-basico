import java.awt.*;
import java.util.*;

import static javax.swing.UIManager.put;

/*
Dada a população estimada de alguns estados do NE brasileiro, faça:
Estado = PE - População = 9.616.621
Estado = AL - População = 3.351.543
Estado = CE - População = 9.187.103
Estado = RN - População = 3.534.265

-Crie um dicionário e relacione os estados e suas populações;
-Substitua a população do estado do RN por 3.534.165;
-Confira se o estado PB está no dicionário, caso não adicione: PB - 4.039.277;
-Exiba a população PE;
-Exercícios Propostos
-Exiba todos os estados e suas populações na ordem que foi  informado;
-Exiba os estados e suas populações em ordem alfabética;
-Exiba o estado com o menor população e sua quantidade;
-Exiba o estado com a maior população e sua quantidade;
-Exiba a soma da população desses estados;
-Exiba a média da população deste dicionário de estados;
-Remova os estados com a população menor que 4.000.000;
-Apague o dicionário de estados;
-Confira se o dicionário está vazio.
 */
public class ExercicioMap01 {
    public static void main(String[] args) {
        System.out.println("Crie um dicionário que relacione os estados e suas respectivas populações: ");
        Map<String, Integer> populacaoEstadosNE = new HashMap<>() {{
            put("PE", 9616621);
            put("AL", 3351543);
            put("CE", 9187103);
            put("RN", 3534265);
        }};
        System.out.println(populacaoEstadosNE);

        System.out.println("Substitua a população do estao RN por: 3.534.165");
        populacaoEstadosNE.put("RN", 3534165);
        System.out.println(populacaoEstadosNE);

        System.out.println("Confira se o estado da Paraíba (PB) está no dicionário, caso não, adicionar: PB - 4.039.277");
        if (!populacaoEstadosNE.containsKey("PB")) {
            System.out.println(populacaoEstadosNE.containsKey("PB"));
            populacaoEstadosNE.put("PB", 4039277);
            System.out.println("Paraíba foi adicionado com sucesso!");
        }
        System.out.println(populacaoEstadosNE);

        System.out.println("Exiba a população do estado de PE: " + populacaoEstadosNE.get("PE"));

        System.out.println("Exiba todas os estados e suas populações na ordem em que foram informado: ");
        Map<String, Integer> populacaoEstadosNE2 = new LinkedHashMap<>() {{
            put("PE", 9616621);
            put("AL", 3351543);
            put("CE", 9187103);
            put("RN", 3534265);
            put("PB", 4039277);
        }};
        for (Map.Entry<String, Integer> estados : populacaoEstadosNE2.entrySet()) {
            System.out.println(estados.getKey() + " - " + estados.getValue());
        }

        System.out.println("Exiba todos os estados e suas populações na ordem alfabética: ");
        Map<String, Integer> populacaoEstadosNE3 = new TreeMap<>(populacaoEstadosNE);
        for (Map.Entry<String,Integer> estados : populacaoEstadosNE3.entrySet()){
            System.out.println(estados.getKey()+ " - " +estados.getValue());
        }
        Collection<Integer> populacao =populacaoEstadosNE.values();
        String esatadoMaiorPopulacao = "";
        String esatadoMenorPopulacao = "";
        for (Map.Entry<String, Integer> entry : populacaoEstadosNE.entrySet()) {
            if (entry.getValue().equals(Collections.max(populacao))) esatadoMaiorPopulacao = entry.getKey();
            if (entry.getValue().equals(Collections.min(populacao))) esatadoMenorPopulacao = entry.getKey();
        }
        System.out.println("Exiba o estado com a menor população e seu valor: ");
        System.out.println(esatadoMenorPopulacao+ " - " +Collections.min(populacao));

        System.out.println("Exiba o estado com a maior população e seu valor");
        System.out.println(esatadoMaiorPopulacao+ " - " +Collections.max(populacao));

        int soma = 0;
        Iterator<Integer> iterator = populacaoEstadosNE.values().iterator();
        while (iterator.hasNext()){
            soma += iterator.next();
        }
        System.out.println("Exiba a sola da população de todos os estados: "+ soma);

        System.out.println("Exiba a média da população deste dicionário de estados: "+ (soma/populacaoEstadosNE.size()));


        System.out.println(populacaoEstadosNE);
        System.out.println("Remova os estados com a população menor que 4.000.000: ");
        Iterator<Integer> iterator1 = populacaoEstadosNE.values().iterator();
        while (iterator1.hasNext()){
            if (iterator1.next() <= 4000000) iterator1.remove();
        }
        System.out.println(populacaoEstadosNE);

        System.out.println("Apague o dicionario de estados com suas respectivas populações estimadas: ");
        populacaoEstadosNE.clear();
        System.out.println(populacaoEstadosNE);

        System.out.println("Confira se a lista está vazia: "+ populacaoEstadosNE.isEmpty());


    }
}

