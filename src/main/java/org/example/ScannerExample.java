package org.example; //DO NOT DELETE
import java.util.Scanner;
public class ScannerExample {

  public static void main (String[] args) {

  Scanner input = new Scanner(System.in);
    System.out.print("Enter the number of gallons: ");
    double gallons = input.nextInt();
    System.out.print("In 4 gallons there are: ");
    System.out.println(gallons * 4 + " quarts");
    System.out.println((gallons * 4)*2 + " pints");
    System.out.println(((gallons * 4)*2)*2 + " cups");
    System.out.println((((gallons * 4)*2)*2)*16 + " tablespoons");


  }
}