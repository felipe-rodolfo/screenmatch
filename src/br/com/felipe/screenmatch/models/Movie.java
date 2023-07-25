package br.com.felipe.screenmatch.models;

import br.com.alura.screenmatch.calculos.Classifiable;

public class Movie extends Media implements Classifiable {
   private String director;

    public String getDirector() {
        return director;
    }

    @Override
    public int getClaassifiable() {
        return (int) getTotalRating() / 2;
    }
}
