import java.util.ArrayList;

public class TvShow extends Media{
    private int seasons;
    private int episodes;

    public TvShow(String title, String rating, String director, ArrayList<String> cast, int seasons, int episodes) {
        super(title, rating, director, cast);
        this.seasons = seasons;
        this.episodes = episodes;
    }

    public int getSeasons() {
        return seasons;
    }

    public void setSeasons(int seasons) {
        this.seasons = seasons;
    }

    public int getEpisodes() {
        return episodes;
    }

    public void setEpisodes(int episodes) {
        this.episodes = episodes;
    }

    @Override
    public String play() {
        //System.out.println("Playing episode 1, season 1 of: " + getTitle());
        return "Playing episode 1, season 1 of: " + getTitle();
    }

    public void printTvShow() {
        System.out.println(play());
        System.out.println(toString());
        System.out.println("Rating: "+ getRating());
        System.out.println("Director: " + getDirector());
        System.out.print("Casts: ");
        for(String cast : getCast()) {
            System.out.print(cast + " ");
        }
        System.out.println();
        System.out.println("Seasons: " + getSeasons());
        System.out.println("Episodes: " + getEpisodes());
    }
}
