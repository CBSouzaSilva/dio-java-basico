/*
Dadas as seguintes informações sobre meus livros favoritos e seus autores,
crie um dicionário e ordene este dicionário:
exibindo (Nome Autor - Nome Livro);
Autor = Hawking, Stephen - Livro = nome: Uma Breve História do tempo, páginas: 256
Autor = Duhigg, Charles - Livro = nome: O poder do Hábito, páginas: 408
Autor = Harari, Yuval Noah - Livro = 21 Lições Para o Século 21, páginas: 432
 */

import java.util.HashMap;
import java.util.Map;

public class ExemploOrdenacaoMap {
    public static void main(String[] args) {
        System.out.println("Ordem aleatória");
        Map<String, Livro> meusLivros = new HashMap<>(){{
            put("Hawking, Stephen", new Livro("Uma Breve História do tempo", 256));
            put("Duhigg, Charles", new Livro("O poder do Hábito, páginas", 408));
            put("Harari, Yuval Noah", new Livro("21 Lições Para o Século 21", 432));
        }};
        System.out.println(meusLivros.toString());


        //System.out.println("Ordem Inserção");
        //System.out.println("Ordem alfabética autores");
        //System.out.println("Ordem alfabética nomes dos livros");
        //System.out.println("Ordem número de páginas");
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
