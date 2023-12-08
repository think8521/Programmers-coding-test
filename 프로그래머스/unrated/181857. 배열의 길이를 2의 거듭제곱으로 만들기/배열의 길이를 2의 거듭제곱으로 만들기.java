import java.util.*;
class Solution {
    public int[] solution(int[] arr) {
        int leng = 1;
        while (arr.length > leng) {
            leng *= 2;
        }
        ArrayList<Integer> list =  new ArrayList<>();
        for (int i : arr) {
            list.add(i);
        }
        while (list.size() < leng) {
            list.add(0);
        }
        
        
        int[] answer = list.stream().mapToInt(i -> i).toArray();
        return answer;
    }
}