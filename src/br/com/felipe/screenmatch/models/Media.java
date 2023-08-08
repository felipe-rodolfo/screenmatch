package br.com.felipe.screenmatch.models;

import br.com.felipe.screenmatch.exception.ConversionYearErrorException;
import com.google.gson.annotations.SerializedName;

public class Media implements Comparable<Media>{
    private String name;
    private int releaseYear;
    private boolean includedInThePlan;
    private double rating;
    private int totalRating;
    int totalMinutes;

    public Media(String name, int releaseYear) {
        this.name = name;
        this.releaseYear = releaseYear;
    }

    public Media(MediaOmdb myMediaomdb) {
        this.name = myMediaomdb.title();

        if(myMediaomdb.year().length() > 4){
            throw new ConversionYearErrorException("so many caracteres");
        }
        this.releaseYear = Integer.valueOf(myMediaomdb.year());
        this.totalMinutes = Integer.valueOf(myMediaomdb.runtime().substring(0, 3));
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setReleaseYear(int releaseYear) {
        this.releaseYear = releaseYear;
    }

    public void setIncludedInThePlan(boolean includedInThePlan) {
        this.includedInThePlan = includedInThePlan;
    }

    public void setTotalMinutes(int totalMinutes) {
        this.totalMinutes = totalMinutes;
    }

    public int getTotalMinutes() {
        return this.totalMinutes;
    }

    public int getTotalRating(){
        return this.totalRating;
    }

    public void showCredits(){
        System.out.println("Movie name: " + name);
        System.out.println("Release year: " + releaseYear);
    }

    public void setRating (double rating){
        this.rating += rating;
        totalRating++;
    }

    public double avarageRating(){
        return rating / totalRating;
    }

    @Override
    public int compareTo(Media otherMedia) {
        return this.getName().compareTo(otherMedia.getName());
    }

    public String toString(){
        return "Media {"+
                "nome=' " + name + '\'' +
                ", year= " + releaseYear + '\'' +
                ", duration= " + totalMinutes;
    }
}
