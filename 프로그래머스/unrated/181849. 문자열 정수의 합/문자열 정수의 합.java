class Solution {
    public int solution(String num_str) {
        int answer = 0;
        char[] arr = num_str.toCharArray();
        for (char a : arr) {
            answer += a-'0';
        }
        return answer;
    }
}