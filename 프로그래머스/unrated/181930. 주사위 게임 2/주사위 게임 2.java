import java.util.*;

class Solution {
    public int solution(int a, int b, int c) {
        Set<Integer> set = new HashSet<>();
        set.add(a);
        set.add(b);
        set.add(c);
        int answer = 0;
        System.out.println(a^2);
        switch (set.size()) {
            case 3: answer += (a + b + c);
                break;
            case 2: answer += (a +  b + c) * (a*a + b*b + c*c);
                break;
            case 1: answer += 27 * Math.pow(a, 6);
                break;
        }
        return answer;
    }
}