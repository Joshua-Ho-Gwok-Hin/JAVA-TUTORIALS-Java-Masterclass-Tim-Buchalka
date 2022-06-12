public class PrimitiveTypes {

    public static void main(String[] args) {
	// write your code here

        byte myByteMax = Byte.MAX_VALUE;
        System.out.println("myByteMax is " + myByteMax);

        byte myByteMin = Byte.MIN_VALUE;
        System.out.println("myByteMin is " + myByteMin);

        short myShortMax = Short.MAX_VALUE;
        System.out.println("myShortMax is " + myShortMax);

        short myShortMin = Short.MIN_VALUE;
        System.out.println("myShortMin is " + myShortMin);

        byte myByte = 50;
        short myShort = 150;
        int myInteger = 1150;
        long myLong =  50000L + ((myByte + myShort + myInteger) * 10);
        long myLonger = 50000L + 10L * (myByte + myShort + myInteger);
        System.out.println("mylong is equals to " + myLong);
        System.out.println("mylonger is equals to " + myLonger);




    }
}
