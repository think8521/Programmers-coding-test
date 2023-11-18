import java.util.*;
class Solution {
    public int[] solution(int n) {
        ArrayList<Integer> arr = new ArrayList<>();
        while (n != 1) {
            arr.add(n);
            n = (n % 2 == 0) ? n/2 : 3 * n + 1;
        }
        int[] answer = new int[arr.size() + 1];
        for (int i = 0; i < arr.size(); i++) {
            answer[i] = arr.get(i);
        }
        answer[arr.size()] = 1;
        return answer;
    }
}