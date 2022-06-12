public class PrimeNumberChallenge {

    public static void main(String[] args) {

        int numberOfPrime=0;
        for (int i=51;i<101;i++){
            if (isPrime(i)){
                numberOfPrime++;
                System.out.println(i + " is a Prime Number");
                if (numberOfPrime==3){
                    System.out.println("Exiting For loop");
                    break;
                }
            }
        }
    }

    public static boolean isPrime(int n){
        if ((n==1)||(n==0)){
            return false;
        }else {
            for (int i=2; i<=(n/2); i++){
                if (n%i==0){
                    return false;
                }
            }
            return true;
        }
    }
}
