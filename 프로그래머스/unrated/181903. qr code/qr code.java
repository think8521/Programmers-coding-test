class Solution {
    public String solution(int q, int r, String code) {
        StringBuilder str = new StringBuilder();
        char[] arr = code.toCharArray();
        for (int i = 0; i < code.length(); i++) {
            if (i%q == r) {
                str.append(arr[i]);
            }
        }
        String answer = str.toString();
        return answer;
    }
}