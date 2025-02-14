/*
Dadas as seguintes informações sobre meus livros favoritos e seus autores,
crie um dicionário e ordene este dicionário:
exibindo (Nome Autor - Nome Livro);
Autor = Hawking, Stephen - Livro = nome: Uma Breve História do tempo, páginas: 256
Autor = Duhigg, Charles - Livro = nome: O poder do Hábito, páginas: 408
Autor = Harari, Yuval Noah - Livro = 21 Lições Para o Século 21, páginas: 432
 */

import java.util.*;

public class ExemploOrdenacaoMap {
    public static void main(String[] args) {
        System.out.println("Ordem aleatória");
        Map<String, Livro> meusLivros = new HashMap<>(){{
            put("Hawking, Stephen", new Livro("Uma Breve História do tempo", 256));
            put("Duhigg, Charles", new Livro("O poder do Hábito, páginas", 408));
            put("Harari, Yuval Noah", new Livro("21 Lições Para o Século 21", 432));
        }};
        for(Map.Entry<String, Livro> livro :meusLivros.entrySet())
            System.out.println(livro.getKey() + " - " + livro.getValue().getNome());

        System.out.println("Ordem Inserção");
        Map<String, Livro> meuslivros1 = new LinkedHashMap<>(){{
            put("Hawking, Stephen", new Livro("Uma Breve História do tempo", 256));
            put("Duhigg, Charles", new Livro("O poder do Hábito, páginas", 408));
            put("Harari, Yuval Noah", new Livro("21 Lições Para o Século 21", 432));
        }};
        for(Map.Entry<String, Livro> livro : meuslivros1.entrySet())
            System.out.println(livro.getKey() + " - "+ livro.getValue().getNome());

        System.out.println("Ordem alfabética autores");
        Map<String, Livro> meusLivros2 = new TreeMap<>(meuslivros1);
        for (Map.Entry<String, Livro> livro : meusLivros2.entrySet())
            System.out.println(livro.getKey() + " - "+ livro.getValue().getNome());

        System.out.println("Ordem alfabética nomes dos livros");
        Set<Map.Entry<String, Livro>> meusLivros3 = new TreeSet<>(new ComparatorNome());
        meusLivros3.addAll(meusLivros.entrySet());
        for (Map.Entry<String, Livro> livro : meusLivros3)
            System.out.println(livro.getKey() + " - "+ livro.getValue().getNome());

        System.out.println("Ordem número de páginas");
        Map<String, Livro> meusLivros4 = new HashMap<>(meusLivros);
        List<Map.Entry<String, Livro>> lista = new ArrayList<>(meusLivros4.entrySet());
        Collections.sort(lista,((l1, l2) -> Integer.compare(l1.getValue().getPaginas(), l2.getValue().getPaginas())));

        for (Map.Entry<String, Livro> livro : lista) {
            System.out.println(livro.getKey() + " - " + livro.getValue().getNome() + ": " + livro.getValue().getPaginas()+ " páginas");
        }


    }

}


class Livro{
    private  String nome;
    private Integer paginas;

    public Livro(String nome, Integer paginas) {
        this.nome = nome;
        this.paginas = paginas;
    }

    public String getNome() {
        return nome;
    }

    public Integer getPaginas() {
        return paginas;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;

        Livro livro = (Livro) o;
        return nome.equals(livro.nome) && paginas.equals(livro.paginas);
    }

    @Override
    public int hashCode() {
        int result = nome.hashCode();
        result = 31 * result + paginas.hashCode();
        return result;
    }

    @Override
    public String toString() {
        return "Livro{" +
                "nome='" + nome + '\'' +
                ", paginas=" + paginas +
                '}';
    }
}
class ComparatorNome implements Comparator<Map.Entry<String, Livro>>{

    @Override
    public int compare(Map.Entry<String, Livro> l1, Map.Entry<String, Livro> l2) {
        return l1.getValue().getNome().compareToIgnoreCase(l2.getValue().getNome());
    }
}
