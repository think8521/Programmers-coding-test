class Solution {
    public String solution(String my_string, int n) {
        int no = my_string.length() - n;
        StringBuilder str = new StringBuilder();
        for (; no < my_string.length(); no++) {
            str.append(my_string.charAt(no));
        }
        String answer = str.toString();
        return answer;
    }
}