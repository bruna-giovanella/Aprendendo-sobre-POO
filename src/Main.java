import br.com.alura.cameo.calculos.CalculadoraDeTempo;
import br.com.alura.cameo.calculos.FiltroRecomendacao;
import br.com.alura.cameo.modelos.Filme;
import br.com.alura.cameo.modelos.Serie;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // instanciando a classe
        Filme poderosoChefao = new Filme("O poderoso chefão", 1970);
//        poderosoChefao.setName("O poderoso chefão");
//        poderosoChefao.setReleaseYear(1970);
        poderosoChefao.setMovieDuration(180);
        poderosoChefao.setPlanInclusion(true);

        //invocação do método
        poderosoChefao.showTechnicalInfo();
        poderosoChefao.rate(8);
        poderosoChefao.rate(8.5);
        poderosoChefao.rate(4.5);
        System.out.println(poderosoChefao.getNumberOfRatings());
        System.out.println(poderosoChefao.getAverage());

        Serie gilmoreGirls = new Serie("Gilmore Girls", 1990);
//        gilmoreGirls.setName();
//        gilmoreGirls.setReleaseYear(1990);
        gilmoreGirls.setTemporadas(8);
        gilmoreGirls.setEpisodiosPorTemporada(20);
        gilmoreGirls.setMinutosPorEpisodio(30);
        int duracao = gilmoreGirls.getMovieDuration();
        System.out.println("Duração para acabar a serie: " + duracao);

        Filme lalaland = new Filme("lalaland", 2017);
//        lalaland.setName("lalaland");
//        lalaland.setReleaseYear(2017);
        lalaland.setMovieDuration(260);

        CalculadoraDeTempo calculadora = new CalculadoraDeTempo();
        calculadora.inclui(poderosoChefao);
        calculadora.inclui(lalaland);
        calculadora.inclui(gilmoreGirls);
        System.out.println(calculadora.getTempoTotal());

        Filme starWars = new Filme("Star Wars", 2009);
//        starWars.setName("Star Wars");
//        starWars.setReleaseYear(2009);
        starWars.setMovieDuration(300);
        starWars.rate(10);

        FiltroRecomendacao filtro = new FiltroRecomendacao();
        filtro.filtra(poderosoChefao);


        // Inicializa e indica o < tipo que será colocado dentro da lista >
        ArrayList<Filme> listaDeFilmes = new ArrayList<>();
        // adicionando à lista
        listaDeFilmes.add(starWars);
        listaDeFilmes.add(lalaland);
        listaDeFilmes.add(poderosoChefao);
        // verificar o tamanho da lista
        System.out.println("Tamanho da lista de filmes: " + listaDeFilmes.size());
        // pegar um item da lista -> nesse caso, pegamos um objeto e apartir do objeto pegamos algo
        System.out.println("Primeiro filme: " + listaDeFilmes.get(0).getName());
        // imprimir a lista
        // originalmente toString retorna a localização do espaço na memória, por isso foi sobescrito
        System.out.println("toString do " + listaDeFilmes.get(0).toString());
        System.out.println(listaDeFilmes.toString());


        // Construtor - podendo passar um atributo nele já
        Filme filme = new Filme("O império contra ataca", 2005);

    }
}