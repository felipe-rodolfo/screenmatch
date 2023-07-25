import br.com.alura.screenmatch.calculos.TimeCalculator;
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

        Serie lost = new Serie();
        lost.setName("Lost");
        lost.setReleaseYear(2000);
        lost.showCredits();
        lost.setSeason(10);
        lost.setEpisodesPerSeason(10);
        lost.setMinutesPerEpisode(30);
        lost.setTotalMinutes(50);
        System.out.println(lost.getTotalMinutes());

        TimeCalculator calculator = new TimeCalculator();
        calculator.includes(myMovie);
        System.out.println(calculator.getTotalTime());
    }
}
