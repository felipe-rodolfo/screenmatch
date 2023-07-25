package br.com.alura.screenmatch.calculos;

import br.com.felipe.screenmatch.models.Media;
import br.com.felipe.screenmatch.models.Movie;
import br.com.felipe.screenmatch.models.Serie;

public class TimeCalculator {
    private int totalTime;

    public int getTotalTime() {
        return this.totalTime;
    }

    public void includes(Media media){
        System.out.println("Adicionando duração em minutos de " + media);
        this.totalTime += media.getTotalMinutes();
    }

}
