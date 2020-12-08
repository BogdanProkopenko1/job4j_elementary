package ru.job4j.oop;

public class Engineer extends Profession {
    private String technicalSphere;

    public String getTechnicalSphere(String sphere) {
        this.technicalSphere = sphere;
        return this.technicalSphere;
    }
}
