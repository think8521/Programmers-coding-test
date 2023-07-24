import java.util.*;
class Solution {
    public int solution(int[] d, int budget) {
        
        Arrays.sort(d);
        for (int i = 0; i < d.length; i++) {
            budget -= d[i];
            if (budget < 0) {
                return i;
            }
        }
        int answer = d.length;
        return answer;
    }
}