package com.pluralsight;

import java.util.Scanner;

public class TextAnalyzer {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        /**
         * use string methods to count total characters, chars without spaces, and word count
         * find the first and last occurrence of a specific character using indexOf() and lastIndexOf()
         * check if text contains certain words using contain() method
         * extract the first and last word, and middle portion of that text using substring()
         * analyze text for upperCase and lowerCase letters
         * create a summary report with all findings using string concatenation
         * allow user to search for a specific word and report that word's position
         */

        System.out.print("Please enter a sentence or paragraph: ");
        String[] userParagraph = keyboard.nextLine().trim().split("\\.");

        System.out.println(userParagraph[0]);

    }
}
