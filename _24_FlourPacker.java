public class _24_FlourPacker {
    public static boolean canPack(int bigCount, int smallCount, int goal){

        int bigCountKg = bigCount * 5;

        if ((bigCount<0)||(smallCount<0)||(goal<0)){
            return false;
        }

        if (bigCount<1){
            return smallCount >= goal;
        }else if (goal >= bigCountKg){ //bigCount 1 and above or goal is 5 and above
//                  21 >= 10
            int smallCountNeeded = goal - bigCountKg;
            return smallCount >= smallCountNeeded;

        }else {
            int smallCountNeeded = goal % 5;
            return smallCount >= smallCountNeeded;
        }
    }

    public static void main(String[] args) {
        System.out.println(canPack(1, 0, 4));   // false
        System.out.println(canPack(1, 0, 5));   // true
        System.out.println(canPack(0, 5, 4));   // true
        System.out.println(canPack(2, 2, 11));  // true
        System.out.println(canPack(-3, 2, 12)); // false
        System.out.println(canPack(2, 10, 21)); // false


    }
}
//        if goal < 5, smallCount >= goal
//        if smallCount == 0, (goal % (bigCount * 5)== 0)
//        if smallCount == 1, (goal % (bigCount * 5))<=smallCount   |5= (bigCount = bigCount + 5)
//        if smallCount == 2, (goal % (bigCount * 5))<= smallCount  |10= (bigCount = bigCount + 5)
