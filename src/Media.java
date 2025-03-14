import java.util.ArrayList;

public class Media{
    private String title;
    private String rating;
    private Director director;
    private ArrayList<Actor> cast;

    public Media(String title, String rating, Director director, ArrayList<Actor> cast) {
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

    public Director getDirector() {
        return director;
    }

    public void setDirector(Director director) {
        this.director = director;
    }

    public ArrayList<Actor> getCast() {
        return cast;
    }

    public void setCast(ArrayList<Actor> cast) {
        this.cast = cast;
    }

    // add actors
    public void addActor(Actor actor){
        this.cast.add(actor);
    }

    // remove actors
    public void removeActor(Actor actor){
        if(cast.contains(actor)){
            cast.remove(actor);
            System.out.println(actor + " removed successfully");
        }
        else {
            System.out.println( actor + " " + "not exist in the list");
        }

    }
    @Override
    public String toString() {
        return "Title: " +  title + "\n" + "Rating: " + rating + "\n" +
                getDirector() + "\n" + getCast();
    }
}
