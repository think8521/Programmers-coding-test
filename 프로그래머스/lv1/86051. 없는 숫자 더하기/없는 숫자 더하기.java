import java.util.*;
class Solution {
    public int solution(int[] numbers) {
        int answer = 0;
        for (int i = 0; i < 10; i++) {
            if (!Arrays.toString(numbers).contains(Integer.toString(i))) {
                answer += i;
            }
        }
        
        return answer;
    }
}