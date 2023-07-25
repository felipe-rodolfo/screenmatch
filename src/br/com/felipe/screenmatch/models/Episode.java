package br.com.felipe.screenmatch.models;

import br.com.alura.screenmatch.calculos.Classifiable;

public class Episode implements Classifiable {
    private int num;
    private String name;
    private Serie serie;
    private int totalViews;

    public int getTotalViews() {
        return totalViews;
    }

    public void setTotalViews(int totalViews) {
        this.totalViews = totalViews;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Serie getSerie() {
        return serie;
    }

    public void setSerie(Serie serie) {
        this.serie = serie;
    }

    @Override
    public int getClaassifiable() {
        if(this.totalViews > 100)
            return 4;
        return 2;

    }
}
