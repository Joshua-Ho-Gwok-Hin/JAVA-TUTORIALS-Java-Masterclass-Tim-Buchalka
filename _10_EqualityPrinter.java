public class _10_EqualityPrinter {

    private static final String INVALID_VALUE = "Invalid Value";
    private static final String ALL_EQUAL = "All numbers are equal";
    private static final String ALL_DIFFERENT = "All numbers are different";
    private static final String NEITHER = "Neither all are equal or different";

    public static void main(String[] args) {
        _10_EqualityPrinter.printEqual(1, 1, 1);
        _10_EqualityPrinter.printEqual(1, 1, 2);
        _10_EqualityPrinter.printEqual(-1, -1, -1);
        _10_EqualityPrinter.printEqual(1, 2, 3);
    }

    public static void printEqual(int x, int y, int z) {
        if ((x < 0) || (y < 0) || (z < 0)){
            System.out.println(INVALID_VALUE);
        }else if ((x == y) && (y == z)){
            System.out.println(ALL_EQUAL);
        }else if ((x != y) && (x != z) && (y != z )){
            System.out.println(ALL_DIFFERENT);
        }else {
            System.out.println(NEITHER);
        }
    }
}
