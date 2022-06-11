public class _12_NumberInWord {

    public static void main(String[] args) {
        _12_NumberInWord.printNumberInWord(0);
        _12_NumberInWord.printNumberInWord(1);
        _12_NumberInWord.printNumberInWord(2);
        _12_NumberInWord.printNumberInWord(3);
        _12_NumberInWord.printNumberInWord(4);
        _12_NumberInWord.printNumberInWord(5);
        _12_NumberInWord.printNumberInWord(6);
        _12_NumberInWord.printNumberInWord(7);
        _12_NumberInWord.printNumberInWord(8);
        _12_NumberInWord.printNumberInWord(9);
        _12_NumberInWord.printNumberInWord(10);
    }
    
    public static void printNumberInWord(int number) {
        switch (number){
            case 0:
                System.out.println("Zero");
                break;
            case 1:
                System.out.println("ONE");
                break;
            case 2:
                System.out.println("TWO");
                break;
            case 3:
                System.out.println("THREE");
                break;
            case 4:
                System.out.println("FOUR");
                break;
            case 5:
                System.out.println("FIVE");
                break;
            case 6:
                System.out.println("SIX");
                break;
            case 7:
                System.out.println("SEVEN");
                break;
            case 8:
                System.out.println("EIGHT");
                break;
            case 9:
                System.out.println("NINE");
                break;
            default:
                System.out.println("OTHER");
                break;
        }
    }
}
