package ru.job4j.pojo;

public class Library {
    public static void main(String[] args) {
        Book cleanCode = new Book("Clean Code", 125);
        Book headFirstJava = new Book("Head First Java", 500);
        Book headFirstPython = new Book("Head First Python", 264);
        Book headLastJava = new  Book("Head Lat Java", 400);
        Book[] books = new Book[4];
        books[0] = cleanCode;
        books[1] = headFirstJava;
        books[2] = headFirstPython;
        books[3] = headLastJava;
        for (Book rsl : books) {
            System.out.println(rsl.getName() + " : " + rsl.getPages());
        }
        System.out.println(" ");
        Book swap = books[0];
        books[0] = books[3];
        books[3] = swap;
        for (Book rsl : books) {
            System.out.println(rsl.getName() + System.lineSeparator() + rsl.getPages() + System.lineSeparator());
        }
        for (Book rsl : books) {
            if (rsl.getName().equals("Clean Code")) {
                System.out.println("Result = " + rsl.getName() + System.lineSeparator() + rsl.getPages());
            }
        }
    }
}
