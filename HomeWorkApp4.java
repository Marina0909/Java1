package ru.geekbrains.lesson4;

import java.util.Random;
import java.util.Scanner;

public class HomeWorkApp4 {

    Random random;
    Scanner scanner;
    char[][] table;

    HomeWorkApp4(){
        table = new char[3][3];
        random = new Random();
        scanner = new Scanner(System.in);
    }

    public static void main(String[] args) {
        new HomeWorkApp4().game();
    }

    void game(){
        System.out.println("Game is started!");
        initTable();
        printTable();

        while(true){
            turnHuman();
            if(checkWin('x')){
                printTable();
                System.out.println("YOU WON!");
                break;
            }
            if(isTableFull()){
                System.out.println("DRAW!");
                break;
            }
            turnAI();
            printTable();
            if(checkWin('o')){
                //printTable();
                System.out.println("AI WON!");
                break;
            }
        }
    }

    boolean isTableFull() {
        for(int x = 0; x < 3; x++){
            for(int y = 0; y < 3; y++){
                if(table[x][y] == '.') return false;
            }
        }
        return true;
    }

    boolean checkWin(char symbol) {
        boolean viv;
        // string
        for(int x = 0; x < 3; x++) {
            int y = 0;
            viv = true;
            while (y < 3 && viv) {
                if (table[x][y] == symbol) {
                    y ++;
                } else viv = false;
            }
            if(viv) return true;
        }

        // column
        for(int y = 0; y < 3; y++) {
            int x = 0;
            viv = true;
            while (x < 3 && viv) {
                if (table[x][y] == symbol) {
                    x ++;
                } else viv = false;
            }
            if(viv) return true;
        }

        // diag
        int x = 0;
        viv = true;
        while (x < 3 && viv) {
            if (table[x][x] == symbol) {
                x ++;
            } else viv = false;
        }

        if(viv) return true;

        x = 0;
        viv = true;
        while (x < 3 && viv) {
            if (table[x][2-x] == symbol) {
                x ++;
            } else viv = false;
        }

        return viv;
    }

    void turnHuman() {
        int x, y;

        do{
            System.out.println("Enter x y from [0..2]");
            x = scanner.nextInt();
            y = scanner.nextInt();
            //System.out.println(x + ", " + y);
        } while (!isCellValid(x, y));
        table[x][y] = 'x';

    }

    boolean isCellValid(int x, int y){
        if(x < 0 || y < 0 || x > 2 || y > 2){
            return false;
        }
        return table[x][y] == '.';
    }

    void turnAI() {
        int x, y, k;
        // string
        for( x = 0; x < 3; x++) {
            y = 0;
            k = 99; // init
            while (y < 3) {
                if (table[x][y] == '.') {
                    if (k == 99) {
                        k = y;  // first point
                    } else {
                        k = 99;  // not only point
                        y = 3; // exit
                    }
                } else if (table[x][y] == 'o') {
                    k = 99;
                    y = 3; //exit
                }
                y++;
            }
            if (k < 3) {
                table[x][k] = 'o';
                return;
            }
        }
        // column
        for( y = 0; y < 3; y++) {
            x = 0;
            k = 99; // init
            while (x < 3 ) {
                if (table[x][y] == '.') {
                    if(k == 99){
                        k = x;  // first point
                    } else {
                        k = 99;  // not only point
                        x = 3; // exit
                    }
                } else if (table[x][y] == 'o') {
                    k = 99;
                    x = 3; //exit
                }
                x ++;
            }
            if(k < 3) {
                table[k][y] = 'o';
                return;
            }
        }

        // diagonals
        x = 0;
        k = 99;
        while (x < 3 ) {
            if (table[x][x] == '.') {
                if(k == 99){
                    k = x;  // first point
                } else {
                    k = 99;  // not only point
                    x = 3; // exit
                }
            } else if (table[x][x] == 'o') {
                k = 99;
                x = 3; //exit
            }
            x ++;
        }
        if(k < 3) {
            table[k][k] = 'o';
            return;
        }

        x = 0;
        k = 99;
        while (x < 3 ) {
            if (table[x][2 - x] == '.') {
                if(k == 99){
                    k = x;  // first point
                } else {
                    k = 99;  // not only point
                    x = 3; // exit
                }
            } else if (table[x][2 - x] == 'o') {
                k = 99;
                x = 3; //exit
            }
            x ++;
        }
        if(k < 3) {
            table[k][2 - k] = 'o';
            return;
        }

        // random
        do{
            x = random.nextInt(3);
            y = random.nextInt(3);
        } while (!isCellValid(x, y));
        table[x][y] = 'o';
    }

    void initTable(){
        for(int x = 0; x < 3; x++){
            for(int y = 0; y < 3; y++){
                table[x][y] = '.';
            }
        }
    }

    void printTable() {
        for(int x = 0; x < 3; x++){
            for(int y = 0; y < 3; y++){
                System.out.print(table[x][y] + " ");
            }
            System.out.println();
        }
    }
}
