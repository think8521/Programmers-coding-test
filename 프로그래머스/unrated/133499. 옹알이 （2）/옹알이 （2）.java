class Solution {
    public int solution(String[] babbling) {
        int answer = 0;
        String[] babbles = {"aya", "ye", "woo", "ma"};
        
        for (String babble : babbling) {
            for (int i = 0; i < 4; i++) {
                if (babble.contains(babbles[i]) && !babble.contains(babbles[i] + babbles[i])) {
                    babble = babble.replace(babbles[i], " ");
                }
            }
            if (babble.replace(" ", "").length() == 0) {
                answer++;
            }
        }
        
        return answer;
    }
}