public class _13_NumberOfDaysInMonth {

    public static void main(String[] args) {
        System.out.println(_13_NumberOfDaysInMonth.isLeapYear(-1600));
        System.out.println(_13_NumberOfDaysInMonth.isLeapYear(1600));
        System.out.println(_13_NumberOfDaysInMonth.isLeapYear(2017));
        System.out.println(_13_NumberOfDaysInMonth.isLeapYear(2000));
        System.out.println(_13_NumberOfDaysInMonth.getDaysInMonth(1, 2020));
        System.out.println(_13_NumberOfDaysInMonth.getDaysInMonth(2, 2020));
        System.out.println(_13_NumberOfDaysInMonth.getDaysInMonth(2, 2018));
        System.out.println(_13_NumberOfDaysInMonth.getDaysInMonth(-1, 2020));
        System.out.println(_13_NumberOfDaysInMonth.getDaysInMonth(1, -2020));
    }

    public static boolean isLeapYear(int year) {
        if ((year < 1 || 9999 < year)) {
            return false;
        } else if ((year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0)) {
            return true;
        }
        return false;
    }

    public static int getDaysInMonth(int month, int year) {
        if (((month < 1) || (12 < month)) || ((year < 1) || (9999 < year))) {
            return -1;
        } else if (isLeapYear(year)) {
            switch (month) {
                case 1:
                case 3:
                case 5:
                case 7:
                case 8:
                case 10:
                case 12:
                    return 31;
                case 2:
                    return 29;
                default:
                    return 30;
            }
        } else {
            switch (month) {
                case 1:
                case 3:
                case 5:
                case 7:
                case 8:
                case 10:
                case 12:
                    return 31;
                case 2:
                    return 28;
                default:
                    return 30;
            }
        }
    }
}
