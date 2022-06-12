public class _21_FactorPrinter {

    public static void printFactors(int number){
        if (number < 1){
            System.out.println("Invalid Value");
        }

        int divisor = 1;
        while (divisor <= number){
            if (number % divisor == 0){
                System.out.print(divisor + " ");
            }
            divisor++;
        }
    }

    public static void main(String[] args) {
        printFactors(6);
        System.out.println();
        printFactors(32);
        System.out.println();
        printFactors(10);
        System.out.println();
        printFactors(-1);
    }
}
