package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        while(true){
            System.out.println("Enter the name:");

            // Numerical input
            String name = myObj.next();
            System.out.println(result(name));
        }



    }

    public static String result(String name) {
        String result = name.toLowerCase();
        if (result.equals("вячеслав")) {
            result = "Привет, Вячеслав";
        } else {
            result = "Нет такого имени";
        }
        return result;
    }

}