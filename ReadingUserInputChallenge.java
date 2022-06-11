import java.util.Scanner;

public class ReadingUserInputChallenge {
    public static void main(String[] args) {
        int counter = 0;
        int sum = 0;
        Scanner scanner = new Scanner(System.in);

        while (counter<10){
            int order = counter +1;
            System.out.println("Enter number #" + order + ":");

            boolean isAnInt = scanner.hasNextInt();

            if (isAnInt){
                int number = scanner.nextInt();
                counter++;
                sum += number;
            }else {
                System.out.println("Invalid number");
            }
            scanner.nextLine();
        }
        System.out.println("sum = " + sum);
        scanner.close();
    }
}
//    int i=0;
//    int sum = 0;
//
//        while (i<10){
//        System.out.println("Please enter number:");
//        Scanner scanInt = new Scanner(System.in);
//        boolean hasNextInteger = scanInt.hasNextInt();
//        int number = scanInt.nextInt();
//
//        if ((hasNextInteger)&&(0<number)&&(number<100)){
//        sum += number;
//        scanInt.nextLine();
//        System.out.println(sum);
//        }else {
//        System.out.println("Please enter a number");
//        }
//        i++;
//        }