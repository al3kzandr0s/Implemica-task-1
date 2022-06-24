import java.util.Scanner;

// the engine of the code
class ParenthesesCounter {
    // method that calls & prints out the result
    public static void getResultOfPairs(){
        System.out.println("The result is " + getNumberOfParenthesesPairs(getInputOfParentheses()));
    }

    // method that asks for user input (the number of parentheses) & returns it
    // the input is always an integer and is always a positive number
    static int  getInputOfParentheses(){
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the number of parentheses: ");
        int numberOfParentheses = scan.nextInt();

        return numberOfParentheses;
    }

    // the method that counts the number of right parentheses pairs
    // & returns the result
    static int getNumberOfParenthesesPairs(int number){
        final int MIN_NUMBER = 0, NUMBER_SERIES = 1;
        int resultOfPairs = 0;

        if(number == MIN_NUMBER){
            return NUMBER_SERIES;
        }

        // The result will be computed using dynamic programming.
        // Let 'resultOfPairs' be the number of regular bracket sequences with 'number' pairs of brackets.
        // Because there is a BBS (balanced bracket sequence) inside the pair,
        // and also, after the pair, there is a BBS.
        // So to compute 'resultOfPairs', we will look at how many balanced sequences of 'i' pairs
        // of brackets are inside this first bracket pair, and how many balanced sequences with
        // '(number - 1) - i' pairs are after this pair.
        // Consequently, the formula (in pseudocode) has the form:
        // resultOfPairs(number) = Σ resultOfPairs(i) * resultOfPairs((number - 1) - i)
        for (int i = 0; i < number; i++) {
            resultOfPairs += getNumberOfParenthesesPairs(i) * getNumberOfParenthesesPairs((number - 1) - i);
        }

        return resultOfPairs;
    }
}


