public class _19_LastDigitChecker {

    public static void main(String[] args) {
        System.out.println(hasSameLastDigit(41, 22, 71));
        System.out.println(hasSameLastDigit(23, 32, 42));
        System.out.println(hasSameLastDigit(9, 99, 999));
        System.out.println(isValid(13));
        System.out.println(isValid(-13));
        System.out.println(isValid(1000));
        System.out.println(isValid(10));
    }

    public static boolean hasSameLastDigit(int x, int y, int z) {
        if ((isValid(x))&&(isValid(y))&&(isValid(z))){
            int xLastDigit = x % 10;
            int yLastDigit = y % 10;
            int zLastDigit = z % 10;
            System.out.println(xLastDigit + " " + yLastDigit + " " + zLastDigit);
            return ((xLastDigit == yLastDigit)||(xLastDigit == zLastDigit)||(yLastDigit == zLastDigit));
        } else {
            return false;
        }
    }

    public static boolean isValid(int digit){
        return ((10 <= digit)&&(digit<=1000));
    }
}
