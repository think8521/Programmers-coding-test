class Solution {
    public int solution(int n) {
        int answer = 0;
        
        int j = 1;
        for (int i=1; i <= n; i++) {
            j *= i;
            if (j > n) {
                answer = i-1;
                return answer;
            } else if (j==n) {
                answer = i;
                return answer;
            }
        }
        
        
        return answer;
    }
}