import java.util.ArrayList;
import java.util.Collections;
class Solution {
    public int[] solution(int k, int[] score) {
        int[] answer = new int[score.length];
        ArrayList<Integer> arr = new ArrayList<>();
        
        for (int i = 0; i < score.length; i++) {
            arr.add(score[i]);
            ArrayList<Integer> temp = new ArrayList<>(arr.size());
            // Collections.copy(temp, arr);
            for (Integer arrs : arr) {
                temp.add(arrs);
            }
            Collections.sort(temp, Collections.reverseOrder());
            answer[i] = temp.get(Math.min(i, k-1));
        }
        
        return answer;
    }
}