import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Theatre {

    public List<Show> shows = new ArrayList<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        TheaterSystem theaterSystem = new TheaterSystem();
        Theatre theatre = new Theatre();

        // Создание 3-х актёров
        Actor actor1 = new Actor("Sasha", "Filatova", Gender.FEMALE, 165);
        Actor actor2 = new Actor("Egor", "Egorov", Gender.MALE, 186);
        Actor actor3 = new Actor("Victor", "Savin", Gender.MALE, 192);


        theaterSystem.getListOfAllActors().add(actor1);
        theaterSystem.getListOfAllActors().add(actor2);
        theaterSystem.getListOfAllActors().add(actor3);

        //Создание двух режиссёров
        Director director1 = new Director("Lara", "Mitchel", Gender.FEMALE, 32);
        Director director2 = new Director("Dima", "Larin", Gender.MALE, 2);
        // Создание автора музыки
        Person musicAuthor = new Person("Dana", "Dolina", Gender.FEMALE);
        // Создание хореографа
        Person choreographer = new Person("Sava", "Gonev", Gender.FEMALE);

        // Создать три спектакля: обычный, оперный и балет
        Show show = new Show("Goldfish", 134, director1);
        Opera opera = new Opera("Florence", 56, director2, musicAuthor, "Hello, my friend!", 15);
        Ballet ballet = new Ballet("Nutcracker", 78, director1, musicAuthor, "Hello", choreographer);

        // Распределить актёров по спектаклям
        show.addNewActor(actor1);
        show.addNewActor(actor3);

        opera.addNewActor(actor1);
        opera.addNewActor(actor2);

        ballet.addNewActor(actor2);
        ballet.addNewActor(actor3);

        // Для каждого спектакля выведите на экран список актёров.
        System.out.println("Актёры спектакля " + show.getTitle());
        show.printActors();

        System.out.println("Актёры спектакля " + opera.getTitle());
        opera.printActors();

        System.out.println("Актёры спектакля " + ballet.getTitle());
        ballet.printActors();

        // Замените актёра в одном из спектаклей на актёра из
        // другого спектакля и ещё раз выведите для него список актёров.

        System.out.println("Заменим второго актёра в спектакле " + show.getTitle());
        show.replaceActor(actor2, "Savin");
        System.out.println("Актёры спектакля " + show.getTitle());
        show.printActors();

        //Попробуйте заменить в другом спектакле несуществующего актёра
        System.out.println("Заменим несуществуещего актёра Савушкина в спектакле " + opera.getTitle());
        opera.replaceActor(actor3, "Савушкин");
        System.out.println("Актёры спектакля " + opera.getTitle());
        opera.printActors();

        // Для оперного и балетного спектакля выведите на экран текст либретто.
        System.out.println("Текст либретто оперного спектакля: ");
        opera.printLibrettoText();

        System.out.println("Текст либретто балета: ");
        ballet.printLibrettoText();
    }


    public void printAllShows() {
        if (shows.isEmpty()) {
            System.out.println("Список спектаклей пуст.");
            return;
        }

        System.out.println("\n=== СПИСОК ВСЕХ СПЕКТАКЛЕЙ ===");
        for (int i = 0; i < shows.size(); i++) {
            Show show = shows.get(i);
            System.out.println((i + 1) + ". " + show.getTitle() +
                    " (Режиссёр: " + show.getDirector() +
                    ", Длительность: " + show.getDuration() + " мин)");
        }
        System.out.println("Всего спектаклей: " + shows.size());
    }

    public static Gender genderSelection(String input) {
        Gender currentGender = null;
        if (input.equals("1")) {
            currentGender = Gender.MALE;
        } else if (input.equals("2")) {
            currentGender = Gender.FEMALE;
        } else {
            System.out.println("Ошибка! Введите 1 или 2.");
        }
        return currentGender;
    }

}
