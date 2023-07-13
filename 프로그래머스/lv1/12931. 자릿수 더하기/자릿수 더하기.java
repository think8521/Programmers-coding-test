import java.util.*;

public class Solution {
    public int solution(int n) {
        int answer = 0;
        String ns = Integer.toString(n);
        
        for (int i = 0; i < ns.length(); i++) {
            answer += ns.charAt(i)-'0';
        } 

        return answer;
    }
}