import java.util.*;

class Solution {
    public String[] solution(String[] todo_list, boolean[] finished) {
        List<String> false_list = new ArrayList<>();
        for (int i = 0; i < todo_list.length; i++) {
            if (finished[i] == false) {
                false_list.add(todo_list[i]);
            }
        }
        String[] answer = false_list.toArray(new String[0]);
        return answer;
    }
}