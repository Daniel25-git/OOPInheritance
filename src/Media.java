import java.util.ArrayList;

public class Media{
    String title;
    String rating;
    String director;
    ArrayList<String> cast;

    public Media(String title, String rating, String director, ArrayList<String> cast) {
        this.title = title;
        this.rating = rating;
        this.director = director;
        this.cast = cast;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getRating() {
        return rating;
    }

    public void setRating(String rating) {
        this.rating = rating;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public ArrayList<String> getCast() {
        return cast;
    }

    public void setCast(ArrayList<String> cast) {
        this.cast = cast;
    }

    public String play(){
        return "Playing media";
    }

    @Override
    public String toString() {
        return "Title: " + title ;
    }
}
