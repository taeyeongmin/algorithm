package chapter1.part2;

public class LeftBottomTriangle {

    public static void printLeftBottomTriangle(int no){

        for(int i = 1; i <= no; i++){
            for(int j = 1; j <= i; j++){
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
