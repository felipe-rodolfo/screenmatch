import br.com.felipe.screenmatch.models.*;
public class Main {
    public static void main(String[] args) {
        Movie myMovie = new Movie();
        myMovie.setName("O poderoso chefão");
        myMovie.setReleaseYear(7970);
        myMovie.setTotalMinutes(180);

        myMovie.showCredits();
        myMovie.setRating(8);
        myMovie.setRating(5);
        myMovie.setRating(10);
        System.out.println(myMovie.getTotalRating());
        System.out.println(myMovie.avarageRating());
    }
}
