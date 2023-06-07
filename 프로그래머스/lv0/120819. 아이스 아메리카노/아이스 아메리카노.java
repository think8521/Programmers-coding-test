class Solution {
    public int[] solution(int money) {
        int[] answer = new int [2];
        int a;
        int b;
        if (money >= 5500) {
            a = money/5500;
            b = money%5500;
        } else {
            a = 0;
            b = money;
        }
        answer[0] = a;
        answer[1] = b;
        return answer;
    }
}