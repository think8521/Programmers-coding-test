class Solution {
    public int[] solution(int[] numlist, int n) {
        
        int[] abs = new int[numlist.length];
        int[] answer = new int[numlist.length];
        
        for (int i = 0; i < abs.length; i++) {
            abs[i] = Math.abs(numlist[i] - n);
        }
        
        for (int i = 0; i < abs.length; i++) {
            for (int j = i; j < abs.length; j++) {
                if (abs[i] > abs[j]) {
                    int temp2 = abs[j];
                    abs[j] = abs[i];
                    abs[i] = temp2;
                }
            }
        }
        for (int i = 0; i < abs.length; i++) {
            for (int j = 0; j < abs.length; j++) {
                if (abs[i] == numlist[j] - n) {
                    answer[i] = numlist[j];
                    break;
                    
                } else if (abs[i] == n - numlist[j]) {
                    answer[i] = numlist[j];
                }
                // } else if (abs[i] == Math.abs(n-numlist[j])) {
                //     answer[i] = numlist[j];
                // }
            }
            if (i != 0 && abs[i] == abs[i-1]) {
                answer[i] = n - abs[i];
            }
        }
        
                
        
        return answer;
    }
}