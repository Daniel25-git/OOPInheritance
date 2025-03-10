import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> movieCasts = new ArrayList<>();
        ArrayList<String> tvShowCasts = new ArrayList<>();
        Movie myMovie = new Movie("National Geographic","PG","Kamal",movieCasts,120,"Understanding of our world",2000);
        TvShow myTvShow = new TvShow("The Midnight Hour","MA","Peter",tvShowCasts,2,5);
        // Movie Casts
        movieCasts.add("Aster");
        movieCasts.add("Fatuma");
        myMovie.setCast(movieCasts);
        // TvShow Casts
        tvShowCasts.add("Mia");
        tvShowCasts.add("Olivia");
        myTvShow.setCast(tvShowCasts);
        System.out.println("\n==== Movie Information ===");
        myMovie.printMovie();
        System.out.println("\n=== TV Show Information ===");
        myTvShow.printTvShow();
    }
}