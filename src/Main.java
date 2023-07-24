import br.com.felipe.screenmatch.models.*;
public class Main {
    public static void main(String[] args) {
        Movie myMovie = new Movie();
        myMovie.name = "O poderoso chefão";
        myMovie.releaseYear = 7970;
        myMovie.totalMinutes = 180;

        myMovie.showCredits();
        myMovie.setRating(8);
        myMovie.setRating(5);
        myMovie.setRating(10);
        System.out.println(myMovie.getTotalRating());
        System.out.println(myMovie.avarageRating());
    }
}
