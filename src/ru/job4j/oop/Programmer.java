package ru.job4j.oop;

public class Programmer extends Engineer {
    public static void main(String[] args) {
        Programmer programmer = new Programmer();
        programmer.getName("Sergey");
        programmer.getSurname("Derevnin");
        programmer.getBirthday("01.01.1995");
        programmer.getEducation("Communication University in Moscow.");
        programmer.getTechnicalSphere("Programming");
    }
}
