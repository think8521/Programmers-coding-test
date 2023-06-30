class Solution {
    public int solution(int M, int N) {
        int answer = 0;
        
        int L = Math.max(M, N);
        int S = Math.min(M, N);

        if (L == 2) {
            answer = L*S-1;
            return answer;
        }
        if (L == 1) {
            answer = 0; 
            return answer;
        }
        
        
        
        answer = (S-1)*L + (L-1);
        
        
        return answer;
    }
}