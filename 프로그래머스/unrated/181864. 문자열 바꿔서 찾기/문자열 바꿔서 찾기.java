class Solution {
    public int solution(String myString, String pat) {
        int answer = (myString.replace("A", "C").replace("B", "A").replace("C", "B").contains(pat)) ? 1 : 0;
        return answer;
    }
}