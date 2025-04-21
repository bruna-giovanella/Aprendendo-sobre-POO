import br.com.alura.cameo.modelos.Filme;
import br.com.alura.cameo.modelos.Serie;

public class Main {
    public static void main(String[] args) {
        // instanciando a classe
        Filme meuFilme = new Filme();
        meuFilme.setName("O poderoso chefão");
        meuFilme.setReleaseYear(1970);
        meuFilme.setMovieDuration(180);
        meuFilme.setPlanInclusion(true);

        //invocação do método
        meuFilme.showTechnicalInfo();
        meuFilme.rate(8);
        meuFilme.rate(8.5);
        meuFilme.rate(4.5);
        System.out.println(meuFilme.getNumberOfRatings());
        System.out.println(meuFilme.getAverage());

        Serie gilmoreGirls = new Serie();
        gilmoreGirls.setName("Gilmore Girls");
        gilmoreGirls.setReleaseYear(1990);
        gilmoreGirls.setTemporadas(8);
        gilmoreGirls.setEpisodiosPorTemporada(20);
        gilmoreGirls.setMinutosPorEpisodio(30);
        int duracao = gilmoreGirls.getMovieDuration();
        System.out.println("Duração para acabar a serie: " + duracao);
    }
}