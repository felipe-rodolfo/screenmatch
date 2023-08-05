package br.com.main;

import br.com.felipe.screenmatch.models.Media;
import br.com.felipe.screenmatch.models.Movie;
import br.com.felipe.screenmatch.models.Serie;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

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

        List<String> artistSearch = new ArrayList<>();
        artistSearch.add("Felipe");
        artistSearch.add("Adam Sandler");
        artistSearch.add("Paul");
        System.out.println(artistSearch);

        Collections.sort(artistSearch);

        Collections.sort(list);
        System.out.println(list);
        list.sort(Comparator.comparing(Media::getTotalMinutes));
    }
}
