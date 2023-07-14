class Solution {
    public boolean solution(int x) {
        int plus = 0;
        for (int i = 0; i < String.valueOf(x).length(); i++) {
            plus += String.valueOf(x).charAt(i)-'0';
        }
        
        boolean answer = true;
        if (x % plus != 0) {
            answer = false;
        }
        return answer;
    }
}