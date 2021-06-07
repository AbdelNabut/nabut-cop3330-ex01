/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 abdel nabut
 */

package org.example;
import java.util.Scanner;

public class App
{
    public static void main( String[] args )
    {
        Scanner input = new Scanner(System.in);
        System.out.print( "What is your name? ");
        String name = input.next();
        String greeting = "Hello, " + name + ", nice to meet you!";
        System.out.printf( "%s", greeting);
    }
}

//Challenge 1
/*public class App
{
    public static void main( String[] args )
    {
        System.out.print( "What is your name? ");
        System.out.printf("Hello, " + new Scanner(System.in).next() + ", nice to meet you!");
    }
}*/
