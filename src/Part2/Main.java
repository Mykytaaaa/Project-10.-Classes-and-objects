package Part2;

import java.util.Scanner;

public class Main {
    public static Scanner in = new Scanner(System.in);
    public static Collection collection = new Collection();
    public static void main(String[] args) {
        System.out.println("Welcome to the book database!\n" +
                "Choose an option to proceed:\n" +
                "1 - add a book to collection\n" +
                "2 - add multiple books to collection\n" +
                "3 - print all books\n" +
                "4 - sort books by number of pages\n" +
                "5 - search books by name\n" +
                "6 - search books by name and number of pages\n" +
                "0 - exit the program");

        do {
            String answer = in.nextLine();
            switch (answer) {
                case "1" -> collection.add(new Book(inputBookName(), inputBookPages()));
                case "2" -> inputItems();
                case "3" -> collection.print();
                case "4" -> sort();
                case "5" -> search(true);
                case "6" -> search(false);
                case "0" -> {
                    return;
                }
            }
        } while (true);
    }

    public static void inputItems() {
        System.out.println("Press 0 to finish library filling");
        do {
            String name = inputBookName();
            if (name.equals("0"))
                break;
            else
                collection.add(new Book(name, inputBookPages()));
        } while (true);
    }
    public static void search(boolean nameOnly) {
        if (nameOnly)
            collection.find(inputBookName());
        else
            collection.searchObjects(inputBookName(), inputBookPages());
    }
    public static void sort() {
        collection.sort();
        System.out.println("Sorted by number of pages");
    }

    public static String inputBookName() {
        System.out.println("Input book name");
        return in.nextLine();
    }

    public static int inputBookPages() {
        System.out.println("Input number of pages");
        return Integer.parseInt(in.nextLine());
    }
}
