class Solution {
    public String solution(String my_string, int n) {
        String answer = "";
        String[] my = new String[my_string.length()];
        for (int i = 0; i < my_string.length(); i++) {
            String myi = String.valueOf(my_string.charAt(i));
            my[i] = myi.repeat(n);
        }
        answer = String.join("", my);
        return answer;
    }
}