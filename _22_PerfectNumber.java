public class _22_PerfectNumber {
    public static void main(String[] args) {
        System.out.println(isPerfectNumber(6));
        System.out.println(isPerfectNumber(28));
        System.out.println(isPerfectNumber(5));
        System.out.println(isPerfectNumber(-1));
    }

    public static boolean isPerfectNumber(int number) {
        if (number < 1){
            return false;
        }

        int divisor = 1;
        int sum = 0;
        while (divisor < number){
            if (number % divisor == 0){
                System.out.println(divisor);
                sum += divisor;
                if (sum == number){
                    System.out.println(sum + " " + number);
                    return true;
                }
            }
            divisor++;
        }
        return false;
    }
}
