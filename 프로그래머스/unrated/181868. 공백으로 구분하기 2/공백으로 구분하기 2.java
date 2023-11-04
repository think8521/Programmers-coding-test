import java.util.*;
import java.util.*;
class Solution {
    public String[] solution(String my_string) {
        List<String> answer = new ArrayList<String>();
        String[] arr = my_string.split(" ");
        for (String a : arr) {
            if (a.length() != 0) {
                answer.add(a);
            }
        }
        return answer.toArray(new String[0]);
    }
}