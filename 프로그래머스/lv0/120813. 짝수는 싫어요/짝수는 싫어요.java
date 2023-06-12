class Solution {
    public int[] solution(int n) {
        int count = (n%2==0) ? n/2 : n/2 + 1;
        int[] underN = new int[n];
        
        for (int i=0; i<n; i++) {
            underN[i] = i+1;
        }
        
        
        int[] answer = new int[count];
        int j = 0;
        for (int i=0; i<n; i++) {
            if (underN[i]%2==1) {
                answer[j] = underN[i];
                j++;
            }
        }
        
        
        
        return answer;
    }
}