public class _05_DecimalComparator {

    public static void main(String[] args) {
        System.out.println(_05_DecimalComparator.areEqualByThreeDecimalPlaces(-3.1756, -3.175));
        System.out.println(_05_DecimalComparator.areEqualByThreeDecimalPlaces(3.175, 3.176));
        System.out.println(_05_DecimalComparator.areEqualByThreeDecimalPlaces(3.0, 3.0));
        System.out.println(_05_DecimalComparator.areEqualByThreeDecimalPlaces(-3.123, 3.123));
    }

    public static boolean areEqualByThreeDecimalPlaces(double i, double j) {

        return (int) (j * 1000) == (int) (i * 1000);
    }
}
