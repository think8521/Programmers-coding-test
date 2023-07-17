import java.util.ArrayList;
import java.util.Arrays;
class Solution {
    public int[] solution(int[] arr) {
        
        int[] temp = arr.clone();
        Arrays.sort(temp);
        // System.out.println(temp[0]);
        
        ArrayList<Integer> arrA = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != temp[0]) {
                arrA.add(arr[i]);
            }
        }
        // System.out.println(arrA.get(0));
        if (arrA.size() == 0) {
            int[] answer = {-1};
            return answer;
        }
        
        int[] answer = new int[arrA.size()];
        
        for (int i = 0; i < arrA.size(); i++) {
            answer[i] = arrA.get(i);
        }
        return answer;
    }
}