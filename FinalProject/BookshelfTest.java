package FinalProject;
import java.util.Scanner;

public class BookshelfTest {

    private static final int EXIT = 5;
    private static final String MESSAGE_TITLE = "Введите название книги: ";
    static Bookshelf bs = new Bookshelf();
    static Scanner console = new Scanner(System.in);

    public static void main(String[] args) {
        do {
            printBookshelf();
            printMenu();
        } while (selectMenuItem() != EXIT);
    }

    private static void printBookshelf() {
        if (bs.getCountBooks() == 0) {
            System.out.println("\nШкаф пуст. Вы можете добавить в него первую книгу.");
        } else {
            System.out.println("\nВ шкафу книг - " + bs.getCountBooks() +
                    ", свободно полок - " + bs.getCountFreeShelves());

            Book[] books = bs.getAll();
            int lengthShelves = bs.getLengthShelves();
            for (Book book : books) {
                System.out.println("|" + book + " ".repeat(lengthShelves - book.getLength()) + "|");
                System.out.println("|" + "-".repeat(lengthShelves) + "|");
            }
            System.out.println("|" + " ".repeat(lengthShelves) + "|\n");
        }
    }

    public static void printMenu() {
        System.out.println("""
                1. Сохранить книгу
                2. Найти книгу
                3. Удалить книгу
                4. Очистить шкаф
                5. Выйти
                """);

        System.out.print("Введите номер команды: ");
    }

    private static int selectMenuItem() {
        String item = console.nextLine();
        switch (item) {
            case "1" -> saveBook();
            case "2" -> findBook();
            case "3" -> deleteBook();
            case "4" -> clearShelves();
            case "5" -> {return EXIT;}
            default -> System.out.println("Ошибка: введите номер из списка.");
        }
        pressEnter();

        return 0;
    }

    private static void saveBook() {
        String author = input("Введите автора: ");
        String title = input(MESSAGE_TITLE);
        System.out.print("Введите год издания: ");
        int publicationYear = console.nextInt();
        console.nextLine();

        Book book = new Book(author, title, publicationYear);
        String message = bs.save(book) ? "Книга сохранена." : "Книга не сохранена - в шкафу не осталось свободных полок!";
        System.out.println(message);
    }

    private static void findBook() {
        Book book = bs.find(input(MESSAGE_TITLE));
        System.out.println(book != null ? book : "Книга не найдена.");
    }

    private static void deleteBook() {
        String message = bs.delete(input(MESSAGE_TITLE)) ? "Книга удалена." : "Книга не найдена.";
        System.out.println(message);
    }

    private static void clearShelves() {
        bs.clear();
        System.out.println("Шкаф очищен.");
    }

    private static String input(String message) {
        System.out.print(message);
        return console.nextLine();
    }

    private static void pressEnter() {
        String key;
        do {
            key = input("\nДля продолжения работы нажмите клавишу <Enter>");
        } while (!key.isEmpty());
    }
}
