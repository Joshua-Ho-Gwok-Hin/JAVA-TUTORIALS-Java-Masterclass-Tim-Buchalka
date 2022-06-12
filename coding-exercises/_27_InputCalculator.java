import java.util.Scanner;

public class _27_InputCalculator {


    public static void inputThenPrintSumAndAverage(){
        int sum = 0;
        int counter = 0;

        Scanner scanner = new Scanner(System.in);

        while (true){

            boolean isAnInt = scanner.hasNextInt();

            if (isAnInt){
                int number = scanner.nextInt();
                counter++;
                sum += number;
            }else {
                break;
            }
        }
        int average = (int) Math.round((double) sum / counter);
        System.out.println("SUM = " + sum + " AVG = " + average);
        scanner.close();
    }

    public static void main(String[] args) {
        inputThenPrintSumAndAverage();
    }
}
