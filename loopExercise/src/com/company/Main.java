package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner number = new Scanner (System.in);

        String inputNum = "yes";
        do {

            boolean even = true;

            System.out.print("Please enter a number, my friend");
            inputNum = number.next();
            Integer inputNumInt = Integer.valueOf(inputNum);

            if (inputNumInt % 2 != 0) {
                even = false;
                System.out.print("This is an odd number.");
            } else if (inputNumInt % 2 == 0) ;
            even = true;
            {
                System.out.print("This is an even number.");
            }

            String yN;
            System.out.print("Would you like to enter another number?");
            yN = number.next();
            if (yN == "yes") {yesOrNo = true;};


        } while(inputNum == "yes");


    }
}
