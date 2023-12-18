package chapter1.part1;

public class MaxValue {


    /**
     * 4개의 숫자 중 최댓값 조회
     * @return
     */
    public static int getMaxValue(int [] valueArr){

        int result = 0;

        for(int i = 0; i < valueArr.length-1; i++){

            System.err.println(valueArr[i] +":"+valueArr[i+1]);
            if(valueArr[i+1] > valueArr[i]){
                result = valueArr[i+1];
            }
        }

        return result;
    }
}
