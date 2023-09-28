import java.util.*;
class Solution {
    public String solution(String s) {
        StringBuilder str = new StringBuilder();
        char[] strs = s.toCharArray();
        ArrayList<Integer> arr = new ArrayList<>();
        int min = 2000000000;
        int max = -2000000000;
        for (char a : strs) {
            if (a != ' ') {
                str.append(a);
            } else {
                int aa = Integer.parseInt(str.toString());
                arr.add(aa);
                str.setLength(0);
                // System.out.println(aa);
            }
        }
        int aa = Integer.parseInt(str.toString());
        arr.add(aa);
        
        for (int a : arr) {
            min = (min < a) ? min : a;
            max = (max > a) ? max : a;
        }
        
        String answer = min + " " + max;
        return answer;
    }
}