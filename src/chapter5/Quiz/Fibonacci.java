package chapter5.Quiz;

import java.util.Scanner;

public class Fibonacci {

    public static void main(String[] args) {

        System.out.println("피보나치 수열의 n번째 입력 ");
        Scanner sc = new Scanner(System.in);
//        int no = sc.nextInt();
        int no = 4;
//        System.out.println(piramid(no));
    }

    /**
     *
     * @param n
     * @return
     */
    private static int fibonacci(int n){

        if(n >= 2){
            return fibonacci(n-1) + fibonacci(n-2);
        } else{
            return n;
        }
    }

    /**
     *          *
     *         ***
     *        *****
     *       *******
     *
     * @param n
     * @return
     */
//    public static int piramid(int n){
//        int totalIndex = n*2-1;
//
//        for(int i = 0; i < n; i ++ )
//
//    }


}
