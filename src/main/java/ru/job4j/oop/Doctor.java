package ru.job4j.oop;

public class Doctor extends Profession {
    
    private String healthSphere;

    public Doctor(String name, String surname, String education, String birthday, String healthSphere) {
        super(name, surname, education, birthday);
        this.healthSphere = healthSphere;
    }
}