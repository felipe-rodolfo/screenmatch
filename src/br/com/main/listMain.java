package br.com.main;

import br.com.felipe.screenmatch.models.Media;
import br.com.felipe.screenmatch.models.Movie;
import br.com.felipe.screenmatch.models.Serie;

import java.util.ArrayList;

public class listMain {
    public static void main(String[] args) {
        Movie myMovie = new Movie("O poderoso chefão", 7970);
        Serie lost = new Serie("Lost", 2000);
        Movie paulMovie = new Movie("Dogville", 2003);

        ArrayList<Media> list = new ArrayList<>();
        list.add(paulMovie);
        list.add(myMovie);
        list.add(lost);
        for (Media item: list){
            System.out.println(item);
        }
    }
}
