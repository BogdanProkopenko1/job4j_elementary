package ru.job4j.pojo;

public class College {
    public static void main(String[] args) {
        Student bogdan = new Student();
        bogdan.setFullName("Prokopenko Bogdan Viktorovich");
        bogdan.setGroup("UD 20-11");
        bogdan.setDateReceipt("25/08/2020");
        System.out.print(bogdan.getFullName() + System.lineSeparator() + bogdan.getGroup() + System.lineSeparator() + bogdan.getDateReceipt());
    }
}
