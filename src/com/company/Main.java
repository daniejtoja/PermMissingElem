
import java.util.Arrays;

class Solution {
    public int solution(int[] A) {

        if(A.length == 0)
            return A.length+1;

        Arrays.sort(A);
        for(int i = 0; i<A.length; ++i){

            if(A[i] != i+1){
                return i+1;
            } else {
                continue;
            }
        }
        return A.length+1;
    }
}