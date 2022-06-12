public class _03_BarkingDog {

    public static void main(String[] args) {
        System.out.println(_03_BarkingDog.shouldWakeUp(true, 1));
        System.out.println(_03_BarkingDog.shouldWakeUp(false, -2));
        System.out.println(_03_BarkingDog.shouldWakeUp(true, 8));
        System.out.println(_03_BarkingDog.shouldWakeUp(true, 9));
        System.out.println(_03_BarkingDog.shouldWakeUp(true, 10));
        System.out.println(_03_BarkingDog.shouldWakeUp(true, 11));
        System.out.println(_03_BarkingDog.shouldWakeUp(true, 12));
        System.out.println(_03_BarkingDog.shouldWakeUp(true, 22));
        System.out.println(_03_BarkingDog.shouldWakeUp(true, 23));
    }

    public static boolean shouldWakeUp(boolean isBarking, int hourOfDay) {
        if (isBarking) {
            return (0 <= hourOfDay && hourOfDay < 8) || (hourOfDay == 23);
        }
        return false;
    }
}
