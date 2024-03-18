package FinalProject;

import java.util.Arrays;

public class Bookshelf {

    private static final int CAPACITY = 10;
    private final Book[] books = new Book[CAPACITY];
    private int countBooks;
    private int lengthShelves;

    public int getCountBooks() {
        return countBooks;
    }

    public int getCountFreeShelves() {
        return CAPACITY - countBooks;
    }

    public int getLengthShelves() {
        return lengthShelves;
    }

    public boolean save(Book book) {
        if (countBooks < CAPACITY) {
            books[countBooks++] = book;
            lengthShelves = Math.max(lengthShelves, book.getLength());
            return true;
        }
        return false;
    }

    public Book find(String title) {
        for (int i = 0; i < countBooks; i++) {
            if (books[i].getTitle().equals(title)) {
                return books[i];
            }
        }
        return null;
    }

    public boolean delete(String title) {
        for (int i = 0; i < countBooks; i++) {
            if (books[i].getTitle().equals(title)) {
                int length = books[i].getLength();
                if (countBooks > 1 && i < countBooks - 1) {
                    System.arraycopy(books, i + 1, books, i, countBooks - i - 1);
                }
                countBooks--;
                books[countBooks] = null;

                updateLengthShelves(length);
                return true;
            }
        }
        return false;
    }

    private void updateLengthShelves(int length) {
        if (countBooks > 0) {
            if (length == lengthShelves) {
                lengthShelves = books[0].getLength();
                for (int i = 1; i < countBooks; i++) {
                    lengthShelves = Math.max(lengthShelves, books[i].getLength());
                }
            }
        } else lengthShelves = 0;
    }

    public Book[] getAll() {
        return Arrays.copyOf(books, countBooks);
    }

    public void clear() {
        Arrays.fill(books, 0, countBooks, null);
        countBooks = 0;
    }
}
