// Task №1 of Alex Shbeir

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter number of parentheses: ");
        int number = scan.nextInt();

        System.out.println(Skobki.getNumberOfParenthesesPairs(number));
    }
}

