package ru.job4j.oop;

public class Surgeon extends Doctor {

    public Surgeon(
            String firstname,
            String lastname,
            String birthday,
            String education,
            String sphere) {
        this.name = firstname;
        this.surname = lastname;
        this.birthday = birthday;
        this.education = education;
        this.healthSphere = sphere;
    }

    public static void main(String[] args) {
        Surgeon surgeon = new Surgeon("Sergey",
                "Derevnin",
                "22.12.2003",
                "Medical University in Moscow",
                "Surgery"
        );
    }
}
