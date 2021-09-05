/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Thomas Wallsmith
 *
 *  EXERCISE #3 - Printing Quotes
 *      Quotation marks are often used to denote the start and end of a string. But sometimes we need to print out the
 *      quotation marks themselves by using escape characters.
 *
 *      Create a program that prompts for a quote and an author. Display the quotation and author as shown in the
 *      example output.
 *
 *      CONSTRAINTS
 *          - use a single output statement to produce this output, using appropriate string-escaping techniques for
 *            quotes.
 *          - if your language supports string interpolation or string substitution, don't use it for this exercise.
 *            Use string concatenation instead.
 *              - e.g. use println() instead of printf()
 *
 *      EXAMPLE OUTPUT
 *          - What is the quote? These aren't the droids you're looking for.
 *          - Who said it? Obi-Wan Kenobi
 *          - Obi-Wan Kenobi says, "These aren't the droids you're looking for."
 */


import java.util.Scanner;

public class Solution03 {
    public static void main(String[] args){
        Scanner stringScanner = new Scanner(System.in);
        String quote;
        String author;

        System.out.println("What is the quote? ");
        quote = stringScanner.nextLine();
        System.out.println("Who said it? ");
        author = stringScanner.nextLine();
        System.out.println(author+" says, \""+quote+"\"");
    }
}
