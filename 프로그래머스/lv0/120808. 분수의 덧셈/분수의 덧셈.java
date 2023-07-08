class Solution {
    public int[] solution(int numer1, int denom1, int numer2, int denom2) {
        int[] answer = new int[2];
        
        int numer3 = numer1 * denom2 + numer2 * denom1;
        int denom3 = denom1 * denom2;
        
        int i = 1;
        while (i <= Math.min(numer3, denom3)) {
            if (numer3 % i == 0 && denom3 % i == 0) {
                answer[0] = numer3 / i;
                answer[1] = denom3 / i;
            }
                i++;
        }
        
        return answer;
    }
}