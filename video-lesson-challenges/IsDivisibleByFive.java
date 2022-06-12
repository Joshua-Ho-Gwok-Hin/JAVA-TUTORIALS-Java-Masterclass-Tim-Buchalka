public class IsDivisibleByFive {
    public static void main(String[] args) {
        System.out.println(isDivisbleBy5(1));
        System.out.println(isDivisbleBy5(5));
        System.out.println(isDivisbleBy5(7));
        System.out.println(isDivisbleBy5(8));
        System.out.println(isDivisbleBy5(9));
        System.out.println(isDivisbleBy5(10));
        System.out.println(isDivisbleBy5(15));
        System.out.println(isDivisbleBy5(20));
    }

    private static boolean isDivisbleBy5(int number) {
        return number%5==0;
    }
}
