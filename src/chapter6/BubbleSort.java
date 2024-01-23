package chapter6;

import java.util.Scanner;

public class BubbleSort {

    static int swapCnt = 0;
    static int cnt = 0;
    public static void main(String[] args){

        int a [] = new int[200];

        for(int i = 0; i < 200; i++){
            a[i] = (int) (Math.random() * 200);
        }
        int []arr = {6,2,7,5,9,8}; // 2,5,6,7,8,9
//        int count = 6;
        int count = 200;

        long startTime = System.currentTimeMillis();
        bubbleSort(a,count);
        long endTime = System.currentTimeMillis();

        long elapsedTime = endTime - startTime;
        System.err.println("알고리즘 실행 시간 : "+ elapsedTime*0.001 +"초");
    }
    static void bubbleSort(int [] arr, int n){



        for(int i = 1; i <= n; i++){
            for(int j = n-1; j > 0; j--){
                cnt++;
                if(arr[j] < arr[j-1]){
                    swap(arr,j,j-1);
                }
                System.out.print(i+"-"+(n-j)+"회차 : ");
                for(int elem : arr){
                    System.out.print(elem+",");
                }
             System.out.println();
            }
            System.out.println("=====================================");

        }


        System.err.println("비교를 "+cnt+"회 했습니다.");
        System.err.println("교환을 "+swapCnt+"회 했습니다.");
    }

    static void swap(int [] arr, int idx1, int idx2){
        int t = arr[idx1];
        arr[idx1] = arr[idx2];
        arr[idx2] = t;
        swapCnt++;
    }
}
