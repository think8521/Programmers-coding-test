class Solution {
    public String solution(String my_string, int[][] queries) {
        String answer = my_string;
        StringBuilder str = new StringBuilder();
        
        for (int i = 0; i < queries.length; i++) {
            str.append(answer.substring(queries[i][0], queries[i][1]+1)).reverse();
            answer = answer.substring(0, queries[i][0]) + str.toString() + answer.substring(queries[i][1]+1, answer.length());
            str.setLength(0);
            // System.out.println(answer);
        }
        return answer;
    }
}