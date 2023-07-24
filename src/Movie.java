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

    void showCredits(){
        System.out.println("Movie name: " + name);
        System.out.println("Release year: " + releaseYear);
    }

    void setRating (double rating){
        this.rating += rating;
        totalRating++;
    }

    double avarageRating(){
        return rating / totalRating;
    }
}
