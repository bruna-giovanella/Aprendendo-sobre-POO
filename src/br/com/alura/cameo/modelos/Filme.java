package br.com.alura.cameo.modelos;
// Extends = estende a classe Titulo --> HERDA
import br.com.alura.cameo.calculos.Classificavel;

public class Filme extends Titulo implements Classificavel {
    private String diretor;

    public Filme(String nome, int releaseYear) {
        super(nome, releaseYear);
    }

    public String getDiretor() {
        return diretor;
    }

    public void setDiretor(String diretor) {
        this.diretor = diretor;
    }


    @Override
    public int getClassificacao() {
        return (int) getAverage() / 2;
    }

    @Override
    public String toString() {
        return "Filme: " +getName() +" (" + getReleaseYear() +")";
    }
}
