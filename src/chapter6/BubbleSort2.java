package chapter6;

/**
 * 교환 횟수가 없으면 작업을 멈추는 로직을 추가하여 개선
 */
public class BubbleSort2 {
    static int cnt = 0;
    public static void main(String[] args){
        int []arr = {1,3,9,4,7,8,6};
        int count = 7;

        bubbleSort2(arr,count);
    }
    static void bubbleSort2(int [] arr, int n){

        int lastIdx = 0;

        for(int i = 1; i <= n; i++){
            int swapCnt = 0;
            for(int j = n-1; j > i; j--){
                cnt++;
                if(arr[j] < arr[j-1]){
                    swap(arr,j,j-1);
                    swapCnt++;
                    lastIdx = j-1;
                }
                for(int elem : arr){
                    System.out.print(elem+",");
                }
                 System.out.println();
            }
            if(swapCnt == 0) break;
            i = lastIdx;
            System.out.println("=====================================");

        }

        System.err.println("비교를 "+cnt+"회 했습니다.");

    }

    static void swap(int [] arr, int idx1, int idx2){
        int t = arr[idx1];
        arr[idx1] = arr[idx2];
        arr[idx2] = t;
        System.out.println("@@@@@@ 교환 @@@@@@@");
    }
}
