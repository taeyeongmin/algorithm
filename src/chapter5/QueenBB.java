package chapter5;

import java.util.Scanner;

public class QueenBB {

    static boolean[] flag = new boolean[8]; // 해당 열에 퀸이 배치된 여부
    static int[] pos = new int[8]; // 각 열의 퀸의 위치
    public static void main(String[] args){
        set(0);
    }

    public static void set(int i){

        for(int j = 0; j < 8; j++){

            if(!flag[j]){ // 해당 행에 배치가 되지 않았을 때
                pos[j] = i;

                if(i == 7){ // 해당 열의 배치가 끝났을 때
                    print();
                }else{
                    flag[j] = true;
                    set(i+1);
                    flag[j] = false; // 왜 재귀 함수 호출 다음 부분에서 해당 행위를 하지?
                }
            }
        }

    }

    public static void print(){


        for(int i = 0; i < 8; i++){

            for(int j = 0; j < 8; j++){
                if(pos[i] == j)
                    System.out.printf(" ●");
                else
                    System.out.printf(" ○");
            }
            System.out.println();
        }
        System.out.println("==========================================");
    };

}
