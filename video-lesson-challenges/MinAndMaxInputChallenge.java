import java.util.Scanner;

public class MinAndMaxInputChallenge {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int min = 0;
        int max = 0;
        boolean first = true;

        while (true){

            System.out.println("Enter number:");
            boolean isValidNumber = scanner.hasNextInt();

            if (isValidNumber){
                int number = scanner.nextInt();

                if (first){
                    first = false;
                    min = number;
                    max = number;
                }

                if (max < number){
                    max = number;
                }

                if (number < min){
                    min = number;
                }

            }else {
                break;
            }
            scanner.nextLine();
        }
        System.out.println("The max number entered is " + max);
        System.out.println("The max number entered is " + min);
        scanner.close();
    }
}
