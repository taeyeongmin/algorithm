package chapter1.part1;

/**
 * 3개의 숫자 중 중앙 값 출력
 */
public class CenterValue {

    public static int getCenterValue(int val1,int val2,int val3){

        // 2,1,3
        if(val1 >= val2){
            if(val2 >= val3){
                return val2;
            }else{
                if(val1 <= val3){
                    return val1;
                }else{
                    return val3;
                }
            }
        // 2,3,1
        }else{
            if(val2 >= val3){
                if(val1 >= val3){
                    return val1;
                }else{
                    return val3;
                }
            }else{
                return val2;
            }
        }
    }
}
