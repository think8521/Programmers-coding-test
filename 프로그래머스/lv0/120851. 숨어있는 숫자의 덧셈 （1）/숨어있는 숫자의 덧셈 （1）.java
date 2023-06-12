class Solution {
    public int solution(String my_string) {
        int answer = 0;
        
        int [] my = new int[my_string.length()];
        for (int i =0; i < my_string.length(); i++) {
            my[i] = my_string.charAt(i)-'0';
            if (my[i] > 0 && my[i] <10) {
                answer += my[i];
            }
        }
        return answer;
    }
}