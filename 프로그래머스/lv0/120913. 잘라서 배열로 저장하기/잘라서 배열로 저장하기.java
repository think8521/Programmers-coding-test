class Solution {
    public String[] solution(String my_str, int n) {
        String[] answer = {};
        StringBuilder str = new StringBuilder();
        if (my_str.length()%n == 0) {
            answer = new String[my_str.length()/n];
        } else {
            answer = new String[my_str.length()/n+1];
        }
        int j = 0;
        
        for (int i = 0; i < my_str.length(); i++) {
            str.append(my_str.charAt(i));
            
            if (i != my_str.length()-1 && (i+1)%n == 0) {
                answer[j++] = str.toString();
                str.setLength(0);
                
            }
            if (i == my_str.length()-1) {
                answer[j++] = str.toString();
            }
        }
        return answer;
    }
}