class Solution {
    public int solution(int a, int b) {
        String ab = String.valueOf(a) + String.valueOf(b);
        String ba = String.valueOf(b) + String.valueOf(a);
        int answer = (Integer.parseInt(ab) >= Integer.parseInt(ba)) ? Integer.parseInt(ab) : Integer.parseInt(ba);
        return answer;
    }
}