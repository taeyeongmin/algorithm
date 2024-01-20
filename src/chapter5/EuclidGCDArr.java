package chapter5;

import java.util.Scanner;


/**
 * 유클리드 재귀 함수를 사용한 배열 요소들의 최대 공약수 구하기
 */
public class EuclidGCDArr {

    // {28,24,36,30};
    public static int gcdArr(int[]arr){

        int firstValue = gcd2(arr[0], arr[1]);
        int resultValue = 0;

        for(int i = 2; i < arr.length; i++){
            System.err.println(firstValue + ":"+arr[i]);
            resultValue =  gcd2(firstValue, arr[i]);
        }
        return resultValue;
    }

    public static int gcd2(int x, int y){

        if(y == 0){
            return x;
        }else{
            return gcd2(y,x % y);
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.err.println("배열 요소들의 최대 공약수를 구합니다.");

        int[]arr = {28,24,36,44,53};

        System.err.println("최대공약수는 : "+gcdArr(arr)+"입니다");

    }
}
