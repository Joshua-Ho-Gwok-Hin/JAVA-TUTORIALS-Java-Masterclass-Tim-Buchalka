import java.util.Arrays;

public class _43_ReverseArray {

    private static void reverse(int[] array) {
        System.out.println("Array = " + Arrays.toString(array));
        for (int i = 0; i < (array.length/2); i++) {
            int temp = array[i];
            array[i] = array[array.length - 1 - i];
            array[array.length-1-i] = temp;
        }
        System.out.println("Reversed array = " + Arrays.toString(array));
    }

    public static void main(String[] args) {
        int[] test = new int[]{8, 7, 6, 5, 4, 3, 2, 1};
        reverse(test);
    }
}
