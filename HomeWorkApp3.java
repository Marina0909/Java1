package ru.geekbrains.lesson3;

import java.util.Arrays;
import java.util.Random;

public class HomeWorkApp3 {
    public static void main(String args[]) {

        // 1
        int[] arrz1 = {1,1,1,0,1,0,1,0,0,1,0,1,1,0};
        System.out.println("***** 1");
        System.out.println(Arrays.toString(arrz1));
        for(int i = 0; i < arrz1.length; i++) {
            if (arrz1[i] == 0) {
                arrz1[i] = 1;
            } else {
                arrz1[i] = 0;
            }
        }
        System.out.println(Arrays.toString(arrz1));

        // 2
        int[] arrz2 = new int[100];
        for(int i = 0; i < arrz2.length; i++) {
            arrz2[i] = i + 1;
        }
        System.out.println("***** 2");
        System.out.println(Arrays.toString(arrz2));

        // 3
        int[] arrz3 = { 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        System.out.println("***** 3");
        System.out.println(Arrays.toString(arrz3));
        for(int i = 0; i < arrz3.length; i++) {
            if (arrz3[i] < 6) {
                arrz3[i] *= 2;
            }
        }
        System.out.println(Arrays.toString(arrz3));

        // 4
        int[][] arrz4 = new int[10][10];

        System.out.println("***** 4");
        for(int i = 0; i < arrz4.length; i++) {
            for(int j = 0; j < arrz4[i].length; j++) {
                if( i == j || (i + j) == arrz4.length - 1 ) {
                    arrz4[i][j] = 1;
                }
            }
            System.out.println(Arrays.toString(arrz4[i]));
        }


        // 5
        int[] arrz5 = newArr(7, 12);

        System.out.println("***** 5");
        System.out.println(Arrays.toString(arrz5));

        // 6
        Random random = new Random();
        int[] randomArray = new int[20];
        int max = 0;
        int min = 0;
        for (int i = 0; i < randomArray.length; i++){
            randomArray[i] = random.nextInt(1000);
            if(max < randomArray[i] || i == 0 ){
                max = randomArray[i];
            }
            if(min > randomArray[i] || i == 0){
                min = randomArray[i];
            }
        }
        System.out.println("***** 6");
        System.out.println(Arrays.toString(randomArray));
        System.out.println("min = " + min + ";   max = " + max);

        // 7
        int [] arrCh = {2,2,2,1,2,2,10,1};
        System.out.println("***** 7");
        boolean rCheck = checkBalance(arrCh);
        System.out.println(rCheck);

    }
    // 5
    public static int[] newArr(int len, int initialValue){
        int[] arrz = new int[len];
        for(int i = 0; i < len; i++) {
            arrz[i] = initialValue;
        }
        return arrz;
    }

    // 7
    public static boolean checkBalance(int[] arr) {
        int sum1, sum2;

        for (int i = 1; i < arr.length; i++) {
            sum1 = 0;
            sum2 = 0;

            for (int j = 0; j < i; j++) {
                sum1 += arr[j];
            }
            for (int j = i; j < arr.length; j++) {
                sum2 += arr[j];
            }
            if (sum1 == sum2) {
                return true;
            }
        }
        return false;
    }



}
