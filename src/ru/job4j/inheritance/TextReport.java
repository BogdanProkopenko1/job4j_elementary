package ru.job4j.inheritance;

public class TextReport {
    public String generate(String name, String body) {
        return "name : " + name + System.lineSeparator() + "body : " + body;
    }
}