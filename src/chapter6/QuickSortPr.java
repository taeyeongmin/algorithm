package chapter6;


import java.util.ArrayList;

/**
 * 퀵 정렬의 기준 요소(피벗)을 기준으로 배열을 나누는 행위만 한다.
 *  1. 피벗보다 작은 그룹
 *  2. 피벗과 같은 그룹
 *  3. 피벗보다 큰 그룹
 */
public class QuickSortPr {

    static int cnt = 0;
    public static void main(String[] args){
        int []arr = {1,8,7,4,5,2,6,3,9};
        int count = 9;

        quickSortPr(arr,count);
    }

    public static void quickSortPr(int arr[], int n){

        int pl = 0; // 왼쪽 커서
        int pr = n-1; // 오른쪽 커서
        int x = arr[n/2]; // 피버 값

        do {
            for(int a: arr){
                System.out.print(a+",");
            }
            System.out.println();
            System.out.println("================");

            if(arr[pl] < x) pl++;
            if(arr[pr] > x) pr--;

            if(pl <= pr){
                swap(arr,pl++,pr--); // 교환을 했으니 다음 인덱스로 이동해야 함.
            }
        }while (pl <= pr);
    }

    static void swap(int [] arr, int idx1, int idx2){
        int t = arr[idx1];
        arr[idx1] = arr[idx2];
        arr[idx2] = t;
    }

}
