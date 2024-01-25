package chapter5.Quiz;

import java.util.Scanner;
import java.util.Stack;

/**
 * 재귀를 사용하지 않고 팩토리얼 해결
 */
public class Q1 {
    static Stack<Integer> st = new Stack<>();

    public static void main(String[] args) {

        int no = 4;

        System.err.println("결과 : "+factorial(no));
//        System.err.println("결과 : "+factorialStack(no));
    }

    public static int factorialStack(int n){
//        System.out.println("n : "+n);

        int result = 1;
        while (n > 0){
            st.push(n);
            n--;
        }

        while (!st.empty())
            result = result * st.pop();

        return result;
    }
    public static int factorial(int n){
        System.out.println("n : "+n);

        if(n > 0){
            int recursiveResult = factorial(n - 1);
            int result = n * recursiveResult;
            System.out.println("factorial(" + n + ") = " + n + " * factorial(" + (n-1) + ") = " + result +", "+recursiveResult);
            return result;
        }else{
            return 1;
        }

    }

    // 4 * (3 * f(2))

//    factorial(5)
//            = 5 * factorial(4)
//            = 5 * (4 * factorial(3))
//            = 5 * (4 * (3 * factorial(2)))
//            = 5 * (4 * (3 * (2 * factorial(1))))
//            = 5 * (4 * (3 * (2 * 1)))
//            = 5 * 4 * 3 * 2 * 1
//            = 120


    //
    }
