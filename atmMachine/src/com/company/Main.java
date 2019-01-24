package com.company;

import java.util.Scanner;

public class Main {

    public static Scanner key = new Scanner(System.in);

    public static String checkID(String acctNum, String pwd) {

        String erMsg = "try again, Bro";
        String a = "1234 stinkyCheeseman 500.50";

        if (acctNum.equals(a.substring(0, a.indexOf(" "))) &&
                pwd.equals(a.substring(a.indexOf(" ")+1,a.lastIndexOf(" "))))
            return erMsg = a.substring(a.lastIndexOf(" ") + 1);

    return erMsg;}

    public static int menu() {

        int menuChoice;
        do {
            System.out.print("\n Please choose one of the following options, my dude" + "\n 1) Check Account Balance" + "\n 2) Deposit Funds" + "\n 3) Withdraw Funds" + "\n 4) Exit");
            menuChoice = key.nextInt();

            if(menuChoice <1 || menuChoice >4){
                System.out.print("try again, bro");
            }
        } while (menuChoice < 1 || menuChoice >4);
            return menuChoice;


    }

    public static void displayBalance (double x){
        System.out.printf("\n Balance: $%.2f", );
    }

    public static double deposit (double x, double y) {
        double depositAmt = y, currentBal = x;
        double newBalance = depositAmt + currentBal;

        System.out.printf("New Balance: $%.2f\n" , newBalance);
        return newBalance;

    }

    public static double withdraw (double x, double y) {

        double withdrawAmt = y, currentBal = x, newBalance;

        newBalance = currentBal - withdrawAmt;
        System.out.printf("New Balance: $%.2f", newBalance);

        return newBalance;
    }

    public static void main(String[] args){

        String acNum, pw, origBal = "error";
        int menuOption = 0;
        double depositAmt = 0, withdrawAmt = 0, currentBal =0;
        boolean signIn;

        do {
            signIn = false;
            System.out.println("Please enter account number: ");
            acNum = key.next();

            System.out.println("Please enter password: ");
            pw = key.next();

            origBal = checkID(acNum, pw);

        }while (origBal.equals("error"));

        currentBal=Double.parseDouble(origBal);

        while (menuOption != 4){

            menuOption=menu();
            switch (menuOption)
            {

                case 1:
                    displayBalance(currentBal);
                    break;
                case 2:
                    System.out.print("\n Please enter deposit amount: ");
                    depositAmt = key.nextDouble();
                    currentBal=deposit(depositAmt, currentBal);
                    break;
                case 3:
                    System.out.print("\n Please enter withdrawl amount: ");
                    withdrawAmt = key.nextDouble();

                    while (withdrawAmt>currentBal){
                        System.out.print("Insufficient Funds, let's be more reasonable");
                        withdrawAmt = key.nextDouble();
                    }

                    currentBal = withdraw(currentBal, withdrawAmt);
                    break;
                case 4:
                    System.out.print("\n Good Bye!");
                    System.exit(0);
                    break;
            }
        }

    }

}
