package chapter5.Quiz;

public class Hanoi {


    public static void main(String[] args) {

        int no = 3;
        String from = "A";
        String to = "C";
        String bojo = "B";

        hanoi(no,from,to,bojo);
    }

    public static void hanoi(int n, String from, String to,String bojo){

        if(n == 1){
            System.out.println("원판("+n+")을 {"+from+"}에서 {"+to+"}로 옮김" );
        }else{
            hanoi(n-1,from,bojo,to);
            System.out.println("원판("+n+")을 {"+from+"}에서 {"+to+"}로 옮김" );
            hanoi(n-1,bojo,to,from);
        }

    }
}
