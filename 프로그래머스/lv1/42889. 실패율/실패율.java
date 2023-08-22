import java.util.HashMap;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;
class Solution {
    public int[] solution(int N, int[] stages) {
        
        HashMap<Integer, Double> maps = new HashMap<>();
        
        ArrayList<Double> valueList = new ArrayList<>();
        ArrayList<Integer> keyList = new ArrayList<>();
        
        for (int i = 1; i <= N; i++) {
            
            int scount = 0; // 스테이지에 도달한 사람 수
            int ccount = 0; // 스테이지를 클리어하지 못한 사람 수
            
            for (int stage : stages) {
                
                if (i <= stage) {
                    scount++;
                }
                if (i == stage) {
                    ccount++;
                }
            }
            if (scount == 0 && ccount == 0) {
                scount = 1;
            }
                maps.put(i, (double) ccount/scount);
                valueList.add((double) ccount/scount);
                System.out.println(valueList.get(i-1));
                //System.out.println(maps.get(i));
        }
        
        Collections.sort(valueList, Collections.reverseOrder());
        
        for (double value : valueList) {
            for (Map.Entry<Integer, Double> map : maps.entrySet()) {
                if (value == map.getValue()) {
                    keyList.add(map.getKey());
                    maps.remove(map.getKey());
                    break;
                }
            }
        }
        
        Integer[] keys = keyList.toArray(new Integer[keyList.size()]);
        
        int[] answer = new int[keys.length];
        
        for (int i = 0; i < keys.length; i++) {
            answer[i] = keys[i];
        }
        
        return answer;
    }
}