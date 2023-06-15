class Solution {
    public String solution(String my_string, int num1, int num2) {
        String[] my = new String[my_string.length()];
        for (int i=0; i<my_string.length(); i++) {
            my[i] = String.valueOf(my_string.charAt(i));
        }
        String temp = my[num1];
        my[num1] = my[num2];
        my[num2] = temp;
        
        
        String answer = String.join("", my);
        return answer;
    }
}