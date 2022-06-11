public class _07_TeenNumberChecker {

    public static void main(String[] args) {
        System.out.println(_07_TeenNumberChecker.hasTeen(9, 99, 19)); // true
        System.out.println(_07_TeenNumberChecker.hasTeen(23, 15, 42)); // true
        System.out.println(_07_TeenNumberChecker.hasTeen(22, 23, 34)); // false
        System.out.println(_07_TeenNumberChecker.isTeen(9)); // false
        System.out.println(_07_TeenNumberChecker.isTeen(13)); // true
    }

    public static boolean hasTeen(int x, int y, int z) {
        return ((13 <= x && x <= 19) || (13 <= y && y <= 19) || (13 <= z && z <= 19));
    }
    public static boolean isTeen(int w){
        return ((13 <= w && w <= 19));
    }
}
