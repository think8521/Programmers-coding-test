import java.util.*;
class Solution {
    public int[] solution(int[] arr, int[] query) {
        int temp = 0;
        for (int a : query) {
            if (temp % 2 == 0) {
                arr = Arrays.copyOf(arr, a+1);
            } else {
                arr = Arrays.copyOfRange(arr, a, arr.length);
            }
            temp++;
        }
        int[] answer = arr;
        return answer;
    }
}