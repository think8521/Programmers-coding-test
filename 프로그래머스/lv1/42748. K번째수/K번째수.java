import java.util.ArrayList;
import java.util.Collections;
class Solution {
    public int[] solution(int[] array, int[][] commands) {
        
        ArrayList<Integer> answerList = new ArrayList<>();
        ArrayList<Integer> arr = new ArrayList<>();
        
        for (int i = 0; i < commands.length; i++) {
            
            for (int j = commands[i][0]-1; j < commands[i][1]; j++) {
                arr.add(array[j]);
            }
            
            Collections.sort(arr);
            answerList.add(arr.get(commands[i][2]-1));
            arr.clear();
        } 
        
        
        int[] answer = answerList.stream().mapToInt(Integer::intValue).toArray();
        
        return answer;
    }
}