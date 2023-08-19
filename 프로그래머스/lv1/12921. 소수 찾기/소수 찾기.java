class Solution {
    public int solution(int n) {
        int answer = 1;
        for (int i = 2; i <= n; i++) {
            if (i % 2 != 0) {
                answer += isSosu(i);
            }
        }
        return answer;
    }
    
    public int isSosu (int num) {
        for (int i = 2; i*i <= num; i++) {
            if (num % i ==0) {
                return 0;
            }
        }
        return 1;
    }
}