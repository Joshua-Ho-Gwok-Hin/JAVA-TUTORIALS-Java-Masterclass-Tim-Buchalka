public class DoWhileLoopChallenge {

    public static void main(String[] args) {

        int number = 5;
        int finishNumber = 55;
        int count = 0;

        System.out.println("The first five even numbers between " +
                number + " and " +
                finishNumber + " are as follows: ");

        while (number<=finishNumber){
            number++;
            if (!isEvenNumber(number)){
                continue;
            }else {
                count++;
                if (count <= 5){
                System.out.println(number);
                }
            }
        }
        System.out.println("There are a total of " +
                count + " EVEN numbers between " +
                number + " and " +
                finishNumber + ".");
    }

    public static boolean isEvenNumber(int number){
        return (number % 2 == 0);
    }
}
