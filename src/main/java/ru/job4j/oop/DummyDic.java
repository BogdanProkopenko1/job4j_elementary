package ru.job4j.oop;

public class DummyDic {

    public String engToRus(String eng) {
        String rsl = "Неизвестное слово " + eng;
        return rsl;
    }

    public static void main(String[] args) {
        DummyDic petty = new DummyDic();
        String result = petty.engToRus("Throw");
        System.out.println(result);
    }
}
