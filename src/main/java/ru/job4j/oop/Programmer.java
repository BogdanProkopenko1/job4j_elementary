package ru.job4j.oop;

public class Programmer extends Engineer {

    private String third;

    public Programmer(
            String name, String surname, String education, String birthday, String healthSphere, String third
    ) {
        super(name, surname, education, birthday, healthSphere);
        this.third = third;
    }
}