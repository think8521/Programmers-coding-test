class Solution {
    public int solution(int n) {
        
        for (int i = 1; i <=n; i++) {
            if (i%3 == 0) {
                n++;
            } else if (String.valueOf(i).contains("3")) {
                n++;
            }
        }
                       
        int answer = n;
        return answer;
    }
}