public class DayOfTheWeekChallenge {

    public static void main(String[] args) {
	// write your code here
        printDayOfTheWeek(0);
        printDayOfTheWeek(1);
        printDayOfTheWeek(2);
        printDayOfTheWeek(3);
        printDayOfTheWeek(4);
        printDayOfTheWeek(5);
        printDayOfTheWeek(6);
        anotherPrintDayOfTheWeek(0);
    }

    public static void printDayOfTheWeek(int day){

        switch (day){
            case 1:
                System.out.println("Day " + day + " is a Monday");
                break;
            case 2:
                System.out.println("Day " + day + " is a Tuesday");
                break;
            case 3:
                System.out.println("Day " + day + " is a Wednesday");
                break;
            case 4:
                System.out.println("Day " + day + " is a Thursday");
                break;
            case 5:
                System.out.println("Day " + day + " is a Friday");
                break;
            case 6:
                System.out.println("Day " + day + " is a Saturday");
                break;
            case 0:
                System.out.println("Day " + day + " is a Sunday");
                break;
            default:
                System.out.println("Day " + day + " is an invalid day");
                break;
        }
    }

    public static void anotherPrintDayOfTheWeek(int anotherDay){
        if (anotherDay == 1){
            System.out.println("Day " + anotherDay + " is a Monday");
        }else if (anotherDay == 2){
            System.out.println("Day " + anotherDay + " is a Tuesday");
        }else if (anotherDay == 3){
            System.out.println("Day " + anotherDay + " is a Wednesday");
        }else if (anotherDay == 4){
            System.out.println("Day " + anotherDay + " is a Thursday");
        }else if (anotherDay == 5){
            System.out.println("Day " + anotherDay + " is a Friday");
        }else if (anotherDay == 6){
            System.out.println("Day " + anotherDay + " is a Saturday");
        }else if (anotherDay == 0){
            System.out.println("Day " + anotherDay + " is a Sunday");
        }else {
            System.out.println("Day " + anotherDay + " is an invalid day");
        }
    }
}
