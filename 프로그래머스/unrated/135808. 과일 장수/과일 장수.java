import java.util.Arrays;
import java.util.Deque;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
class Solution {
    public int solution(int k, int m, int[] score) {
        int answer = 0;
        
        Deque<Integer> apple = new LinkedList<>();
        Integer[] score2 = Arrays.stream(score).boxed().toArray(Integer[]::new);
        
        Arrays.sort(score2, Collections.reverseOrder());
        
        for (int i = 0; i < score.length; i++) {
            apple.add(score2[i]);
        }
        
        for (int i= 0; i < score.length / m; i++) {
            for (int j = 0; j < m; j++) {
                if (j == m-1) {
                    answer += apple.peek() * m;
                }
                apple.poll();
            }
        }
        
        return answer;
    }
}