class Solution {
    public int solution(int num) {
        int answer = 0;
        long num2 = (long) num;
        
        while (num2 > 1) {
            if (num2%2==0) {
                num2 = num2/2;
                answer++;
            } else {
                num2 = num2 * 3 + 1;
                answer++;
            }
            if (answer == 500) {
                answer = -1;
                return answer;
            }
        }
        
        // if (answer >= 500) {
        //     answer = -1;
        // }
        
        return answer;
    }
}