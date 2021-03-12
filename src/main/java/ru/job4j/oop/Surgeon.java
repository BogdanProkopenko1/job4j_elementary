package ru.job4j.oop;

public class Surgeon extends Doctor {
    
    private String first;

    public Surgeon(
            String name, String surname, String education, String birthday, String healthSphere, String first
    ) {
        super(name, surname, education, birthday, healthSphere);
        this.first = first;
    }
}