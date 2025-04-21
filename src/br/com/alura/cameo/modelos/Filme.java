package br.com.alura.cameo.modelos;

// Extends = estende a classe Titulo --> HERDA

public class Filme extends Titulo {
    private String diretor;

    public String getDiretor() {
        return diretor;
    }

    public void setDiretor(String diretor) {
        this.diretor = diretor;
    }
}
