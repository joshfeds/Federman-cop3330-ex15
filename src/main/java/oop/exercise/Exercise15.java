package oop.exercise;
import java.util.Scanner;
/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Joshua Federman
*/
public class Exercise15
{
    static Scanner input = new Scanner(System.in);
    static final String REAL_PASSWORD = "LagCannon86";

    public static String getUsername() {
        System.out.print("What is the username? ");
        return input.nextLine();
    }
    public static String getPassword() {
        System.out.print("What is the password? ");
        return input.nextLine();
    }
    public static void testPassword(String password) {
        if(password.equals(REAL_PASSWORD)){
            System.out.print("Welcome!");
        }
        else{
            System.out.print("I don't know you.");
        }
    }
    public static void main( String[] args ) {
        String username = getUsername();
        String password = getPassword();
        testPassword(password);
    }
}
