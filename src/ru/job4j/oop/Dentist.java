package ru.job4j.oop;

public class Dentist extends Doctor {
    public static void main(String[] args) {
        Dentist dentist = new Dentist();
        dentist.getName("Dmitry");
        dentist.getSurname("Zotov");
        dentist.getBirthday("11.02.1895");
        dentist.getEducation("Medical University in Saint-Petersburg. Surgeon-dentist.");
        dentist.getHealthSphere("Dentistry");
    }
}
