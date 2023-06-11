class Solution {
    public int solution(int[] numbers) {
        int answer=0;
        int a = 0;
        int b = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (a < numbers[i]) {
                a = numbers[i];
            } 
            for (int j = 0; j < numbers.length; j++) {
                if (b < numbers[j] && numbers[j] < numbers[i]) {
                    b = numbers[j];
                }
            }
        }
        if (numbers[0]==numbers[1]&&numbers[0]==a) {
            b = numbers[1];
        }
        answer = a*b;
        return answer;
    }
}