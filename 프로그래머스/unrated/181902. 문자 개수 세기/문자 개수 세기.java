class Solution {
    public int[] solution(String my_string) {
        int[] answer = new int[52];
        char[] arr = my_string.toCharArray();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] -0 <= 90) {
                answer[arr[i] - 0 - 65]++;
            } else if (arr[i] - 0 > 90) {
                answer[arr[i] - 0 - 71]++;
            }
        }
        return answer;
    }
}