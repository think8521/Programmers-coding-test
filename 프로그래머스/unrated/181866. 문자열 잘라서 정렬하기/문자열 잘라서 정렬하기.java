import java.util.*;
import java.util.*;
import java.util.*;
class Solution {
    public String[] solution(String myString) {
        ArrayList<String> answer = new ArrayList(Arrays.asList(myString.split("x")));
        answer.sort(Comparator.naturalOrder());
        answer.removeAll(Arrays.asList(String.valueOf("")));
        
        return answer.toArray(new String[0]);
    }
}