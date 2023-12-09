import java.util.*;
import java.util.*;
class Solution {
    public int solution(String[] strArr) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (String str : strArr) {
            if (map.containsKey(str.length())) {
                map.put(str.length(), map.get(str.length())+1);
            } else {
                map.put(str.length(), 1);
            }
        }
        int answer = 0;
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() >= answer) {
                answer = entry.getValue();
            }
        }
        return answer;
    }
}