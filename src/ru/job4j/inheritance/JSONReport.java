package ru.job4j.inheritance;

public class JSONReport extends TextReport {
    public static void main(String[] args) {
        JSONReport report = new JSONReport();
        String rsl = report.generate("error", "404");
        System.out.println(rsl);
    }
}
