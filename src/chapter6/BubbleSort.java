package chapter6;

import java.util.Scanner;

public class BubbleSort {

    static long comCnt = 0; // 비교 횟수
    public static void main(String[] args){

        int no = 50000;
        int arr [] = new int[no];

        for(int i = 0; i < no; i++){
            arr[i] = (int) (Math.random() * no);
        }
        int count = no;

        System.err.println("=========== 연산 시작 ==============");
        long startTime = System.currentTimeMillis();
        bubbleSort(arr,count);
        long endTime = System.currentTimeMillis();

        long elapsedTime = endTime - startTime;
        System.err.println("비교 횟수 : "+ comCnt);
        System.err.println("알고리즘 실행 시간 : "+ elapsedTime*0.001 +"초");

        for(int elem : arr){
            System.out.print(elem+",");
        }
    }
    static void bubbleSort(int [] arr, int n){

        for(int i = 1; i <= n; i++){
            for(int j = n-1; j > 0; j--){
                comCnt++;
                if(arr[j] < arr[j-1]){
                    swap(arr,j,j-1);
                }
            }
        }

    }

    static void swap(int [] arr, int idx1, int idx2){
        int t = arr[idx1];
        arr[idx1] = arr[idx2];
        arr[idx2] = t;
    }
}
