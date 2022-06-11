public class _09_MinutesToYearsDaysCalculator {

    public static final String INVALID_VALUE = "Invalid Value";

    public static void main(String[] args) {
        _09_MinutesToYearsDaysCalculator.printYearsAndDays(-525600);
        _09_MinutesToYearsDaysCalculator.printYearsAndDays(1051200);
        _09_MinutesToYearsDaysCalculator.printYearsAndDays(561600);
    }

    public static void printYearsAndDays(long minutes) {
        if (minutes < 0){
            System.out.println(INVALID_VALUE);
        } else {
            long hour = minutes / 60;
            long days = hour / 24;
            long years = days / 365;
            long remainingDays = days % 365;

            System.out.println(minutes + " min = " +
                    years + " y and " +
                    remainingDays + " d");
        }
    }
}
