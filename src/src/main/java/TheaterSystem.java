import java.util.ArrayList;
import java.util.List;

public class TheaterSystem {
    private List<Show> allShows = new ArrayList<>();
    private ArrayList<Director> listOfDirectors = new ArrayList<>();
    private ArrayList<Actor> listOfAllActors = new ArrayList<>();
    private ArrayList<Person> listOfAllComposer = new ArrayList<>();
    private ArrayList<Person> listOfAllChoreographer = new ArrayList<>();

    public void setListOfAllChoreographer(ArrayList<Person> listOfAllChoreographer) {
        this.listOfAllChoreographer = listOfAllChoreographer;
    }

    public ArrayList<Person> getListOfAllChoreographer() {
        return listOfAllChoreographer;
    }

    public void setListOfAllActors(ArrayList<Actor> listOfActors) {
        this.listOfAllActors = listOfActors;
    }

    public void setListOfAllComposer(ArrayList<Person> listOfAllComposer) {
        this.listOfAllComposer = listOfAllComposer;
    }

    public ArrayList<Person> getListOfAllComposer() {
        return listOfAllComposer;
    }

    public ArrayList<Actor> getListOfAllActors() {
        return listOfAllActors;
    }

    public void setListOfDirectors(ArrayList<Director> listOfDirectors) {
        this.listOfDirectors = listOfDirectors;
    }

    public ArrayList<Director> getListOfDirectors() {
        return listOfDirectors;
    }

    public void printActors() {
        if (listOfAllActors.isEmpty()) {
            System.out.println("Список актёров пуст.");
            return;
        }

        System.out.println("\n=== СПИСОК АКТЁРОВ ===");
        for (int i = 0; i < listOfAllActors.size(); i++) {
            System.out.println((i + 1) + ". " + listOfAllActors.get(i));
        }
        System.out.println("Всего: " + listOfAllActors.size() + " актёров");
    }

    public void printAllDirectors() {
        System.out.println("\n=== СПИСОК ВСЕХ РЕЖИССЁРОВ ===");

        if (listOfDirectors.isEmpty()) {
            System.out.println("Режиссёров нет в списке.");
            return;
        }

        for (int i = 0; i < listOfDirectors.size(); i++) {
            Director director = listOfDirectors.get(i);
            System.out.println((i + 1) + ". " + director);
        }
        System.out.println("\nВсего режиссёров: " + listOfDirectors.size());
    }

    public void printAllChoreographers() {
        System.out.println("\n=== СПИСОК ВСЕХ ХОРЕОГРАФОВ ===");

        if (listOfAllChoreographer.isEmpty()) {
            System.out.println("Хореографов нет в списке.");
            return;
        }

        for (int i = 0; i < listOfAllChoreographer.size(); i++) {
            Person choreographer = listOfAllChoreographer.get(i);
            System.out.println((i + 1) + ". " + choreographer);
        }
        System.out.println("\nВсего хореографов: " + listOfAllChoreographer.size());
    }

    public void printAllComposer() {
        System.out.println("\n=== СПИСОК ВСЕХ АВТОРОВ МУЗЫКИ ===");

        if (listOfAllComposer.isEmpty()) {
            System.out.println("Авторов музыки нет в списке.");
            return;
        }

        for (int i = 0; i < listOfAllComposer.size(); i++) {
            Person choreographer = listOfAllComposer.get(i);
            System.out.println((i + 1) + ". " + choreographer);
        }
        System.out.println("\nВсего авторов музыки: " + listOfAllComposer.size());
    }

    public void addShow(Show show) {
        if (show != null) {
            allShows.add(show);
        }
    }

    public List<Show> getAllShows() {
        return allShows;
    }
    public boolean removeShow(String title) {
        for (Show show : allShows) {
            if (show.getTitle().equals(title)) {
                return allShows.remove(show);
            }
        }
        return false;
    }

}
