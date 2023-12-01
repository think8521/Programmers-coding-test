import java.util.*;
import java.util.*;
class Solution {
    public int[] solution(int[] arr, boolean[] flag) {
        ArrayList<Integer> arrList = new ArrayList<>();
        for (int i = 0; i < flag.length; i++) {
            if (flag[i]) {
                for (int j = 0; j < arr[i] * 2; j++) {
                    arrList.add(arr[i]);
                }
            } else {
                for (int j = 0; j < arr[i]; j++) {
                    arrList.remove(arrList.size()-1);
                }
            }
        }
        int[] answer = arrList.stream().mapToInt(Integer::intValue).toArray();
        return answer;
    }
}