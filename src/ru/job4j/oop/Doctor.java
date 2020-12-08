package ru.job4j.oop;

public class Doctor extends Profession {
    private String healthSphere;

    public String getHealthSphere(String sphere) {
        this.healthSphere = sphere;
        return this.healthSphere;
    }
}
