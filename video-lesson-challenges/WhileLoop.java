public class WhileLoop {

    public static void main(String[] args) {
	// write your code here
        int number = 4;
        int finishNumber = 20;

        while (number <= finishNumber){
            number++;
            if (!isEvenNumber(number)){
                continue;
            }
            System.out.println("Even number " + number);
        }
    }

    public static boolean isEvenNumber(int number){
        return number % 2 == 0;
    }
}
