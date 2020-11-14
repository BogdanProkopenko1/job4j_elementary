package ru.job4j.condition;

public class AlertDivByZero {
    public static void main(String[] args) {
        possibleDiv(4);
        possibleDiv(0);
        possibleDiv(-5);
    }

    public static void possibleDiv(int number) {
        if (number == 0) {
            System.out.println(number + " Could not div by 0.");
        }
        if (number < 0) {
            System.out.println(number + " This is negative numbers");
        }
        if (number > 0) {
            System.out.println(number + " This is positive numbers");
        }
    }
}
