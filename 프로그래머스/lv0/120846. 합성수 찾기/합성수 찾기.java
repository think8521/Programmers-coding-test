class Solution {
    public int solution(int n) {
        int answer = 0;
        for (int i = 1; i < n+1; i++) {
            for (int j = 2; j < n+1; j++ ) {
                if (i%j==0 && i != j) {
                    answer++;
                    break;
                }
            }
        }
        return answer;
    }
}