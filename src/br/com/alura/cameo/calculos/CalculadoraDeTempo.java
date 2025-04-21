package br.com.alura.cameo.calculos;

import br.com.alura.cameo.modelos.Titulo;

public class CalculadoraDeTempo {
    private int tempoTotal;

    public int getTempoTotal() {
        return this.tempoTotal;
    }

//    public void inclui(Filme f) {
//        this.tempoTotal += f.getMovieDuration();
//    }
//
//    public void inclui(Serie s) {
//        this.tempoTotal += s.getMovieDuration();
//    }

    /*
    * Há formas de contornar situações como a anterior (em comentário).
    * Deixar um metodo para cada tipo que iremos calcular cria uma dependência entre metodos - alto acoplamento.
    * */

    public void inclui(Titulo titulo) {
        this.tempoTotal += titulo.getMovieDuration();
    }

}
