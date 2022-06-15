public class _16_FirstLastDigitSum {

    public static int sumFirstAndLastDigit(int number) {

        if (number < 0){
            return -1;
        }
        
        int lastDigit = number % 10;
        int firstDigit = 0;
        int num;
        
        while (number > 0){
            num = number % 10;
            number /= 10;
            firstDigit = num;
        }
        return firstDigit + lastDigit;
    }

    public static void main(String[] args) {

        System.out.println(sumFirstAndLastDigit(252));
        System.out.println(sumFirstAndLastDigit(257));
        System.out.println(sumFirstAndLastDigit(0));
        System.out.println(sumFirstAndLastDigit(5));
        System.out.println(sumFirstAndLastDigit(-10));
    }


}
