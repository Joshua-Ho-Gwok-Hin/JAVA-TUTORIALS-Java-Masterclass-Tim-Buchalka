import java.util.Scanner;

public class _41_SortedArray {

    public static void main(String[] args) {

        int[] array = getIntegers(5);
        int[] sortedArray = sortIntegers(array);
        printArray(array);
    }


    public static int[] getIntegers(int capacity){

        Scanner scanner = new Scanner(System.in);

        int[] array = new int[capacity];
        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
        }
        return array;
    }

    public static int[] sortIntegers(int[] originalArray) {

        int[] sortedArray = new int[originalArray.length];
        for (int i = 0; i < originalArray.length; i++) {
            sortedArray[i] = originalArray[i];
        }

        boolean flag = true;
        while (flag) {
            flag = false;
            for (int i = 0; i < originalArray.length - 1; i++) {
                if (sortedArray[i] < sortedArray[i + 1]) {
                    int temp = sortedArray[i + 1];
                    sortedArray[i + 1] = sortedArray[i];
                    sortedArray[i] = temp;
                    flag = true;
                }
            }
        }
        return sortedArray;
    }

    public static void printArray(int[] array) {
        for (int i=0; i<array.length; i++)
            System.out.println("Element " + i + " contents " + array[i]);
    }
}
