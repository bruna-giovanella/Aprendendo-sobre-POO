package br.com.alura.cameo.main;

import br.com.alura.cameo.modelos.Filme;
import br.com.alura.cameo.modelos.Serie;
import br.com.alura.cameo.modelos.Titulo;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;

public class MainComListas {
    public static void main(String[] args) {
        Filme filme1 = new Filme("O poderoso chefão", 1972);
        filme1.rate(9);
        Filme filme2 = new Filme("Lalaland", 2016);
        filme2.rate(10);
        Filme filme3 = new Filme("Star wars: A vingança dos Siths", 2005);
        filme3.rate(10);
        Serie serie1 = new Serie("Gilmore Girls", 2000);

        ArrayList<Titulo> watchlist = new ArrayList<>();
        watchlist.add(filme1);
        watchlist.add(filme2);
        watchlist.add(filme3);
        watchlist.add(serie1);

        // foreach - para cada item dentro da lista (Titulo item : watchlist) fazer tal coisa
        for (Titulo item : watchlist){
            System.out.println(item);
            if (item instanceof Filme filme) {
                System.out.println("Classificação: " + filme.getClassificacao());
            }
        }


        // Ordenando listas
        ArrayList<String> buscaPorArtista = new ArrayList<>();
        buscaPorArtista.add("Adam Sandler");
        buscaPorArtista.add("Zendaya");
        buscaPorArtista.add("Tom Hanks");
        buscaPorArtista.add("Jennifer Laurence");

        Collections.sort(buscaPorArtista); // ordenou por ordem alfabética
        System.out.println(buscaPorArtista);

        // Porém, não é tão simples a ordenação de objetos, tendo em vista que possuem n parâmetros
        Collections.sort(watchlist); // precisa fazer um método compareTo dentro de titulo;
        System.out.println(watchlist);
        watchlist.sort(Comparator.comparing(Titulo::getReleaseYear)); // ou faz desse jeito
    }
}
