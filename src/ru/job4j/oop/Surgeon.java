package ru.job4j.oop;

public class Surgeon extends Doctor {
    public static void main(String[] args) {
        Surgeon surgeon = new Surgeon();
        surgeon.getName("Timofey");
        surgeon.getSurname("Kovyazin");
        surgeon.getBirthday("01.01.1999");
        surgeon.getEducation("University Surgery in Moscow.");
        surgeon.getHealthSphere("Surgery");
    }
}
