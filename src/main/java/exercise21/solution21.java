/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Jorge Paez
 *
 * Pseudocode:
 * A program that will convert the numbers 1-12 the corresponding month.
 * If a number that is not 1-12 is entered, then a message will be prompted to correct the number.
 */
package exercise21;
import java.util.*;

public class solution21 {
    public String getMon(int mon){ //switch cases for user to enter 1-12, for the 12months
        return switch (mon) {
            case 1 -> "January";
            case 2 -> "Febuary";
            case 3 -> "March";
            case 4 -> "April";
            case 5 -> "May";
            case 6 -> "June";
            case 7 -> "July";
            case 8 -> "August";
            case 9 -> "September";
            case 10 -> "October";
            case 11 -> "November";
            case 12 -> "December";
            default -> "error"; //error message
        };
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); //user input
        solution21 var = new solution21(); //calling the name of class, makes program run

        System.out.print("Please enter the number of month: \n");
        int mon = sc.nextInt();

        String end = var.getMon(mon); //calls the cases
        if(mon>0 && mon<12) //for the months
            System.out.print("The name of month is "+ end);
        else //if a number that is not 1-12 is entered
            System.out.print(end +" :Please enter correct month number");

    }
}

