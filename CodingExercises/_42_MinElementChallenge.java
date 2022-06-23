import java.util.Scanner;

public class _42_MinElementChallenge {

    private static int readInteger() {
        Scanner scanner = new Scanner(System.in);
        int count = scanner.nextInt();
        scanner.nextLine();
        return count;
    }

    private static int[] readElements(int capacity) {
        Scanner scanner = new Scanner(System.in);
        int[] array = new int[capacity];
        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
        }
        return array;
    }

    private static int findMin(int[] array) {
        boolean flag = true;
        int minInteger = array[0];
        while (flag) {
            flag = false;
            for (int i = 0; i < array.length; i++) {
                if (minInteger > array[i]) {
                    minInteger = array[i];
                    flag = true;
                }
            }
        }
        return minInteger;
    }

    public static void main(String[] args) {
        int[] array = readElements(readInteger());
        System.out.println(findMin(array));
    }
}
