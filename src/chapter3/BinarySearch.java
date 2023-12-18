package chapter3;

import java.util.Scanner;

/**
 * 이진 검색 실습 
 *  조건 : 모든 배열의 요소가 순차적으로 정렬 되있어야 함.
 */
public class BinarySearch {
    
    public static int binarySearch(){
        Scanner sc = new Scanner(System.in);
        System.err.println("검색 값 입력");
        int findValue = sc.nextInt();
        sc.close();
        int[] arr = {3,7,9,15,19,20,21,30,33}; // 15
        
        int centerIdx = 0;
        int startIdx = 0;
        int endIdx = arr.length-1;

        do {
            centerIdx = (startIdx+endIdx)/2;
            System.err.println("centerValue : "+arr[centerIdx]);

            if(arr[centerIdx] > findValue){
                endIdx = centerIdx-1;
            }else if(arr[centerIdx] < findValue){
                startIdx = centerIdx+1;
            }else if(arr[centerIdx] == findValue){
                return centerIdx;
            }
        }while (startIdx <= endIdx);

        return -1;
    }

    public static void main(String[] args) {
        int idx = binarySearch();
        if(idx == -1){
            System.err.println("존재하지 않는 검색 값");
        }else{
            System.err.println("검색한 요소는 "+idx+"번째 존재");
        }
    }
  
}
