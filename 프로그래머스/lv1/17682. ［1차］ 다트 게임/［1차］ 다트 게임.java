class Solution {
    public int solution(String dartResult) {
        
        StringBuilder str = new StringBuilder();

        for (int i =0; i < dartResult.length()-1; i++) {
            str.append(dartResult.charAt(i));
            if (!Character.isDigit(dartResult.charAt(i)) && 
                Character.isDigit(dartResult.charAt(Math.min(i+1, dartResult.length()-1)))) {
                str.append(' ');
            }
        }
        str.append(dartResult.charAt(dartResult.length()-1));
            
        String[] scores = str.toString().split(" ");
        int[] result = new int[3];
        
        for (int i = 0; i < 3; i++) {
            if (scores[i].charAt(0) == '1' && scores[i].charAt(1) == '0') {
                result[i] = 10;
            } else {
                result[i] = scores[i].charAt(0) - '0';
            }
            
            for (int j = 0; j < scores[i].length(); j++) {
                if (scores[i].charAt(j) == 'D') {
                    result[i] = result[i] * result[i];
                } else if (scores[i].charAt(j) == 'T') {
                    result[i] = result[i] * result[i] * result[i];
                } else if (scores[i].charAt(j) == '*') {
                    if (i == 0) {
                        result[i] = result[i] * 2;
                    } else {
                        result[i] = result[i] * 2;
                        result[i-1] = result[i-1] * 2;
                    }
                } else if (scores[i].charAt(j) == '#') {
                     result[i] = 0 - result[i];
                }
            }
        }
        
        int answer = result[0] + result[1] + result[2];
        return answer;
    }
}