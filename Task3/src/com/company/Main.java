package com.company;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.SplittableRandom;

public class Main {

    public static void main(String[] args) {
        int[] myArray = getArray();
        for (int i = 0; i < myArray.length; i++) {;
            System.out.println(myArray[i]);
        }
        Scanner myObj = new Scanner(System.in);
            System.out.print("Enter 3:");

            // Numerical input
            int number = myObj.nextInt();
            if (number == 3) {
                ArrayList<Integer> resultArray = resultArray(myArray);
                for (int i : resultArray) {
                    System.out.println(i);
                }
            }
            else {
                System.out.println("wrong number. Enter 3");
            }
            System.out.print(getArray());


    }

    public static int[] getArray() {
        SplittableRandom rand = new SplittableRandom();
        int[] array = new int[10];
        for (int i = 0; i < array.length; i++) {
            array[i] = rand.nextInt(-100, 100);
        }
        return array;
    }



        public static ArrayList<Integer> resultArray(int[] array) {
            ArrayList<Integer> result = new ArrayList<>();
            for (int var : array) {
                if (var % 3 == 0) {
                    result.add(var);
                }

            }
            return result;
        }
    }