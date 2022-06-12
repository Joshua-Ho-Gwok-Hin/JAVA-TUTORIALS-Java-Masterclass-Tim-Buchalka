public class DoubleAndFloat {

    public static void main(String[] args) {
	// write your code here
        float floatMax = Float.MAX_VALUE;
        float floatMin = Float.MIN_VALUE;
        System.out.println("Float min value is " + floatMin);
        System.out.println("Float max value is " + floatMax); 
        
        double doubleMax = Double.MAX_VALUE;
        double doubleMin = Double.MIN_VALUE;
        System.out.println("Double min value is " + doubleMin);
        System.out.println("Double max value is " + doubleMax);

        int myIntValue = 5;
        float myFloatValue = (float) 5.25;
        double myDoubleValue =  5.35;
        double newValue = myIntValue + myFloatValue + myDoubleValue;
        System.out.println("My newValue is " + newValue);
    }
}
