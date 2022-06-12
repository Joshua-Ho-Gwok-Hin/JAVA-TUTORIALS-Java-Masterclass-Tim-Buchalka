public class _04_LeapYear {

    public static void main(String[] args) {

        System.out.println(_04_LeapYear.isLeapYear(1600));
        System.out.println(_04_LeapYear.isLeapYear(2000));
        System.out.println(_04_LeapYear.isLeapYear(1800));
        System.out.println(_04_LeapYear.isLeapYear(2013));
        System.out.println(_04_LeapYear.isLeapYear(2014));
        System.out.println(_04_LeapYear.isLeapYear(2015));
        System.out.println(_04_LeapYear.isLeapYear(2016));
        System.out.println(_04_LeapYear.isLeapYear(2017));
        System.out.println(_04_LeapYear.isLeapYear(2018));
        System.out.println(_04_LeapYear.isLeapYear(2024));
        System.out.println(_04_LeapYear.isLeapYear(2025));
        System.out.println(_04_LeapYear.isLeapYear(2026));
        System.out.println(_04_LeapYear.isLeapYear(2027));
        System.out.println(_04_LeapYear.isLeapYear(2028));
        System.out.println(_04_LeapYear.isLeapYear(2029));
        System.out.println(_04_LeapYear.isLeapYear(2030));
    }

    public static boolean isLeapYear(int year){
        if (1 <= year && year <= 9999){
            return (year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0);
        }
        return false;
    }
}
