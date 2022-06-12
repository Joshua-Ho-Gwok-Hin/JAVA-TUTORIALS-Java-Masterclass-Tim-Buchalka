import java.util.Scanner;

public class ReadingUserInputChallenge {
    public static void main(String[] args) {
        int sum=0;
        int counter=0;

        Scanner scanner = new Scanner(System.in);

        while(true){
            int order = counter + 1;
            System.out.println("Enter number #" + order);
            boolean isAnInt = scanner.hasNextInt();

            if (isAnInt){
                counter++;
                int number=scanner.nextInt();
                sum += number;
                if (counter==10){
                    break;
                }

            }else {
                System.out.println("Invalid Number");
            }
            scanner.nextLine();
        }
        System.out.println(sum);
        scanner.close();
    }
}
