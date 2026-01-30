import java.util.ArrayList;

public class MusicalShow extends Show {
    protected Person musicAuthor;
    protected String librettoText;

    public MusicalShow(String title, double duration, Director director, ArrayList<Actor> listOfActors, Person musicAuthor, String librettoText) {
        super(title, duration, director, listOfActors);
        this.musicAuthor = musicAuthor;
        this.librettoText = librettoText;
    }

    public MusicalShow(String title, double duration, Director director, Person musicAuthor, String librettoText) {
        super(title, duration, director);
        this.musicAuthor = musicAuthor;
        this.librettoText = librettoText;
    }

    public void setMusicAuthor(Person musicAuthor) {
        this.musicAuthor = musicAuthor;
    }

    public Person getMusicAuthor() {
        return musicAuthor;
    }

    public void setLibrettoText(String librettoText) {
        this.librettoText = librettoText;
    }


    public String getLibrettoText() {
        return librettoText;
    }

    public void printLibrettoText() {
        System.out.println(librettoText);
    }
}
