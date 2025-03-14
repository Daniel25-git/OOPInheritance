import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Director moviedirector = new Director(" Peter","Jackson","Male");
        Actor movieactor1 = new Actor("Kate","Winslet","Female");
        Actor movieactor2 = new Actor("Will","Smith","Male");

        ArrayList<Actor> movieActorList = new ArrayList<>();
        Movie myMovie = new Movie("National Geographic","PG",moviedirector,movieActorList,120,"Understanding of our world",2000);

        Director tvshowdirector = new Director("Ben","Stiller","Male");
        Actor tvshowactor1 = new Actor(" Hilary","Swank","Female");
        Actor tvshowactor2 = new Actor(" Michelle","Williams","Female");

        myMovie.addActor(movieactor1);
        myMovie.addActor(movieactor2);

        ArrayList<Actor> tvShowActorList = new ArrayList<>();
        TvShow myTvShow = new TvShow("The Midnight Hour","MA", tvshowdirector,tvShowActorList,2,5);

        myTvShow.addActor(tvshowactor1);
        myTvShow.addActor(tvshowactor2);

        System.out.println("\n=== MOVIE INFORMATION ===");
        System.out.println(myMovie);

        System.out.println("\n=== TV SHOW INFORMATION ===");
        System.out.println( myTvShow);

        Actor tvshowactor3 = new Actor(" Milkomi","Daniel","Male");

        myTvShow.removeActor(tvshowactor3);
    }
}