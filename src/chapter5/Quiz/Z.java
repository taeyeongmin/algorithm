package chapter5.Quiz;

import java.util.Arrays;
import java.util.Scanner;

/**
 * 백준 1074 문제
 */
public class Z {

    static int orRow = 4;
    static int orCol = 2;
    static int no = 3;

    public static void main(String[] args) {

        int size = (int) Math.pow(2,no);

        int i = moveCount(size, orRow, orCol);
        System.err.println(i);
    }

    public static int moveCount(int size,int row,int col){

        if(size == 2){

            System.out.println(size+": "+orRow+","+orCol+" => "+((orRow*2)+orCol));
            return ((orRow*2)+orCol);
        }else {
            row = size/2 <= orRow ? 1 : 0;
            col = size/2 <= orCol ? 1 : 0;

            orRow = row == 1 ? orRow-(size/2) : orRow;
            orCol = col == 1 ? orCol-(size/2) : orCol;

            int i = moveCount(size / 2, row, col);

            int order = (size*(size/2)*row)+((size*(size/4)*col));
            System.out.println(size+": "+row+","+col+" => "+order);

            return order+i;
        }

    }

}

/**
 *

    0,0 -> 1
    0,1 -> 2
    1,0 -> 3
    1,1 -> 4

    0,2 -> 5
    0,3 -> 6
    1,2 -> 7
    1,3 -> 8





 */
