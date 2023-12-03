class Solution {
    public int solution(String myString, String pat) {
        StringBuilder str = new StringBuilder();
        int answer = 0;
        for (char c : myString.toCharArray()) {
            str.append(c);
            answer += (str.toString().endsWith(pat)) ? 1 : 0;
        }
        
        return answer;
    }
}