package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        while(true){
            System.out.println("Enter the number:");

            // Numerical input
            int number = myObj.nextInt();
            System.out.println(result(number));
        }




    }

    public static String result(int number) {
        String str = "";
        if (number > 7) {
            str = "Привет";
        } else if (number < 7) {
            str = "Попробуй ещё раз";
        } else if (number == 7) {
            str = "Уже близко";
        }
        return str;
    }

}