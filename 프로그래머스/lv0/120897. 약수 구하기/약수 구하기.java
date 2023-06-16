class Solution {
    public int[] solution(int n) {
        int count = 0;
        for (int i = 1; i<n+1; i++) {
            if (n % i == 0) {
                count++;
            }
        }
        
        int[] answer = new int[count];
        int j = 0;
        for (int i = 1; i<n+1; i++) {
            if (n % i == 0) {
                answer[j] = i;
                j++;
            }
        }
        
        return answer;
    }
}