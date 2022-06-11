public class _26_DiagonalStar {
    public static void main(String[] args) {
        printSquareStar(15);
    }

    public static void printSquareStar(int number) {
        char star = '*';
        char space = ' ';
        int i;
        int j;
        if (number < 5){
            System.out.println("Invalid Value");
        }else{
            for (i=0; i< number;i++){
                for (j=0;j<number;j++){
                    if ((i==0)||(j==0)||(i==j)||(i==(number-1))||(j==(number-1))||((i+j)==(number-1))){
                        System.out.print(star);
                    }else {
                        System.out.print(space);
                    }
                }
                System.out.println();
            }
        }
    }
}

