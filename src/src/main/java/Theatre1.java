//import java.util.ArrayList;
//import java.util.List;
//import java.util.Scanner;
//
//public class Theatre {
//
//    public List<Show> shows = new ArrayList<>();
////    public ArrayList<Director> listOfDirectors = theaterSystem.getListOfDirectors();
////    private ArrayList<Director> listOfDirectors;
//
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        TheaterSystem theaterSystem = new TheaterSystem();
//        Theatre theatre = new Theatre();
//
//        while (true) {
//            printMainMenu();
//            System.out.println("Выберите пункт меню: ");
//            String choice = scanner.nextLine();
//
//            switch (choice) {
//                case "1":
//
//                    if (theaterSystem.getListOfAllActors().isEmpty()) {
//                        System.out.println("Список актёров пуст! Добавьте актёров в список и попробуйте добавить спектакль!");
//                        break;
//                    } else if (theaterSystem.getListOfDirectors().isEmpty()) {
//                        System.out.println("Список режиссёров пуст! Добавьте режиссёров в список и попробуйте добавить спектакль!");
//                        break;
//                    }
//
//                    System.out.println("Введите название спектакля: ");
//                    String title = scanner.nextLine();
//
//                    System.out.println("Введите длительность спектакля в минутах: ");
//                    double duration = Double.parseDouble(scanner.nextLine());
//
//                    System.out.println("Выберите номер режиссёра: ");
//                    theaterSystem.printAllDirectors();
//                    int indexDirector = Integer.parseInt(scanner.nextLine());
//                    Director currentDirector = theaterSystem.getListOfDirectors().get(indexDirector - 1);
//
//                    System.out.println("Добавьте нового актёра из списка по номеру: ");
//                    theaterSystem.printActors();
//                    int indexActor = Integer.parseInt(scanner.nextLine());
//                    Actor currentActor = theaterSystem.getListOfAllActors().get(indexActor - 1);
//                    ArrayList<Actor> listOfActors = new ArrayList<>();
//                    listOfActors.add(currentActor);
//
//                    System.out.println("Выберите тип спектакля");
//                    printShowMenu();
//                    boolean isContinue = true;
//                    while (isContinue) {
//                        String choosingPerformance = scanner.nextLine();
//                        switch (choosingPerformance) {
//                            case "1":
//                                Show newShow = new Show(title, duration, currentDirector, listOfActors);
//                                theatre.addShow(newShow);
//                                isContinue = false;
//                                break;
//                            case "2":
//                                if (theaterSystem.getListOfAllComposer().isEmpty()) {
//                                    System.out.println("Список авторов музыки пуст! Добавьте авторов музыки в список и попробуйте добавить спектакль!");
//                                    break;
//
//                                } else {
//                                    System.out.println("Выберите номер автора музыки из списка: ");
//                                    theaterSystem.printAllComposer();
//                                    int indexComposer = Integer.parseInt(scanner.nextLine());
//                                    Person composer = theaterSystem.getListOfAllComposer().get(indexComposer - 1);
//
//                                    System.out.println("Введите текст либретто: ");
//                                    String librettoText = scanner.nextLine();
//
//                                    System.out.println("Введите количество людей в хоре: ");
//                                    int choirSize = Integer.parseInt(scanner.nextLine());
//
//                                    Opera newOpera = new Opera(title, duration, currentDirector, listOfActors, composer, librettoText, choirSize);
//                                    theatre.addShow(newOpera);
//                                    isContinue = false;
//                                }
//                                break;
//
//                            case "3":
//                                if (theaterSystem.getListOfAllChoreographer().isEmpty()) {
//                                    System.out.println("Список хореографов пуст! Добавьте хореографов в список и попроюуйте добавить спектакль!");
//                                } else if (theaterSystem.getListOfAllComposer().isEmpty()) {
//                                    System.out.println("Список авторов музыки пуст! Добавьте  в список автора музыки и попробуйте добавить спектакль!");
//                                } else {
//                                    System.out.println("Выберите номер автора музыки из списка: ");
//                                    theaterSystem.printAllComposer();
//                                    int indexComposer = Integer.parseInt(scanner.nextLine());
//                                    Person composer = theaterSystem.getListOfAllComposer().get(indexComposer - 1);
//
//                                    System.out.println("Введите текст либретто: ");
//                                    String textLibretto = scanner.nextLine();
//
//                                    System.out.println("Выберите номер хореографа из списка: ");
//                                    theaterSystem.printAllChoreographers();
//                                    int indexChoreographer = Integer.parseInt(scanner.nextLine());
//                                    Person currentChoreographer = theaterSystem.getListOfAllChoreographer().get(indexChoreographer - 1);
//
//                                    Ballet newBallet = new Ballet(title, duration, currentDirector, listOfActors, composer, textLibretto, currentChoreographer);
//                                    theatre.addShow(newBallet);
//                                    isContinue = false;
//                                    break;
//                                }
//
//                            default:
//                                System.out.print("Неверный выбор. Введите число от 1 до 3: ");
//                                break;
//                        }
//                    }
//                    break;
//
//                case "2":
//                    System.out.println("Введите имя актёра: ");
//                    String name = scanner.nextLine().trim();
//
//                    System.out.println("Введите фамилию актёра: ");
//                    String surname = scanner.nextLine().trim();
//
//                    System.out.println("Выберите пол актёра:");
//                    System.out.println("1 - Male (Мужской)");
//                    System.out.println("2 - Female (Женский)");
//
//                    Gender gender = null;
//
//                    while (gender == null) {
//                        System.out.print("Введите номер (1 или 2): ");
//                        String input = scanner.nextLine();
//                        gender = genderSelection(input);
//                    }
//
//                    System.out.println("Введите рост актёра: ");
//                    double height = scanner.nextDouble();
//                    scanner.nextLine();
//
//                    Actor actor = new Actor(name, surname, gender, height);
//                    theaterSystem.getListOfAllActors().add(actor);
//                    System.out.println("Актёр добавлен!");
//                    break;
//
//                case "3":
//                    System.out.println("Выберите номер спектакля: ");
//                    if (theatre.shows.isEmpty()) {
//                        System.out.println("Список спектаклей пуст!");
//                        break;
//                    }
//                    theatre.printAllShows();
//                    int indexTheatre = Integer.parseInt(scanner.nextLine());
//                    Show currentShow = theatre.shows.get(indexTheatre - 1);
//
//                    System.out.println("Выберите номер актёра, которого хотите добавить в спектакль: ");
//                    theaterSystem.printActors();
//                    int indexCurrentActor = scanner.nextInt();
//                    Actor actorCurrent = theaterSystem.getListOfAllActors().get(indexCurrentActor - 1);
//                    theatre.addActor(actorCurrent, currentShow);
////                    currentShow.getListOfActors().add(actorCurrent);
//                    System.out.println("Актёр добавлен!");
//                    break;
//
//                case "4":
//                    System.out.println("Введите имя режиссёра: ");
//                    String nameDirector = scanner.nextLine();
//                    System.out.println("Введите фамилию режиссёра ");
//                    String surnameDirector = scanner.nextLine();
//
//
//                    System.out.println("Выберите пол режиссёра :");
//                    System.out.println("1 - Male (Мужской)");
//                    System.out.println("2 - Female (Женский)");
//
//                    Gender currentGender = null;
//
//                    while (currentGender == null) {
//                        System.out.print("Введите номер (1 или 2): ");
//                        String input = scanner.nextLine();
//                        currentGender = genderSelection(input);
//                    }
//
//                    System.out.println("Введите количество поставленных спектаклей : ");
//                    int numbersOfShows = scanner.nextInt();
//                    scanner.nextLine();
//
//                    Director newDirector = new Director(nameDirector, surnameDirector, currentGender, numbersOfShows);
//                    theaterSystem.getListOfDirectors().add(newDirector);
//                    System.out.println("Новый режиссёр добавлен!");
//                    break;
//
//                case "5":
//                    System.out.println("Введите имя нового автора музыки: ");
//                    String composerName = scanner.nextLine();
//
//                    System.out.println("Введите фамилию нового автора музыки: ");
//                    String composerSurname = scanner.nextLine();
//
//                    System.out.println("Выберите пол автора музыки: ");
//                    System.out.println("1 - Male (Мужской)");
//                    System.out.println("2 - Female (Женский)");
//
//                    Gender composerGender = null;
//
//                    while (composerGender == null) {
//                        System.out.print("Введите номер (1 или 2): ");
//                        String input = scanner.nextLine();
//                        composerGender = genderSelection(input);
//                    }
//
//                    Person composer = new Person(composerName, composerSurname, composerGender);
//                    theaterSystem.getListOfAllComposer().add(composer);
//                    System.out.println("Автор музыки добавлен!");
//                    break;
//
//                case "6":
//                    System.out.println("Введите имя нового хореографа: ");
//                    String choreographerName = scanner.nextLine();
//
//                    System.out.println("Введите фамилию нового хореографа: ");
//                    String choreographerSurname = scanner.nextLine();
//
//                    System.out.println("Выберите пол хореографа: ");
//                    System.out.println("1 - Male (Мужской)");
//                    System.out.println("2 - Female (Женский)");
//
//                    Gender choreographerGender = null;
//
//                    while (choreographerGender == null) {
//                        System.out.print("Введите номер (1 или 2): ");
//                        String input = scanner.nextLine();
//                        choreographerGender = genderSelection(input);
//                    }
//
//                    Person choreographer = new Person(choreographerName, choreographerSurname, choreographerGender);
//                    theaterSystem.getListOfAllChoreographer().add(choreographer);
//                    System.out.println("Хореограф добавлен!");
//                    break;
//
//                case "7":
//                    theaterSystem.printActors();
//                    break;
//
//                case "8":
//                    theaterSystem.printAllDirectors();
//                    break;
//
//                case "9":
//                    theaterSystem.printAllChoreographers();
//                    break;
//
//                case "10":
//                    theatre.printAllShows();
//                    break;
//
//                case "11":
//                    theaterSystem.printAllComposer();
//                    break;
//
//                case "12":
//                    System.out.println("Выберите номер спектакля, список актёров которого хотите посмотреть: ");
//                    theatre.printAllShows();
//
//                    int indexCurrentTheatre = Integer.parseInt(scanner.nextLine());
//                    theatre.shows.get(indexCurrentTheatre-1).printActors();
//
//                    break;
//
//                default:
//                    System.out.println("Неизвестный выбор!");
//                    ;
//            }
//        }
//    }
//
//    public void printAllShows() {
//        if (shows.isEmpty()) {
//            System.out.println("Список спектаклей пуст.");
//            return;
//        }
//
//        System.out.println("\n=== СПИСОК ВСЕХ СПЕКТАКЛЕЙ ===");
//        for (int i = 0; i < shows.size(); i++) {
//            Show show = shows.get(i);
//            System.out.println((i + 1) + ". " + show.getTitle() +
//                    " (Режиссёр: " + show.getDirector() +
//                    ", Длительность: " + show.getDuration() + " мин)");
//        }
//        System.out.println("Всего спектаклей: " + shows.size());
//    }
//
//    public static Gender genderSelection(String input) {
//        Gender currentGender = null;
//        if (input.equals("1")) {
//            currentGender = Gender.MALE;
//        } else if (input.equals("2")) {
//            currentGender = Gender.FEMALE;
//        } else {
//            System.out.println("Ошибка! Введите 1 или 2.");
//        }
//        return currentGender;
//    }
//
//    public void addShow(Show show) {
//        shows.add(show);
//    }
//
//    public void addActor(Actor actor, Show show) {
//        show.addNewActor(actor);
//    }
//
//    private static void printMainMenu() {
//        System.out.println("\n===== ТЕАТРАЛЬНАЯ СИСТЕМА =====");
//        System.out.println("1. Добавить спектакль");
//        System.out.println("2. Создать актёра");
//        System.out.println("3. Добавить актера в спектакль");
//        System.out.println("4. Создать режиссёра");
//        System.out.println("5. Создать автора музыки");
//        System.out.println("6. Создать хореографа");
//        System.out.println("7. Вывести список всех актёров");
//        System.out.println("8. Вывести список всех режиссёров");
//        System.out.println("9. Вывести список всех хореографов");
//        System.out.println("10. Вывести список всех спектаклей");
//        System.out.println("11. Вывести список всех авторов музыки");
//        System.out.println("12. Вывести список всех актёров выбранного спектакля");
//        System.out.println("0. Выход");
//        System.out.println("================================");
//    }
//
//    public static void printShowMenu() {
//        System.out.println("\nВыберите тип спектакля:");
//        System.out.println("1. Обычный спектакль");
//        System.out.println("2. Опера");
//        System.out.println("3. Балет");
//    }
//}
