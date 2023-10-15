class Solution {
    public int solution(int n) {
        int answer = 0;
        if (n % 2 != 0) {
            for (int i = 1; i <= n; i++) {
                answer = (i % 2 != 0) ? answer + i : answer;
            }
        } else {
            for (int i = 1; i <= n; i++) {
                answer = (i % 2 == 0) ? answer + i*i : answer;
            }
        }
        return answer;
    }
}