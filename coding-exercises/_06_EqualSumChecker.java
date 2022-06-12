public class _06_EqualSumChecker {

    public static void main(String[] args) {
        System.out.println(_06_EqualSumChecker.hasEqualSum(1, 1, 1)); // false
        System.out.println(_06_EqualSumChecker.hasEqualSum(1, 1, 2)); // true
        System.out.println(_06_EqualSumChecker.hasEqualSum(1, -1, 0)); // true
    }

    public static boolean hasEqualSum(int i, int j, int k) {
        return k == i + j;
    }
}
