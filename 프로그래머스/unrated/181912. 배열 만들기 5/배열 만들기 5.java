import java.util.*;
class Solution {
    public int[] solution(String[] intStrs, int k, int s, int l) {
        ArrayList<Integer> arr = new ArrayList<>();
        for (String str : intStrs) {
            int over = Integer.parseInt(str.substring(s, s+l));
            if (over > k) {
              arr.add(over);  
            }
        }
        int[] answer = arr.stream().mapToInt(i -> i).toArray();
        return answer;
    }
}