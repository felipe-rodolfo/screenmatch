package br.com.alura.screenmatch.calculos;

public class Recommendation {

    public void filterRecommendation(Classifiable classifiable){
        if(classifiable.getClaassifiable() >= 4){
            System.out.println("It's among the favorites at the moment");
        } else if (classifiable.getClaassifiable() >= 2){
            System.out.println("Highly rated at the moment!");
        } else {
            System.out.println("Add it to your watchlist for later");
        }
    }
}
