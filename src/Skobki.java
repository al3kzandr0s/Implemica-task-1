class Skobki {
    static int getNumberOfParenthesesPairs(int number){
        final int MIN_NUMBER = 0, NUMBER_SERIES = 1;
        int sum = 0;

        if(number == MIN_NUMBER){
            return NUMBER_SERIES;
        }

        for (int i = 0; i < number; i++) {
            sum += getNumberOfParenthesesPairs(i) * getNumberOfParenthesesPairs((number - 1) - i);
        }
        return sum;
    }
}
