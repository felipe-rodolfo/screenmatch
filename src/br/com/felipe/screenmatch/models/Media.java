package br.com.felipe.screenmatch.models;

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
}
