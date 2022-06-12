public class DigitSumChallenge {
    public static void main(String[] args) {
        System.out.println(sumDigits(678));
        System.out.println(sumDigits(125));
        System.out.println(sumDigits(-125));
        System.out.println(sumDigits(4));
        System.out.println(sumDigits(32123));
    }

    private static int sumDigits(int number) {
        if (number < 10){
            return -1;
        }
        else {
            int sum = 0;
            while (number > 0){
                int digit = number % 10;
                sum += digit;
                number /= 10;
            }
            return sum;
        }
    }
}
