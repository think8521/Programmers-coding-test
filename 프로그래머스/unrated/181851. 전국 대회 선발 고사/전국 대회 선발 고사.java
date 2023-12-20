import java.util.*;
class Solution {
    public int solution(int[] rank, boolean[] attendance) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < rank.length; i++) {
            if (attendance[i]) {
                map.put(rank[i], i);
            }
        }
        List<Integer> keySet = new ArrayList<>(map.keySet());
        Collections.sort(keySet);
        int answer = 10000 * map.get(keySet.get(0)) + 100 * map.get(keySet.get(1)) + map.get(keySet.get(2));
        return answer;
    }
}