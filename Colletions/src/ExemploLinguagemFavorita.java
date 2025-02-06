import java.util.*;
import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class ExemploLinguagemFavorita {
    public ExemploLinguagemFavorita() {
    }
/*
Crie uma classe LinguagemFavorita que possua os atributos
nome, anoDeCriacao e ide. Em seguida, crie um conjunto com
3 linguagens e faça um programa que ordene esse conjunto
por:

Ordem de Inserção

Ordem Natural (nome)

IDE

Ano de criação e nome

Nome, ano de criacao e IDE

Ao final, exiba as linguagens no console, um abaixo da outra.
 */
    public static void main(String[] args) {
    Set<LinguagemFavorita> minhasLinguagensFavoritas = new HashSet<>();
    minhasLinguagensFavoritas.add(new LinguagemFavorita("Python", 1991, "Pycharm"));
    minhasLinguagensFavoritas.add(new LinguagemFavorita("JavaScript", 1995, "IntelliJ"));
    minhasLinguagensFavoritas.add(new LinguagemFavorita("Java", 1991, "Visual Studio Code"));
    System.out.println("------\tOrdem de Inserçao\t------");


        for(LinguagemFavorita linguagem : new LinkedHashSet(Arrays.asList(new LinguagemFavorita("Python", 1991, "Pycharm"), new LinguagemFavorita("JavaScript", 1995, "IntelliJ"), new LinguagemFavorita("Java", 1991, "Visual Studio Code")))) {
            System.out.println(linguagem);
        }
    }
}
