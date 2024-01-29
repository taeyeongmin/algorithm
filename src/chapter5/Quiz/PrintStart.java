package chapter5.Quiz;

import java.util.Scanner;

/**
 * 백준 10994 문제(별 찍기)
 */
public class PrintStart {

    static char[][]arr;

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int count = sc.nextInt();
        int size = count*4-3;

        arr = new char[count*4-3][count*4-3];

        printStart(size,0,0);

        print(arr);
    }

    public static void printStart(int size,int colStartInx, int rowStartIdx){


        for(int i = rowStartIdx; i < rowStartIdx+size; i++){

            for(int j = colStartInx; j < colStartInx+size; j++){
                if(i == rowStartIdx || j == colStartInx || i == rowStartIdx+size-1 || j == colStartInx+size-1){
                    arr[i][j] = '*';
                }else{
                    arr[i][j] = ' ';
                }
            }
        }

        if(size > 0)
            printStart(size-4,colStartInx+2,rowStartIdx+2);

    }

    public static void print(char [][]arr){

        for(int i = 0; i < arr.length; i++){

            for(int j = 0; j < arr[i].length; j++){

                System.out.print(arr[i][j]);
            }
            System.out.println();
        }
    }

}
