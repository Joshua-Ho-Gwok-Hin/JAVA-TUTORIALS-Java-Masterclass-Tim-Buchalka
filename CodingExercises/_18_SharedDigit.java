public class _18_SharedDigit {
    public static void main(String[] args) {
        System.out.println(hasSharedDigit(12, 23));
        System.out.println(hasSharedDigit(9, 99));
        System.out.println(hasSharedDigit(15, 55));
        System.out.println(hasSharedDigit(13, 14));
    }

    public static boolean hasSharedDigit(int i, int j) {
        if ((i < 10)||(99 < i)||(j < 10)||(99 < j)){
            return false;
        }
        while (i > 0){
            int iDigits = i % 10;
            i /= 10;
            int jVar = j;

            while (jVar > 0){
                int jDigits = jVar % 10;
                jVar /= 10;
                if (iDigits == jDigits){
                    return true;
                }
            }
        }
        return false;
    }
}
