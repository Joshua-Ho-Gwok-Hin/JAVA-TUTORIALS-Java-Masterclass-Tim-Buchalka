public class OperatorChallenge {

    public static void main(String[] args) {
	// write your code here
        double x = 20.00d;
        double y = 80.00d;
        double z = (x + y) * 100.00d;
        double w = z % 40.00d;
        boolean isZero = (w == 0) ? true:false;
        System.out.println("w can be divided by 40 = " + isZero);
        if (!isZero){
            System.out.println("Got some remainder");
        }


    }
}
