import java.util.Scanner;

class ParenthesesCounter {
    public static void getResultOfPairs(){
        System.out.println("The result is " + getNumberOfParenthesesPairs(getInput()));
    }

    static int  getInput(){
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter number of parentheses: ");
        int number = scan.nextInt();

        return number;
    }

    static int getNumberOfParenthesesPairs(int number){
        final int MIN_NUMBER = 0, NUMBER_SERIES = 1;
        int resultOfPairs = 0;

        if(number == MIN_NUMBER){
            return NUMBER_SERIES;
        }

        for (int i = 0; i < number; i++) {
            resultOfPairs += getNumberOfParenthesesPairs(i) * getNumberOfParenthesesPairs((number - 1) - i);
        }

        return resultOfPairs;
    }
}
