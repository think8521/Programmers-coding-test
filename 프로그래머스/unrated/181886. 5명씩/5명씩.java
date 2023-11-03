import java.util.*;
import java.util.*;
class Solution {
    public String[] solution(String[] names) {
        List<String> answer = new ArrayList<>();
        for (int i = 0; i < names.length; i+=5) {
            answer.add(names[i]);
        }
        System.out.println(answer);
        return answer.toArray(new String[0]);
    }
}