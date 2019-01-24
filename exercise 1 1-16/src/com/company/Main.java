package com.company;

public class Main {

    public static void main(String[] args) {
        int total=0;
        for (int numbers = 0; numbers <= 1000; numbers++)

            if(numbers%3==0 || numbers%5==0) {
                total += numbers;
            }
        {System.out.println(total);}
    }
}