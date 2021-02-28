package ru.job4j.oop;

public class Builder extends Engineer {

    public Builder(String name, String surname, String birthday, String education, String sphere) {
        super(name);
      //  super(surname);
    }

    public static void main(String[] args) {
        Builder builder = new Builder(
                "Pavel",
                "Kovyazin",
                "01.01.1985",
                "University Constructions and Materials in Moscow.",
                "Construction"
        );
    }
}