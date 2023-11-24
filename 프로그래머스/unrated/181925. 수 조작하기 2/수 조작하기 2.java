class Solution {
    public String solution(int[] numLog) {
        String answer = "";
        int before = numLog[0];
        for (int i = 1; i < numLog.length; i++) {
            switch (numLog[i]-before) {
                case 1: answer += "w";
                    break;
                case -1: answer += "s";
                    break;
                case 10: answer += "d";
                    break;
                case -10: answer += "a";
                    break;
            }
            before = numLog[i];
        }
        return answer;
    }
}