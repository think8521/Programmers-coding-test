import java.util.*;
import java.util.*;
class Solution {
    public int[] solution(int[] arr, int k) {
        Set<Integer> set = new LinkedHashSet<>();
        for (int i : arr) {
            set.add(i);
        }
        int[] answer = new int[k];
        Arrays.fill(answer, -1);
        int i = 0;
        for (int a : set) {
            answer[i] = a;
            i++;
            if (i == k) {
                break;
            }
        }
        return answer;
    }
}