import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

class Solution {
    public String[] solution(String[] strings, int n) {
        
        ArrayList<String> strList = new ArrayList<>(Arrays.asList(strings));
        ArrayList<String> answerList = new ArrayList<>();
        ArrayList<Character> charList = new ArrayList<>();
        
        
        for (String string : strings) {
            charList.add(string.charAt(n));
        }
        
        Collections.sort(strList);
        Collections.sort(charList);
        System.out.println(charList.get(0));
        while (strList.size() > 0) {
            for (int i = 0; i < strings.length; i++) {
                if (strList.get(i).charAt(n) == (char)charList.get(0)) {
                    answerList.add(strList.get(i));
                    strList.remove(strList.get(i));
                    charList.remove(charList.get(0));
                    break;
                }
            }
        }
        
        return answerList.toArray(new String[answerList.size()]);
    }
}