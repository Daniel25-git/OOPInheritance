import java.util.ArrayList;

public class Movie extends Media{
    private int length;
    private String description;
    private double grossing;

    public Movie(String title, String rating, String director, ArrayList<String> cast, int length, String description, double grossing) {
        super(title, rating, director, cast);
        this.length = length;
        this.description = description;
        this.grossing = grossing;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getGrossing() {
        return grossing;
    }

    public void setGrossing(double grossing) {
        this.grossing = grossing;
    }

    @Override
    public String play() {
        return "Playing movie: " + getTitle();
    }

    public void printMovie() {
        System.out.println(play());
        System.out.println(toString());
        System.out.println("Rating: "+ getRating());
        System.out.println("Director: " + getDirector());
        System.out.print("Casts: ");
        for(String cast : getCast()) {
            System.out.print(cast + " ");
        }
        System.out.println();
        System.out.println("Length: " + getLength());
        System.out.println("Grossing: " + getGrossing());
    }
}
