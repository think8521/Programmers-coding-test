import java.util.*;
class Solution {
    boolean solution(String s) {
        char[] arr = s.toCharArray();
        Queue<Character> q = new LinkedList<>();
        for (char c : arr) {
            if (q.size() > 0 && q.peek() == '(' && c == ')') {
                q.poll();
                continue;
            }
            q.add(c);
        }
        boolean answer = q.size() == 0 ? true : false; 

        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
        System.out.println("Hello Java");

        return answer;
    }
}