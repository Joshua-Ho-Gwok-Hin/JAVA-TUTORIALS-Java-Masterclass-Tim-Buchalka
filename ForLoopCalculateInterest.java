public class ForLoopCalculateInterest {

    public static void main(String[] args) {
	// write your code here
        for (int i=2; i < 9; i++){
            System.out.println(String.format("%.2f",calculateInterest(10000d, i)));
        }

        for (int i=9; 1 < i; i--){
            System.out.println(String.format("%.2f",calculateInterest(10000d, i)));
        }
    }

    public static double calculateInterest(double amount, double rate){
        if ((amount < 0) || (rate < 0)) {
            return -1.0;
        }else {
            double interest = (amount * (rate / 100));
            return interest;
        }
    }
}
