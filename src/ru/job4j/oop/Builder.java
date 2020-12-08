package ru.job4j.oop;

public class Builder extends Engineer {

    public Builder(
            String firstname,
            String lastname,
            String birthday,
            String education,
            String sphere) {
        this.name = firstname;
        this.surname = lastname;
        this.birthday = birthday;
        this.education = education;
        this.technicalSphere = sphere;
    }

    public static void main(String[] args) {
        Builder builder = new Builder(
                "Pavel",
                "Kovyazin",
                "01.01.1985",
                "University Constructions and Materials in Moscow.",
                "Construction"
        );
    }
}