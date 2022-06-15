public class _11_PlayingCat {

    public static void main(String[] args) {
        System.out.println(_11_PlayingCat.isCatPlaying(true, 10));
        System.out.println(_11_PlayingCat.isCatPlaying(false, 36));
        System.out.println(_11_PlayingCat.isCatPlaying(false, 35));
    }

    public static boolean isCatPlaying(boolean summer, int temperature) {
        if (summer) {
            return (25 <= temperature) && (temperature <= 45);

        } else {
            return (25 <= temperature) && (temperature <= 35);
        }
    }
}
