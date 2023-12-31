import br.com.alura.screenmatch.calculos.Recommendation;
import br.com.alura.screenmatch.calculos.TimeCalculator;
import br.com.felipe.screenmatch.models.*;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Movie myMovie = new Movie("O poderoso chefão", 7970);
        myMovie.setTotalMinutes(180);

        myMovie.showCredits();
        myMovie.setRating(8);
        myMovie.setRating(5);
        myMovie.setRating(10);
        System.out.println(myMovie.getTotalRating());
        System.out.println(myMovie.avarageRating());

        Serie lost = new Serie("Lost", 2000);
        lost.showCredits();
        lost.setSeason(10);
        lost.setEpisodesPerSeason(10);
        lost.setMinutesPerEpisode(30);
        lost.setTotalMinutes(50);
        System.out.println(lost.getTotalMinutes());

        Movie paulMovie = new Movie("Dogville", 2003);
        paulMovie.setTotalMinutes(200);
        paulMovie.setRating(10);

        TimeCalculator calculator = new TimeCalculator();
        calculator.includes(myMovie);
        System.out.println(calculator.getTotalTime());

        Recommendation recommendation = new Recommendation();
        recommendation.filterRecommendation(myMovie);

        Episode episode = new Episode();
        episode.setNum(1);
        episode.setSerie(lost);
        episode.setTotalViews(300);
        recommendation.filterRecommendation(episode);
    }
}
