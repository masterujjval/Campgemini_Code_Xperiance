<<<<<<< HEAD
// Java program for simple calculator
import java.io.*;
import java.lang.*;
import java.lang.Math;
import java.util.Scanner;
 
// Driver class
public class BasicCalculator {
    // main function
    public static void main(String[] args)
    {
    
          // Take input from the user
        Scanner sc = new Scanner(System.in);
 
        System.out.println("Enter the numbers:");
 
        // Take the inputs
        num1 = sc.nextDouble();
        num2 = sc.nextDouble();
 
        System.out.println("Enter the operator (+,-,*,/):");
 
        char op = sc.next().charAt(0);
        double o = 0;
 
        switch (op) {
        // case to add two numbers
        case '+':
            o = num1 + num2;
            break;

    // case to subtract two numbers
        case '-':
            o = num1 - num2;
            break;





    }
}

  
