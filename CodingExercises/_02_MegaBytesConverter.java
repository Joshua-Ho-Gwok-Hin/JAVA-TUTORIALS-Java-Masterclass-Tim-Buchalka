public class _02_MegaBytesConverter {

    public static void main(String[] args) {
        _02_MegaBytesConverter.printMegaBytesAndKiloBytes(2500);
        _02_MegaBytesConverter.printMegaBytesAndKiloBytes(-1024);
        _02_MegaBytesConverter.printMegaBytesAndKiloBytes(5000);
    }

    public static void printMegaBytesAndKiloBytes(int kiloBytes){

        if (kiloBytes < 0){
            System.out.println("Invalid Value");
        } else {
            int megaBytes = kiloBytes / 1024;
            int remainingKiloBytes = kiloBytes % 1024;
            System.out.println(kiloBytes + " KB = " +
                    megaBytes +
                    " MB and " +
                    remainingKiloBytes +
                    " KB");
        }
    }
}
