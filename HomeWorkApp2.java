package ru.geekbrains.lesson2;

public class HomeWorkApp2 {
    public static void main(String[] args) {
        System.out.println(checkSum(5,15));
        printV(40);
        System.out.println(minus(10));
        printZ("Все Будет Хорошо", 10);
        System.out.println(vis(2022));
    }
    public static boolean checkSum(int a, int b) {
        int c = a + b;
        if (c >= 10 && c <= 20) {
            return true;
        } else {
            return false;
        }
    }
    public static void printV(int a) {
        if (a >= 0) {
            System.out.println("Положительное число");
        } else {
            System.out.println("Отрицательное число");
        }
    }
    public static boolean minus(int a) {
        if (a < 0) {
            return true;
        } else {
            return false;
        }
    }
    public static void printZ(String s, int a) {
        for (int i = 1; i<=a; i++) {
            System.out.println(s);
        }
    }
    public static boolean vis(int a) {
        if (a % 4 != 0) {
            return false;
        } else if (a % 100 == 0) {
            if (a % 400 == 0) {
                return true;
            } else {
                return false;
            }
        } else {
            return true;
        }
    }
}
