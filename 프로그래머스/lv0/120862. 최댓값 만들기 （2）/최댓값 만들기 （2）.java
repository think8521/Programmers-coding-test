class Solution {
    public int solution(int[] numbers) {
        for (int i=0; i< numbers.length; i++) {
            for (int j=i; j<numbers.length; j++) {
                if (numbers[j]<numbers[i]) {
                    int temp = numbers[i];
                    numbers[i] = numbers[j];
                    numbers[j] = temp;
                }
            }
        }
        int minus = numbers[0]*numbers[1];
        int plus = numbers[numbers.length-2]*numbers[numbers.length-1];
        int answer = (plus>minus) ? plus : minus;
        return answer;
    }
}