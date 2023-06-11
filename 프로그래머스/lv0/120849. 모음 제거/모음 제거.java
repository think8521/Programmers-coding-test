class Solution {
    public String solution(String my_string) {
        
        String[] vo = {"a", "e", "i", "o", "u"};        
        for (int i=0; i < 5; i++) {
            my_string = my_string.replace(vo[i], "");
        }
        
        String answer = my_string;
        
        return answer;
    }
}