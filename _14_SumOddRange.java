public class _14_SumOddRange {

    public static void main(String[] args) {
        System.out.println(_14_SumOddRange.isOdd(0));
        System.out.println(_14_SumOddRange.isOdd(2));
        System.out.println(_14_SumOddRange.isOdd(3));
        System.out.println(_14_SumOddRange.isOdd(4));
        System.out.println(_14_SumOddRange.isOdd(5));
        System.out.println(_14_SumOddRange.sumOdd(1,100));
        System.out.println(_14_SumOddRange.sumOdd(-1,100));
        System.out.println(_14_SumOddRange.sumOdd(100,100));
        System.out.println(_14_SumOddRange.sumOdd(13,13));
        System.out.println(_14_SumOddRange.sumOdd(100,-100));
        System.out.println(_14_SumOddRange.sumOdd(100,1000));
    }

    public static boolean isOdd(int number) {
        return ( 0 <=number) && (number % 2 != 0);
    }

    public static int sumOdd(int start, int end) {
        int sum=0;

        if ((start<0)||(end<0)||(end<start)){
            return -1;
        }
        for (int i=start;i<=end;i++){
            if (isOdd(i)){
                sum += i;
            }
        }
        return sum;
    }
}
