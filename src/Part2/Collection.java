package Part2;

import java.util.Objects;

public class Collection {
    private int count = 0;
    private Book[] books = null;
    public void add(Book newObj) {
        Book[] temp = new Book[count + 1];
        for (int i = 0; i < count; i++) {
            temp[i] = books[i];
        }
        books = temp;
        books[count] = newObj;
        count++;
    }

    public void printOne(int i) {
        System.out.println(books[i].name + ", " + books[i].numPages + " pages");
    }

    public void print() {
        for (int i = 0; i < count; i++) {
            printOne(i);
        }
    }

    public void find(String s) {
        for (int i = 0; i < count; i++) {
            if (s.equals(books[i].name))
                printOne(i);
        }
    }

    public void sort() {
        for (int i = 0; i < books.length; i++) {
            for (int j = 0; j < books.length; j += 2) {
                if (j + 1 < books.length && books[j].numPages > books[j + 1].numPages) {
                    swap(books, j, j + 1);
                }
                else if (j - 1 > 0 && books[j].numPages < books[j - 1].numPages) {
                    swap(books, j, j - 1);
                }
            }
        }
    }

    private void swap(Book[] array, int i, int j) {
        Book temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

    public void searchObjects(String name, int numPages) {
        for (int i = 0; i < count; i++) {
            if (name.equals(books[i].name) && books[i].numPages == numPages)
                printOne(i);
        }
    }
}
