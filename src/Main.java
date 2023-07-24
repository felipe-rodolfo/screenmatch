public class Main {
    public static void main(String[] args) {
        Movie myMovie = new Movie();
        myMovie.name = "O poderoso chefão";
        myMovie.releaseYear = 7970;
        myMovie.totalMinutes = 180;

        System.out.println(myMovie.name);
        System.out.println(myMovie.releaseYear);
    }
}
