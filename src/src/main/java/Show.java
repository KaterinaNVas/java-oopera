import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;

public class Show {
    private String title;
    private double duration;
    private Director director;
    private ArrayList<Actor> listOfActors;


    public Show(String title, double duration, Director director, ArrayList<Actor> listOfActors) {
        this.title = title;
        this.duration = duration;
        this.director = director;
        this.listOfActors = listOfActors;
    }

    public Show(String title, double duration, Director director) {
        this.title = title;
        this.duration = duration;
        this.director = director;
        this.listOfActors = new ArrayList<>();
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setDuration(double duration) {
        this.duration = duration;
    }

    public void setDirector(Director director) {
        this.director = director;
    }

    public void setListOfActors(ArrayList<Actor> listOfActors) {
        this.listOfActors = listOfActors;
    }



    public String getTitle() {
        return title;
    }

    public double getDuration() {
        return duration;
    }

    public Director getDirector() {
        return director;
    }

    public ArrayList<Actor> getListOfActors() {
        return listOfActors;
    }



    public void printActors() {
        if (listOfActors.isEmpty()) {
            System.out.println("Список актёров пуст.");
            return;
        }

        System.out.println("\n=== СПИСОК АКТЁРОВ ШОУ ===");
        for (int i = 0; i < listOfActors.size(); i++) {
            System.out.println((i + 1) + ". " + listOfActors.get(i));
        }
        System.out.println("Всего: " + listOfActors.size() + " актёров");
    }

    public void addNewActor(Actor newActor) {
        if (newActor == null) {
            System.out.println("Актёр не может быть null!");
            return;
        } else if (!listOfActors.contains(newActor)) {
            listOfActors.add(newActor);
            System.out.println("Актёр добавлен: " + newActor);
        } else {
            System.out.println("Такой актёр уже есть!");
            return;
        }
    }

    public void replaceActor(Actor newActor, String surnameActor) {
        if (surnameActor == null || newActor == null) {
            System.out.println("Актёр не может быть null!");
        } else {
            int replacedCount = 0;
            for (int i = 0; i < listOfActors.size(); i++) {
                Actor currentActor = listOfActors.get(i);
                if (surnameActor.equals(currentActor.getSurname())) {
                    listOfActors.set(i, newActor);
                    replacedCount++;
                }
            }
            if (replacedCount == 0) {
                System.out.println("Такого актёра нет в списке!");
            }
        }
    }

    public void printAllActors() {
        System.out.println("\n=== СПИСОК ВСЕХ АКТЁРОВ ===");

        if (listOfActors.isEmpty()) {
            System.out.println("Актёров нет в списке.");
            return;
        }

        for (int i = 0; i < listOfActors.size(); i++) {
            Actor actor = listOfActors.get(i);
            System.out.println((i + 1) + ". " + actor);
        }
        System.out.println("\nВсего актёров: " + listOfActors.size());
    }



}
