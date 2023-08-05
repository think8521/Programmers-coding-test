class Solution {
    public int[] solution(String s) {
        int[] answer = new int[s.length()];
        
        StringBuilder str = new StringBuilder();
        
        for (int i = 0; i < s.length(); i++) {
            if (!str.toString().contains(String.valueOf(s.charAt(i)))) {
                answer[i] = -1;
            } else {
                for (int j = 0; j < str.length(); j++) {
                    if (str.charAt(j) == s.charAt(i)) {
                        answer[i] = i - j;
                    }
                }
            }
            str.append(s.charAt(i));
        }
        
        return answer;
    }
}