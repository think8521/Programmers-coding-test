import java.util.Arrays;
import java.util.Collections;

class Solution {
    public long solution(long n) {
        StringBuilder str = new StringBuilder();
        // ArrayList<Integer> arr = new ArrayList<>();
        // int i = 0;
        long tempn = n;
        
        Integer[] arr = new Integer[Long.toString(n).length()];
        
        for (int i = 0; i < Long.toString(n).length(); i++) {
            // str.append(Long.toString(n).charAt(i))
            arr[i] = Long.toString(n).charAt(i) - '0';
        }
        
        Arrays.sort(arr, Collections.reverseOrder());
        
        for (int i = 0; i < arr.length; i++) {
            str.append(arr[i]);
        }
        
        long answer = Long.parseLong(str.toString());
        return answer;
    }
}