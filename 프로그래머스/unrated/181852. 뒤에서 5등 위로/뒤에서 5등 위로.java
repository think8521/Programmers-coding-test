import java.util.*;
class Solution {
    public int[] solution(int[] num_list) {
        ArrayList arr = new ArrayList();
        for (int a : num_list) {
            arr.add(a);
        }
        Collections.sort(arr);
        int[] answer = new int[num_list.length-5];
        for (int i = 5; i < arr.size(); i++) {
            answer[i-5] = (int) arr.get(i);
        }
        return answer;
    }
}