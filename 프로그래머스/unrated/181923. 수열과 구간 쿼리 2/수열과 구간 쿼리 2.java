import java.util.*;
class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        Stack<Integer> stk = new Stack<>();
        for (int[] q : queries) {
            stk.push(1000001);
            for (int i = 0; i < arr.length; i++) {
                if (q[0]<=i && i<=q[1] && q[2] < arr[i] && arr[i] <= stk.peek()) {
                    stk.pop();
                    stk.push(arr[i]);
                }
            }
            if (stk.peek() == 1000001) {
                stk.pop();
                stk.push(-1);
            }
        }
        int[] answer = stk.stream().mapToInt(i -> i).toArray();
        return answer;
    }
}