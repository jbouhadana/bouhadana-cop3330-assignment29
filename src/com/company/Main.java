/*
 *  UCF COP3330 Summer 2021 Assignment 29 Solution
 *  Copyright 2021 Jeremy Bouhadana
 */
package com.company;
import java.util.Scanner;

public class Main {
    static void handlingInput() {
        String input;
        Scanner jb = new Scanner(System.in);
        System.out.print("What is the rate of return? ");
        input = jb.nextLine();
        char[] sonk = input.toCharArray();
        for(int i = 0; i < input.length(); i++) {

            while(Character.isLetter(input.charAt(i)) || input.charAt(i) == '0') {
                System.out.print("Sorry. That's not a valid input.\n" + "What is the rate of return? ");
                input = jb.nextLine();

                if(!Character.isLetter(input.charAt(i)) || input.charAt(i) != '0') {
                    int rateOfReturn = Integer.parseInt(input);
                    int calc = 72 / rateOfReturn;

                    if(rateOfReturn > 0) {
                        System.out.print("It will take  " + calc + " years to double your initial investment.");
                    } } } } }
    public static void main(String[] args) {
        handlingInput();
    }
}
