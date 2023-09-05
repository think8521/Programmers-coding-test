import java.util.*;
class Solution {
    public int solution(int[] ingredient) {
        int answer = 0;
        Stack<Integer> s = new Stack<>();
        Stack<Integer> ss = new Stack<>();
        for (int i = 0; i < ingredient.length; i++) {
            s.push(ingredient[i]);
            if (s.size() > 3 && s.peek() == 1) {
                ss.push(s.pop());
                if (s.peek() == 3) {
                    ss.push(s.pop());
                    if (s.peek() == 2) {
                        ss.push(s.pop());
                        if (s.peek() == 1) {
                            ss.push(s.pop());
                            answer++;
                        } else {
                            s.push(ss.pop());
                            s.push(ss.pop());
                            s.push(ss.pop());
                        }
                    } else {
                            s.push(ss.pop());
                            s.push(ss.pop());
                        }
                    } else {
                        s.push(ss.pop());
                    }
                }
            }
        return answer;
        }
        
//         String in = str.toString();
        
//         int origin = in.length();
//         while (in.contains("1231")) {
//             int a = in.indexOf("1231");
//             str.delete(a, a+4);
//             in = str.toString();
//         }
//         int after = in.length();
        
//         int answer = (origin - after) / 4;
        
    
}


