package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner numb = new Scanner (System.in);

        String number;
        System.out.print("Please enter a number, friend.");
        number = numb.next();
        Integer inputNumber = Integer.valueOf(number);

        if (inputNumber % 2 == 0) {
            System.out.print("This is an even number!");}

            else if (inputNumber % 2 != 0)
        {System.out.print("This is an odd number!");}
        }

    }

