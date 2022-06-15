public class _25_LargestPrime {

    public static int getLargestPrime(int number) {
        int i;

        if (number < 2){
            return -1;
        }

        else {
            for (i=(number/2);i>1;i--){
                if ((number%i)==0){
                    number=i;
                }
            }
            return number;
        }
    }

    public static void main(String[] args) {
        System.out.println(getLargestPrime(21));    // 7
        System.out.println(getLargestPrime(217));   // 31
        System.out.println(getLargestPrime(0));     //
        System.out.println(getLargestPrime(45));    // 5
        System.out.println(getLargestPrime(-1));    //
    }
}
