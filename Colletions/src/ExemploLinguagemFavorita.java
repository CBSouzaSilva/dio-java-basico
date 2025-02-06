import java.util.*;

class LinguagemFavorita {
    String nome;
    int anoDeCriacao;
    String ide;

    public LinguagemFavorita(String nome, int anoDeCriacao, String ide) {
        this.nome = nome;
        this.anoDeCriacao = anoDeCriacao;
        this.ide = ide;
    }

    @Override
    public String toString() {
        return "LinguagemFavorita{" +
                "nome='" + nome + '\'' +
                ", anoDeCriacao=" + anoDeCriacao +
                ", ide='" + ide + '\'' +
                '}';
    }
}

public class ExemploLinguagemFavorita {
    public static void main(String[] args) {
        // Cria conjunto de linguagens
        Set<LinguagemFavorita> linguagens = new LinkedHashSet<>();
        linguagens.add(new LinguagemFavorita("Java", 1995, "Eclipse"));
        linguagens.add(new LinguagemFavorita("Python", 1991, "PyCharm"));
        linguagens.add(new LinguagemFavorita("JavaScript", 1995, "Visual Studio Code"));

        // Ordena por ordem de inserção
        System.out.println("Ordem de Inserção:");
        linguagens.forEach(System.out::println);

        // Ordena por ordem natural (nome)
        Set<LinguagemFavorita> linguagensOrdenadasNome = new TreeSet<>(Comparator.comparing(l -> l.nome));
        linguagensOrdenadasNome.addAll(linguagens);
        System.out.println("\nOrdem Natural (nome):");
        linguagensOrdenadasNome.forEach(System.out::println);

        // Ordena por IDE
        Set<LinguagemFavorita> linguagensOrdenadasIde = new TreeSet<>(Comparator.comparing(l -> l.ide));
        linguagensOrdenadasIde.addAll(linguagens);
        System.out.println("\nIDE:");
        linguagensOrdenadasIde.forEach(System.out::println);

        // Ordena por ano de criação
        Set<LinguagemFavorita> linguagensOrdenadasAno = new TreeSet<>(Comparator.comparingInt(l -> l.anoDeCriacao));
        linguagensOrdenadasAno.addAll(linguagens);
        System.out.println("\nAno de criação:");
        linguagensOrdenadasAno.forEach(System.out::println);

        // Ordena por nome, ano de criação e IDE
        Set<LinguagemFavorita> linguagensOrdenadasCompleta = new TreeSet<>(
                Comparator.comparing((LinguagemFavorita l) -> l.nome)
                        .thenComparingInt((LinguagemFavorita l) -> l.anoDeCriacao)
                        .thenComparing((LinguagemFavorita l) -> l.ide)
        );

        linguagensOrdenadasCompleta.addAll(linguagens);
        System.out.println("\nNome, ano de criação e IDE:");
        linguagensOrdenadasCompleta.forEach(System.out::println);



    }
}