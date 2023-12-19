class Solution {
    public String solution(String my_string, String overwrite_string, int s) {
        StringBuilder str = new StringBuilder();
        str.append(my_string.substring(0, s));
        char[] arr = overwrite_string.toCharArray();
        for (char c : arr) {
            str.append(c);
        }
        String answer = str.toString() + my_string.substring(s + overwrite_string.length());
        return answer;
    }
}