package ru.job4j.oop;

public class Profession {
    private String name;
    private String surname;
    private String education;
    private String birthday;

    public String getName(String firstname) {
        this.name = firstname;
        return this.name;
    }

    public String getSurname(String lastname) {
        this.surname = lastname;
        return this.surname;
    }

    public String getBirthday(String date) {
        this.birthday = date;
        return this.birthday;
    }

    public String getEducation(String educated) {
        this.education = educated;
        return this.education;
    }
}
