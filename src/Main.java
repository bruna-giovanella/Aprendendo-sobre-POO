import br.com.alura.cameo.modelos.Filme;

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
    }
}