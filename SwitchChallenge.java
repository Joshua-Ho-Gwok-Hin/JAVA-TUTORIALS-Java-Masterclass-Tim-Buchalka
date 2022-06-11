public class SwitchChallenge {

    public static void main(String[] args) {
	// write your code here
        char switchChallange = 'D';

        switch (switchChallange){
            case 'A':
                System.out.println("Value is A");
                break;
            case 'B':
                System.out.println("Value is B");
                break;
            case 'C': case 'D': case 'E':
                System.out.println("Value is " + switchChallange);
                break;
            default:
                System.out.println("Value is not A, B, C, D or E");
                break;

        }
    }

}
