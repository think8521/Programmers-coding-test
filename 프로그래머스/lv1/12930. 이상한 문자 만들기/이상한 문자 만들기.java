// import java.util.ArrayList;
// import java.util.List;
class Solution {
    public String solution(String s) {
        
        // List<String> words = new ArrayList<>();
        
        char[] arr = s.toCharArray();
        int cnt = 0;
        String answer = "";
        
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != ' ') {
                if (cnt % 2 == 0) {
                    arr[i] = Character.toUpperCase(arr[i]);
                } else {
                    arr[i] = Character.toLowerCase(arr[i]);
                }
                cnt++;
            } else {
                cnt = 0;
            }
            
            answer += arr[i];
        }
        
        return answer;
    }
}