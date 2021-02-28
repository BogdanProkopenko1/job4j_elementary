package ru.job4j.condition;

public class DummyBot {

    public static String answer(String question) {
        String rsl = "Это ставит меня в тупик. Задайте другой вопрос.";

        if ("Привет, Бот.".equals(question)) {
            rsl = "Привет, умник.";
        }
        if ("Пока.".equals(question)) {
            rsl = "До скорой встречи.";
        }
        return rsl;
    }

    public static void main(String[] args) {
        String result = answer("Привет, Бот.");
        System.out.println(result);

        result = answer("Как тебя зовут?");
        System.out.println(result);

        result = answer("Пока.");
        System.out.println(result);

    }
}
