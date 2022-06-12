public class MethodOverloading {
    public static void main(String[] args) {
        calcFeetAndInchesToCentimeters(0, 1);
        calcFeetAndInchesToCentimeters(45);


    }

    public static double calcFeetAndInchesToCentimeters(int feet, int inches){
        if ((0 <= feet) && (0 <= inches && inches <= 12)){
            int feetToInches = feet * 12;
            double centimeters = (feetToInches + inches) * 2.54d;
            System.out.println(feet + " feet " + inches + " inches = " + centimeters + " cm");

            return centimeters;
        }else{
            System.out.println("Invalid feet or inches parameter");
            return -1;
        }
    }

    public static double calcFeetAndInchesToCentimeters(int inches){
        if (0 <= inches){
            int feet = (int) inches / 12;
            double remainingInches =  inches % 2.54d;
            System.out.println("There are " + feet + " feet and " + (int) remainingInches + " inches in " + inches + " inches");
            return calcFeetAndInchesToCentimeters(feet, (int) remainingInches);
        }else return -1;
    }
}