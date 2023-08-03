import java.util.Collections;
import java.util.Arrays;
class Solution {
    public String solution(int[] food) {
        
        StringBuilder str = new StringBuilder();
        
        for (int i = 1; i < food.length; i++) {
            if (food[i]/2 != 0) {
                str.append(String.valueOf(i).repeat(food[i]/2));
            }
        }
        
        String answer = str.toString() + "0" + str.reverse().toString();
        
        return answer;
    }
}