class Solution {
    public int solution(int[] numbers, int k) {
        
        int n = numbers.length;
        int answer = 0;
        if ((k*2-1) % n == 0) {
            answer = numbers[(k-1)*2%n];
        } else {
            answer = numbers[(k*2-1)%n-1];
        }
        return answer;
    }
}