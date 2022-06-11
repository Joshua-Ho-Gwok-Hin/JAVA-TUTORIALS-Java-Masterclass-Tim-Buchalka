public class _23_NumberToWords {

    public static void numberToWords(int number) {
        int originalNumber = number;
        number = reverse(number);
        if (number < 0) {
            System.out.println("Invalid Value");
        }
        int count = 0;
        int computeNumber = number;
        while (computeNumber > 0) {
            int remainder = computeNumber % 10;
            computeNumber /= 10;
            count++;

            switch (remainder) {
                case 1:
                    System.out.println("One");
                    continue;
                case 2:
                    System.out.println("Two");
                    continue;
                case 3:
                    System.out.println("Three");
                    continue;
                case 4:
                    System.out.println("Four");
                    continue;
                case 5:
                    System.out.println("Five");
                    continue;
                case 6:
                    System.out.println("Six");
                    continue;
                case 7:
                    System.out.println("Seven");
                    continue;
                case 8:
                    System.out.println("Eight");
                    continue;
                case 9:
                    System.out.println("Nine");
                    continue;
                case 0:
                    System.out.println("Zero");
            }
        }
        while (count < getDigitCount(originalNumber)) {
            System.out.println("Zero");
            count++;
        }
    }

    public static int getDigitCount(int number) {
        if (number < 0) {
            return -1;
        }
        int count = 1;
        while (number > 9) {
            number = number / 10;
            count++;
        }
        return count;
    }

    public static int reverse(int number) {
        int j = 0;
        int i = 1; // count
        int m; // remainder
        int k = number;

        if (number < 0) {
            int num = Math.abs(number);
            while (i <= getDigitCount(num)) {
                i++;
                j = j * 10;
                m = k % 10;
                k = k / 10;
                j = j + m;
            }

        } else {
            while (i <= getDigitCount(number)) {
                i++;
                j = j * 10;
                m = k % 10;
                k = k / 10;
                j = j + m;
            }
        }
        return j;
    }

    public static void main(String[] args) {
        System.out.println(getDigitCount(0));
        System.out.println(getDigitCount(123));
        System.out.println(getDigitCount(-12));
        System.out.println(getDigitCount(1234560));
        System.out.println(reverse(-121));
        System.out.println(reverse(1212));
        System.out.println(reverse(1234560));
        System.out.println(reverse(100));
        numberToWords(123);
        numberToWords(1010);
        numberToWords(120010);
        numberToWords(-12);
    }
}
