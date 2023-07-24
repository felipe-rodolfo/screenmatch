package br.com.felipe.screenmatch.models;
public class Movie {
    String name;
    int releaseYear;
    boolean includedInThePlan;
    private double rating;
    private int totalRating;
    int totalMinutes;

    int getTotalRating(){
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
}
