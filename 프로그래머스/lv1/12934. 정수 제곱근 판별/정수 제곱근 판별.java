class Solution {
    public long solution(long n) {
        long answer = -1;
        long x = 1;
        
        if (n == 1) {
            answer = 4;
        }
        if (n == 4) {
            answer = 9;
        }
        for (long i = 2; i < n/4; i++) {
            if (n == i*i) {
                answer = (long) (i+1)*(i+1);
                return answer;
            }
        }
        
        
        return answer;
    }
}