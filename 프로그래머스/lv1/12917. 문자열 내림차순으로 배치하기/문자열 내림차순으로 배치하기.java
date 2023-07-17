import java.util.Arrays;
import java.util.Comparator;
class Solution {
    public String solution(String s) {
        Character[] arr = new Character[s.length()];
        for (int i = 0; i < s.length(); i++) {
            arr[i] = s.charAt(i);
        }
        Arrays.sort(arr, Comparator.reverseOrder());
        String answer = "";
        for (int i = 0; i < s.length(); i++) {
            answer += arr[i];
        }
        
        return answer;
    }
}