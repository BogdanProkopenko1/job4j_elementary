package ru.job4j.ex;

public class ElementNotFoundException extends Exception {

    public static int indexOf(String[] value, String key) throws ElementNotFoundException {
        int rsl = -1;
        for (int i = 0; i < value.length; i++) {
            if (value[i].equals(key)) {
                rsl = i;
            }
        }
        return rsl;
    }

    public static void main(String[] args) {
        try {
            String[] words = {"Mouse", "Dog", "Cat"};
            indexOf(words, "PC");
        } catch (ElementNotFoundException e) {
            e.printStackTrace();
        }
    }
}
