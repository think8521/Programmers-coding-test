import java.util.LinkedList;
import java.util.Queue;
class Solution {
    public int solution(int n, int m, int[] section) {
        int answer = 0;
        
        Queue<Integer> list = new LinkedList<>();
        
        for (int i = 0; i < section.length; i++) {
            list.add(section[i]);
        }
        
        while (list.size() > 0) {
            int first = list.peek();
            while (list.size() > 0 && list.peek() < first + m) {
                list.poll();
            }
            answer++;
        }
        
        
        return answer;
    }
}