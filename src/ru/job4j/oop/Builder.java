package ru.job4j.oop;

public class Builder extends Engineer {
    public static void main(String[] args) {
        Builder builder = new Builder();
        builder.getName("Pavel");
        builder.getSurname("Kovyazin");
        builder.getBirthday("01.01.1985");
        builder.getEducation("University Constructions and Materials in Moscow.");
        builder.getTechnicalSphere("Construction");
    }
}