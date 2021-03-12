package ru.job4j.oop;

public class Engineer extends Profession {

    private String technicalSphere;

    public Engineer(String name, String surname, String education, String birthday, String technicalSphere) {
        super(name, surname, education, birthday);
        this.technicalSphere = technicalSphere;
    }
}