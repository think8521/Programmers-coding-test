import java.util.*;
class Solution {
    public String[] solution(String myStr) {
        StringBuilder str = new StringBuilder();
        ArrayList<String> arr = new ArrayList<>();
        for (char c : myStr.toCharArray()) {
            if (c != 'a' && c != 'b' && c != 'c') {
                str.append(c);
            } else {
                if (str.length() > 0) {
                    arr.add(str.toString());
                    str.setLength(0);
                }
            }
        }
        if (str.length() > 0) {
            arr.add(str.toString());
        }
        if (arr.size() < 1) {
            arr.add("EMPTY");
        }
        
        String[] answer = arr.toArray(new String[arr.size()]);
        return answer;
    }
}