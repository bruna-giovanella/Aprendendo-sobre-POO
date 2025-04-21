import br.com.alura.cameo.calculos.CalculadoraDeTempo;
import br.com.alura.cameo.calculos.FiltroRecomendacao;
import br.com.alura.cameo.modelos.Filme;
import br.com.alura.cameo.modelos.Serie;

public class Main {
    public static void main(String[] args) {
        // instanciando a classe
        Filme poderosoChefao = new Filme();
        poderosoChefao.setName("O poderoso chefão");
        poderosoChefao.setReleaseYear(1970);
        poderosoChefao.setMovieDuration(180);
        poderosoChefao.setPlanInclusion(true);

        //invocação do método
        poderosoChefao.showTechnicalInfo();
        poderosoChefao.rate(8);
        poderosoChefao.rate(8.5);
        poderosoChefao.rate(4.5);
        System.out.println(poderosoChefao.getNumberOfRatings());
        System.out.println(poderosoChefao.getAverage());

        Serie gilmoreGirls = new Serie();
        gilmoreGirls.setName("Gilmore Girls");
        gilmoreGirls.setReleaseYear(1990);
        gilmoreGirls.setTemporadas(8);
        gilmoreGirls.setEpisodiosPorTemporada(20);
        gilmoreGirls.setMinutosPorEpisodio(30);
        int duracao = gilmoreGirls.getMovieDuration();
        System.out.println("Duração para acabar a serie: " + duracao);

        Filme lalaland = new Filme();
        lalaland.setName("lalaland");
        lalaland.setReleaseYear(2017);
        lalaland.setMovieDuration(260);

        CalculadoraDeTempo calculadora = new CalculadoraDeTempo();
        calculadora.inclui(poderosoChefao);
        calculadora.inclui(lalaland);
        calculadora.inclui(gilmoreGirls);
        System.out.println(calculadora.getTempoTotal());


        FiltroRecomendacao filtro = new FiltroRecomendacao();
        filtro.filtra(poderosoChefao);
    }
}