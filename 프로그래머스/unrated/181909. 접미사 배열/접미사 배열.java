import java.util.*;
import java.util.*;
class Solution {
    public String[] solution(String my_string) {
        ArrayList<String> arr = new ArrayList<>();
        for (int i = my_string.length()-1; i > -1; i--) {
            arr.add(my_string.substring(i));
        }
        Collections.sort(arr);
        String[] answer = arr.toArray(new String[0]);
        return answer;
    }
}