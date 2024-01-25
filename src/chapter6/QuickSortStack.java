package chapter6;


/**
 * 퀵 정렬 1
 */
public class QuickSortStack {
    static int comCnt = 0; // 비교 횟수
    public static void main(String[] args){

        quickSortStart1();
//        quickSortStart2();
    }

    /**
     * 스택을 사용한 퀵 정렬
     *
     * @param arr
     * @param left
     * @param right
     */
    public static void quickSort(int arr[], int left, int right){

        int pl = left; // 왼쪽 커서
        int pr = right; // 오른쪽 커서
        int center = arr[(pl+pr)/2]; // 중앙 값

        for(int i = 0; i < arr.length; i++){
            if(i == left) System.out.print("|");
            System.out.print(arr[i]+",");

            if(i == right) System.out.print("|");
        }
        do {

            while (arr[pl] < center) pl++;
            while (arr[pr] > center) pr--;

            comCnt++;
            if(pl <= pr){
                swap(arr,pl++,pr--); // 교환을 했으니 다음 인덱스로 이동해야 함.
            }
        }while (pl <= pr);

        System.out.println();
        System.out.println("================== : left:"+left+" right:"+right+" 중앙값:"+center);

        if(pr > left ) quickSort(arr,left, pr);
        if(pl < right ) quickSort(arr,pl, right);
    }
    public static void quickSortStart1(){
//        int []arr = {7,4,2,5,3,1,6};
        int []arr = {5,8,4,2,6,1,3,9,7};
        int endIdx = arr.length-1;

        quickSort(arr,0,endIdx);

        System.err.println("비교 횟수 : "+ comCnt);
    }

    public static void quickSortStart2(){
        int no = 50000;
        int arr [] = new int[no];

        for(int i = 0; i < no; i++){
            arr[i] = (int) (Math.random() * no);
        }

        int endIdx = no-1;

        System.err.println("=========== 연산 시작 ==============");
        long startTime = System.currentTimeMillis();
        quickSort(arr,0,endIdx);
        long endTime = System.currentTimeMillis();

        long elapsedTime = endTime - startTime;
        System.err.println("비교 횟수 : "+ comCnt);
        System.err.println("알고리즘 실행 시간 : "+ elapsedTime*0.001 +"초");

        for(int elem : arr){
            System.out.print(elem+",");
        }
    }

    static void swap(int [] arr, int idx1, int idx2){
        int t = arr[idx1];
        arr[idx1] = arr[idx2];
        arr[idx2] = t;
    }

}
