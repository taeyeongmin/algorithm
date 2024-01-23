package chapter6;


/**
 * 삽입 정렬
 */
public class InsertionSort {

    public static void main(String[] args){
        int []arr = {6,4,1,7,3,9,8};
        int n = 7;

//        insertionSort(arr,n);
//        insertionSort2(arr,n);
        insertionSort3(arr,n);
    }

    /**
     * 단 해당 방법은 내부 배열이 멈출 때 한번 temp값을 arr[j]에 삽입하는 방법과 달리 자리를 바꿀 때마다 temp값을 삽입(반복 횟수는 동일)
     * @param arr
     * @param n
     */
    static void insertionSort(int [] arr, int n) {

        int cnt = 0;
        int moveCnt = 0;

        for(int i = 1; i < n; i++){

            int temp = arr[i];

            for(int j = i-1; j >= 0; j--){

                if(temp < arr[j]){
                    moveCnt++;
                    arr[j+1] = arr[j];
                    arr[j] = temp;
                }
                cnt++;

                for(int a : arr)
                    System.out.print(a+",");
                System.out.println();
            }
            System.out.println("============================");
        }

        System.err.println("연산 횟수 : "+cnt); // 21회 == 7(7-1)/2
        System.err.println("이동 횟수 : "+moveCnt);
    }

    /**
     * 비교 대상의 앞자리에 더 작은 숫자가 없을 경우 연산 할 필요가 없으므로 continue 처리 추가
     * @param arr
     * @param n
     */
    static void insertionSort2(int [] arr, int n) {

        int cnt = 0;

        for(int i = 1; i < n; i++){

            int temp = arr[i];

            for(int j = i-1; j >= 0; j--){

                if(temp < arr[j]){
                    arr[j+1] = arr[j];
                    arr[j] = temp;
                }else{
                    continue;
                }
                cnt++;

                for(int a : arr)
                    System.out.print(a+",");
                System.out.println();
            }
            System.out.println("============================");
        }

        System.err.println("연산 횟수 : "+cnt); // 7회, 기존 21회에서 약 3배 개선
    }

    /**
     * 정석적인 삽입 정렬
     *
     * @param arr
     * @param n
     */
    static void insertionSort3(int [] arr, int n) {

        int cnt = 0;

        for(int i = 1; i < n; i++){

            int temp = arr[i];
            int j;
            for(j = i; j > 0 && temp < arr[j-1]; j--){
                arr[j] = arr[j-1];
                cnt++;
            }
            arr[j] = temp;

            for(int a : arr)
                System.out.print(a+",");
            System.out.println();
            System.out.println("============================");
        }

        System.err.println("연산 횟수 : "+cnt);
    }
}
