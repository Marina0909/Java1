package ru.geekbrains.lesson1;

public class HomeWorkApp {
    public static void main(String[] args) {
        intThreeWord();
        checkSumSign();
        printColor ();
        compareNumbers();
}
    public static void intThreeWord() {
        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");
    }
    public static void checkSumSign() {
        int a, b, c;
        a = 12;
        b = -9;
        c = a + b;
        if (c >= 0) {
            System.out.println("Сумма положительная");
        } else {
            System.out.println("Сумма отрицательная");
        }
    }
    public static void printColor () {
        int value;
        value = -122;
        if (value <= 0) {
            System.out.println("Красный");
        } else {
            if (value <= 100) {
                System.out.println("Желтый");
            } else {
                System.out.println("Зеленый");
            }
        }

    }
    public static void compareNumbers() {
        int a, b;
        a = -12;
        b = -9;
        if (a >= b) {
            System.out.println("a >= b");
        } else {
            System.out.println("a < b");
        }
    }
}