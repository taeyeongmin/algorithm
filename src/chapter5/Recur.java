package chapter5;

import java.util.Scanner;

/**
 * 재귀 알고리즘 분석
 */
public class Recur {
    static void test(){
        System.err.println("=== test ===");
    }

    static void recur(int n){
        System.err .println("------ "+n+" -----");
        if(n > 0){
            recur(n-1);
            System.err.println(n);
            recur(n -2);
        }
    }

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.err.println("정수를 입력");
        int x = sc.nextInt();

        recur(x);

    }
}
