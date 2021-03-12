package ru.job4j.oop;

public class Builder extends Engineer {

    private String fourth;

    public Builder(
            String name, String surname, String education, String birthday, String healthSphere, String fourth
    ) {
        super(name, surname, education, birthday, healthSphere);
        this.fourth = fourth;
    }
}