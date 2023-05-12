package org.example;

import java.util.Scanner;

public class Converter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean shouldQuit = false;

        while (!shouldQuit) {
            System.out.println("Please choose an option:");
            System.out.println("1. Convert Celsius to Fahrenheit");
            System.out.println("2. Convert Fahrenheit to Celsius");
            System.out.println("3. Convert Kilometers to Miles");
            System.out.println("4. Convert Miles to Kilometers");
            System.out.println("Type 'quit' to exit the program");

            String choice = scanner.nextLine();

            if (choice.equalsIgnoreCase("quit")) {
                shouldQuit = true;
            } else {
                switch (choice) {
                    case "1":
                        System.out.println("Enter a temperature in Celsius:");
                        double celsius = Double.parseDouble(scanner.nextLine());
                        double fahrenheit = celsius * 9 / 5 + 32;
                        System.out.println(celsius + " degrees Celsius is equal to " + fahrenheit + " degrees Fahrenheit");
                        break;
                    case "2":
                        System.out.println("Enter a temperature in Fahrenheit:");
                        double fahrenheit2 = Double.parseDouble(scanner.nextLine());
                        double celsius2 = (fahrenheit2 - 32) * 5 / 9;
                        System.out.println(fahrenheit2 + " degrees Fahrenheit is equal to " + celsius2 + " degrees Celsius");
                        break;
                    case "3":
                        System.out.println("Enter a distance in kilometers:");
                        double kilometers = Double.parseDouble(scanner.nextLine());
                        double miles = kilometers / 1.609;
                        System.out.println(kilometers + " kilometers is equal to " + miles + " miles");
                        break;
                    case "4":
                        System.out.println("Enter a distance in miles:");
                        double miles2 = Double.parseDouble(scanner.nextLine());
                        double kilometers2 = miles2 * 1.609;
                        System.out.println(miles2 + " miles is equal to " + kilometers2 + " kilometers");
                        break;
                    default:
                        System.out.println("Invalid choice. Please try again.");
                        break;
                }
            }
        }
    }
}
