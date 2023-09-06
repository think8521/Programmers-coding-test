class Solution {
    public String solution(String[] survey, int[] choices) {
        String answer = "";
        
        char[][] arr = {{'R', 'T'}, {'C', 'F'}, {'J', 'M'}, {'A', 'N'}};
        int[][] count = {{0, 0},{0, 0},{0, 0},{0, 0}};
        
        for (int i = 0; i < choices.length; i++) {
            if (choices[i] < 4) {
                for (int j = 0; j < 4; j++) {
                    for (int k = 0; k < 2; k++) {
                        if (survey[i].charAt(0) == arr[j][k]) {
                            count[j][k] += 4 - choices[i];
                        }
                    }
                }
            } else if (choices[i] > 3) {
                for (int j = 0; j < 4; j++) {
                    for (int k = 0; k < 2; k++) {
                        if (survey[i].charAt(1) == arr[j][k]) {
                            count[j][k] += choices[i] - 4;
                        }
                    }
                }
            }
        }
        
        for (int i = 0; i < 4; i++) {
            if (count[i][0] >= count[i][1]) {
                answer = answer + arr[i][0];
            } else {
                answer = answer + arr[i][1];
            }
        }
        
        
        
        return answer;
    }
}