import java.util.ArrayList;
import java.util.Collections;
class Solution {
    public int[] solution(int[] arr, int divisor) {
        ArrayList<Integer> divided = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % divisor == 0) {
                divided.add(arr[i]);
            }
        }
        
        Collections.sort(divided);
        
        if (divided.size() == 0) {
            int[] answer = {-1};
            return answer;
        }
        
        int[] answer = new int[divided.size()];
        
        for (int i = 0; i < divided.size(); i++) {
            answer[i] = divided.get(i);
        }
        return answer;
    }
}