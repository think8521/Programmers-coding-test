class Solution {
    public int solution(String number) {
        int answer = 0;
        for (char a : number.toCharArray()) {
            answer += a - '0';
        }
        return answer % 9;
    }
}