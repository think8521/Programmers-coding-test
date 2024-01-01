class Solution {
    public String solution(String s) {
        StringBuilder str = new StringBuilder();
        s = s.toLowerCase();
        char[] arr = s.toCharArray();
        for (int i = 0; i < arr.length; i++) {
            if (!Character.isDigit(arr[i]) && arr[i] != ' ') {
                if (arr[Math.max(0, i-1)] == ' ' || i == 0) {
                    arr[i] = (char) (arr[i] - 32);
                }
            }
            str.append(arr[i]);
        }
        String answer = str.toString();
        return answer;
    }
}