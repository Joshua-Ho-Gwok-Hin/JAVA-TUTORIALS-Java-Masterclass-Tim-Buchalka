public class FizzBuzzQuiz {
    public static void main(String[] args) {
        int number = 1;
        while (number<31){
            if ((number%3==0)&&(number%15!=0)){
                System.out.println("Fizz");
            }else if((number%5==0)&&(number%15!=0)){
                System.out.println("Buzz");
            }else if (number%15==0){
                System.out.println("FizzBuzz");
            }
            else {
                System.out.println(number);
            }
            number++;
        }



    }
}
