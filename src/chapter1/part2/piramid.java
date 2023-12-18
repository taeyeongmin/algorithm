package chapter1.part2;

public class piramid {

    public static void printPiramid(int no){

        int maxCount = no*2-1;
        int centerValue = maxCount/2+1;
        for(int i = 1; i <= no; i++){

            for(int j = 1; j <= no*2-1; j++){

                if(centerValue-(i-1) <= j && j <= centerValue+(i-1)){
//                if(centerValue == j){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

    }
}

//     *            4         c +-0    1
//    ***         3,4,5       c +-1    2
//   *****      2,3,4,5,6     c +-2    3
//  *******   1,2,3,4,5,6,7   c +-3    4

