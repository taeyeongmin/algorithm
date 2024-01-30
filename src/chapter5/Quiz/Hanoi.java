package chapter5.Quiz;

// 1, 3, 7, 15, 31
public class Hanoi {

    static int count = 0;
    public static void main(String[] args) {

        int no = 3;
        String from = "A";
        String to = "C";
        String temp = "B";

        hanoi(no,from,to,temp);
        System.err.println("이동 횟수 : "+count);
    }

    public static void hanoi(int n, String from, String to,String temp){

        count++;
        if(n == 1){
            System.out.println("원판("+n+")을 {"+from+"}에서 {"+to+"}로 옮김" );
        }else{
            hanoi(n-1,from,temp,to); // 맨 아래 원판을 제외한 위의 원판이 보조 기둥으로 이동(3개의 원판일 때 3회)
            System.out.println("원판("+n+")을 {"+from+"}에서 {"+to+"}로 옮김" );
            hanoi(n-1,temp,to,from); // 원판 n-1을 보조 기둥에서 목표 기둥까지 옮김
        }
    }
}

    /**

        h(1) -> p1
        h(2) -> h(1) p2 h1(1)
        h(3) -> h(2) p3 (h2)
        = 1,2,1,3,1,2,1

     */

