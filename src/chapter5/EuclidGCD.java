package chapter5;

import java.util.Scanner;


/**
 * 유클리드 재귀 함수를 사용한 최대 공약수 구하기
 */
public class EuclidGCD {

    // 28,8
    public static int gcd(int x, int y){

        System.err.println(x+","+y);
        if(y == 0){
            return x;
        }else{
            return gcd(y,x % y);
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.err.println("두 정수의 최대 공약수를 구합니다.");

        System.err.println("첫 번째 정수를 입력하시오.");
        int x = sc.nextInt();
        System.err.println("두 번째 정수를 입력하시오.");
        int y = sc.nextInt();

        System.err.println("최대공약수는 : "+gcd(x,y)+"입니다");

    }
}
