import java.util.*;
class Solution {
    public String[] solution(String[] picture, int k) {
        ArrayList<String> list = new ArrayList<>();
        StringBuilder str = new StringBuilder();
        for (int i = 0; i < picture.length; i++) {
            char[] arr = picture[i].toCharArray();
            for (char a : arr) {
                for (int j = 0; j < k; j++) {
                    str.append(a);
                }
            }
            for (int j = 0; j < k; j++) {
                list.add(str.toString());
            }
            str.setLength(0);
        }
        String[] answer = list.toArray(new String[0]);
        return answer;
    }
}