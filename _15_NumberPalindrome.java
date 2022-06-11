public class _15_NumberPalindrome {

    public static boolean isPalindrome(int number) {

        number = Math.abs(number);
        int reverse = 0;
        int i = number;
        while (number > 0) {
            int lastDigit = number % 10;
            number /= 10;
            reverse *= 10;
            reverse += lastDigit;
//            System.out.println("lastDigit = " + lastDigit);
//            System.out.println("number = " + number);
            System.out.println("reverse = "+ reverse);
        }

        return i == reverse;
    }

    public static void main(String[] args) {
        System.out.println(isPalindrome(123454321));
        System.out.println(isPalindrome(323454321));
//        System.out.println(isPalindrome(707));
//        System.out.println(isPalindrome(11212));
    }
}
