package br.com.alura.cameo.modelos;

/*
* HERANÇA
*
* Imagine que temos duas classes: Filme e Serie. Ambas as classes possuem mesmos atributos: nome, data de lançamento,
* avaliações. Do mesmo modo, ambas possuem mesmos atributos: média de avaliações, ficha técnica, getNome, setNome.
* Baseado nisso, podemos criar uma classe Titulo contendo os atributos e métodos que serão gerais a ambos, e a partir
* daí, HERDAR a cada subClasse as informações contidas na classe pai.
* Atributos e métodos únicos a clada classe poderão ser especificadas em suas devidas classes, após a herança.
* */

import com.google.gson.annotations.SerializedName;
import org.jetbrains.annotations.NotNull;

public class Titulo implements Comparable<Titulo> {

    /*
    Modificadores de acesso:

    * Por padrão, a definição dos atributos é catalogada como default, mesmo sem, de fato, escrevermos isso.
    * Default dá permissão que outras classes acessem o objeto, desde que, estejam no mesmo pacote.
    * A partir do momento que separamos a classe em diferentes pacotes, precisamos passar a atribuir os modificadores
    * aos atributos (com uso, por exemplo, de public, private e etc).

    * */

    //Atributos do objeto -- deixado como comentário pq normalmente não deixamos tudo público
//    public String name;
//    public int releaseYear;
//    public int movieDuration;
//    boolean planInclusion;
//    // deixar os atributos privados, para serem valores que nao possam ser mudados no main
//    private double totalRatingScore;
//    private int numberOfRatings;
    @SerializedName("Title")
    private String name;
    @SerializedName("Year")
    private int releaseYear;
    private int movieDuration;
    private boolean planInclusion;
    // deixar os atributos privados, para serem valores que nao possam ser mudados no main
    private double totalRatingScore;
    private int numberOfRatings;

    // Construtor


    public Titulo(String name, int releaseYear) {
        this.name = name;
        this.releaseYear = releaseYear;
    }

    public Titulo(TituloOmdb meuTituloOmdb) {
        this.name = meuTituloOmdb.title();
        this.releaseYear = Integer.valueOf(meuTituloOmdb.year());
        this.movieDuration = Integer.valueOf(meuTituloOmdb.runtime().substring(0,2));
    }

    //declaração de method
    public void showTechnicalInfo(){
        System.out.println("Nome do br.com.alura.cameo.modelos.Filme: " + name);
        System.out.println("Ano de lançamento: " + releaseYear);
        System.out.println("Duração em minutos: " + movieDuration);
    }

    public void rate(double nota){
        totalRatingScore += nota;
        numberOfRatings++;
    }


    // ---------- GETTERS ---------- busca valor

    /*
    Method access

    * Os modificadores de acesso/visibilidade privados (no atributo totalRatingScore) tem a intenção de manter um valor
    * trancado.
    * Acessível a modificações, apenas, dentro da classe onde ele é criado. A intenção, por exemplo, é que o valor não
    * possa ser "sabotado" por pessoas mal intencionadas.
    * */
    public int getNumberOfRatings() {
        return numberOfRatings;
    }
    // retornar media das avaliações
    public double getAverage(){
        return totalRatingScore / numberOfRatings;
    }
    public String getName() {
        return name;
    }
    public int getReleaseYear() {
        return releaseYear;
    }
    public int getMovieDuration() {
        return movieDuration;
    }
    public boolean isPlanInclusion() {
        return planInclusion;
    }
    public double getTotalRatingScore() {
        return totalRatingScore;
    }


    // ---------- SETTERS ---------- inclui valor


    public void setName(String name) {
        this.name = name;
        // this.name chama o atributo de dentro dessa classe, o qual ser settado (mudado)
    }
    public void setReleaseYear(int releaseYear) {
        this.releaseYear = releaseYear;
    }
    public void setMovieDuration(int movieDuration) {
        this.movieDuration = movieDuration;
    }
    public void setPlanInclusion(boolean planInclusion) {
        this.planInclusion = planInclusion;
    }

    @Override
    public int compareTo(Titulo nomeTitulo) {
        return this.getName().compareTo(nomeTitulo.getName());
    }

    @Override
    public String toString() {
        return "releaseYear=" + releaseYear +
                ", name='" + name + "', " + movieDuration;
    }
}
