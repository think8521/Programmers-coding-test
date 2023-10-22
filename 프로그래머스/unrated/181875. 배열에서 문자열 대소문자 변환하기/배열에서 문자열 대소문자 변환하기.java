import java.util.*;
class Solution {
    public String[] solution(String[] strArr) {
        String[] answer = new String[strArr.length];
        int i = 0;
        for (String arr : strArr) {
            answer[i] = (Arrays.asList(strArr).indexOf(arr) % 2 != 0) ? 
                arr.toUpperCase() : arr.toLowerCase();
            i++;
        }
        return answer;
    }
}