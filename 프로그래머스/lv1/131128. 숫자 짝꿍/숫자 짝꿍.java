import java.util.*;
class Solution {
    public String solution(String X, String Y) {
        
        StringBuilder str = new StringBuilder();
        
        char[] xarr = X.toCharArray();
        char[] yarr = Y.toCharArray();
        
        HashMap<Integer, Integer> xmap = new HashMap<>();
        HashMap<Integer, Integer> ymap = new HashMap<>();
        
        for (int i = 0; i < 10; i++) {
            int value = 0;
            for (char x : xarr) {
                if (x-'0' == i) {
                    value++;
                }
            }
            xmap.put(i, value);
            
            value = 0;
            for (char y : yarr) {
                if (y-'0' == i) {
                    value++;
                }
            }
            ymap.put(i, value);
        }
        
        for (int i = 9; i > -1; i--) {
            str.append(String.valueOf(i).repeat(Math.min(xmap.get(i), ymap.get(i))));
        }
        
        String answer = str.toString();
        
        if (answer.length() == 0) {
           answer = "-1"; 
        } else if (answer.charAt(0) == '0') {
            answer = "0";
        }
        
        return answer;
    }
}