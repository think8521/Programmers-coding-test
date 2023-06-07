class Solution {
    public int[] solution(int[] numbers, int num1, int num2) {
        int[] number = new int[num2-num1+1];
        int answer[];
        int a = 0;
        for (int i=num1; i <= num2; i++) {
            number[a] = numbers[i];
            a++;
        }
        answer = number;
        return answer;
    }
}