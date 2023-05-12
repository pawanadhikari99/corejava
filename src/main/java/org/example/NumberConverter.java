package org.example;

import java.util.ArrayList;
import java.util.Scanner;

public class NumberConverter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Ask the user for input
        System.out.print("Enter numbers separated by commas: ");
        String userInput = input.nextLine();

        // Convert the user input into an ArrayList
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        String[] inputArray = userInput.split(",");
        for (String number : inputArray) {
            numbers.add(Integer.parseInt(number.trim()));
        }

        // Print the ArrayList
        System.out.println("ArrayList: " + numbers);

        // Convert the ArrayList back to a string
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < numbers.size(); i++) {
            sb.append(numbers.get(i));
            if (i != numbers.size() - 1) {
                sb.append(", ");
            }
        }
        String output = sb.toString();

        // Print the string
        System.out.println("String: " + output);
    }
}
