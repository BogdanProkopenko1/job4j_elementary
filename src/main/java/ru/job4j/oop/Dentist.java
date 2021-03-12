package ru.job4j.oop;

public class Dentist extends Doctor {

    private String second;

    public Dentist(
            String name, String surname, String education, String birthday, String healthSphere, String second
    ) {
        super(name, surname, education, birthday, healthSphere);
        this.second = second;
    }
}