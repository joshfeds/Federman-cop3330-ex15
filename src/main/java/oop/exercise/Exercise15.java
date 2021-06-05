package oop.exercise;
import java.util.Scanner;
/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Joshua Federman

 * Create a simple program that validates user login credentials.
 * The program must prompt the user for a username and password.
 * The program should compare the password given by the user to a known password.
 * If the password matches, the program should display “Welcome!”
 * If it doesn’t match, the program should display “I don’t know you.”

Example Output
What is the password? 12345
I don't know you.
Or

What is the password? abc$123
Welcome!
Constraints
Use an if/else statement for this problem.
Make sure the program is case sensitive.*/
public class Exercise15
{
    static Scanner input = new Scanner(System.in);
    static final String REAL_PASSWORD = "LagCannon14";
    public static String getUsername() {
        System.out.print("What is the username?");
        return input.nextLine();
    }
    public static String getPassword() {
        System.out.print("What is the password?");
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

    }
}
